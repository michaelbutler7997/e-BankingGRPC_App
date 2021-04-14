package ClientGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.michaelbutler.grpc.bankAccount.addWithdrawFundsReply;
import com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest;
import com.michaelbutler.grpc.bankAccount.bankServiceGrpc;
import com.michaelbutler.grpc.bankAccount.bankServiceGrpc.bankServiceBlockingStub;
import com.michaelbutler.grpc.bankAccount.bankServiceGrpc.bankServiceStub;

import com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest.Operation;
import com.michaelbutler.grpc.bankAccount.bankAccountServer;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.awt.event.ActionEvent;

public class AccountGUI extends JDialog {

	
	
	private static bankServiceBlockingStub blockingStub;
	private static bankServiceStub asyncStub;

	private ServiceInfo accountServiceInfo;
	
	private final JPanel contentPanel = new JPanel();
	private JTextField balance;
	private JTextField amount;
	
	public  ArrayList<String> allReport=new ArrayList<String>();
	public  ArrayList<String> addReport=new ArrayList<String>();
	public  ArrayList<String> withdrawReport=new ArrayList<String>();
	
	public  ArrayList<String> oldAllReport=new ArrayList<String>();
	public  ArrayList<String> oldAddReport=new ArrayList<String>();
	public  ArrayList<String> oldWithdrawReport=new ArrayList<String>();
	
	public SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			AccountGUI dialog = new AccountGUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public AccountGUI() {
		
		String account_service_type = "_bank._tcp.local.";
		discoverAccountService(account_service_type);
		
		String host = accountServiceInfo.getHostAddresses()[0];
		int port = accountServiceInfo.getPort();
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = bankServiceGrpc.newBlockingStub(channel);
		asyncStub = bankServiceGrpc.newStub(channel);

		
		initialize();
	}
	
	
private void discoverAccountService(String service_type) {
	
	
	try {
		// Create a JmDNS instance
		JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

			
		jmdns.addServiceListener(service_type, new ServiceListener() {
			
			@Override
			public void serviceResolved(ServiceEvent event) {
				System.out.println("Account Service resolved: " + event.getInfo());

				accountServiceInfo = event.getInfo();

				int port = accountServiceInfo.getPort();
				
				System.out.println("resolving " + service_type + " with properties ...");
				System.out.println("\t port: " + port);
				System.out.println("\t type:"+ event.getType());
				System.out.println("\t name: " + event.getName());
				System.out.println("\t description/properties: " + accountServiceInfo.getNiceTextString());
				System.out.println("\t host: " + accountServiceInfo.getHostAddresses()[0]);
			
				
			}
			
			@Override
			public void serviceRemoved(ServiceEvent event) {
				System.out.println("Math Service removed: " + event.getInfo());

				
			}
			
			@Override
			public void serviceAdded(ServiceEvent event) {
				System.out.println("Math Service added: " + event.getInfo());

				
			}
		});
		
		// Wait a bit
		Thread.sleep(2000);
		
		jmdns.close();

	} catch (UnknownHostException e) {
		System.out.println(e.getMessage());
	} catch (IOException e) {
		System.out.println(e.getMessage());
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
	
	/**
	 * Create the dialog.
	 * @return 
	 */

	public void initialize() {
		
		addWithdrawFundsRequest req = new addWithdrawFundsRequest();
		String strBalance = String.valueOf(req.getBalance());
		
		
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(5, 2, 0, 0));
		{
			JLabel lblNewLabel = new JLabel("Account Balance");
			contentPanel.add(lblNewLabel);
		}
		{
			balance = new JTextField();
			balance.setEditable(false);
			balance.setText(strBalance);
			contentPanel.add(balance);
			balance.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Amount");
			contentPanel.add(lblNewLabel_1);
		}
		{
			amount = new JTextField();
			contentPanel.add(amount);
			amount.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Deposit");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//deposits money to the account 
					int num1 = req.getBalance();
					String strNum2 = amount.getText();
					Date date = new Date();
					
					if(!strNum2.matches("[0-9]+")) {
						JOptionPane.showMessageDialog(null, "Invalid number, please try again");
					}
					else {
						int num2 = Integer.parseInt(strNum2);
						int index = 0;
						Operation operation = Operation.forNumber(index);
						System.out.println(operation);
						
						addWithdrawFundsRequest req = addWithdrawFundsRequest.newBuilder().setBalance(num1).setTransaction(num2).setOperation(operation).build();
	
						addWithdrawFundsReply response = blockingStub.addWithdrawFunds(req);
	
						String newBalance = Integer.toString(response.getNewBalance());
						
						allReport.add(formatter.format(date) +"____Transaction:"+" " +num2 +"," );
						addReport.add(formatter.format(date) +"____Transaction:"+" " +num2 +"," );
						
						System.out.println("all reports this is: "+ allReport);
						System.out.println("Add reports this is: "+ addReport);
						
						balance.setText(newBalance);
						amount.setText(null);
						
						System.out.println(response.getNewBalance());
					}	
				}
			});
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("Withdraw");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					//withdraws from account
					int num1 = req.getBalance();
					String strNum2 = amount.getText();
					Date date = new Date();
					
					if(!strNum2.matches("[0-9]+")) {
						JOptionPane.showMessageDialog(null, "Invalid number, please try again");
					}
					else {
						int num2 = Integer.parseInt(strNum2);
						int index = 1;
						Operation operation = Operation.forNumber(index);
						
						addWithdrawFundsRequest req = addWithdrawFundsRequest.newBuilder().setBalance(num1).setTransaction(num2).setOperation(operation).build();
	
						addWithdrawFundsReply response = blockingStub.addWithdrawFunds(req);
	
						String newBalance = Integer.toString(response.getNewBalance());
						
						
						allReport.add(formatter.format(date) + "____Transaction:"+" -" +num2+"," );
						withdrawReport.add(formatter.format(date) + "____Transaction:"+" -" +num2 +"," );
						
						System.out.println("all reports this is: "+ allReport);
						System.out.println("W reports this is: "+ withdrawReport);
						
						balance.setText(newBalance);
						amount.setText(null);
						
						System.out.println(response.getNewBalance());
					}
					
				}
			});
			
			//updating arraylists so that they dnt't keep getting overwritten
			oldAllReport = reportHelper.getAllReport();
			allReport.addAll(oldAllReport);
			oldAddReport = reportHelper.getAddReport();
			addReport.addAll(oldAddReport);
			oldWithdrawReport = reportHelper.getWithdrawReport();
			withdrawReport.addAll(oldWithdrawReport);
			
			reportHelper.setAllReport(allReport);
			reportHelper.setAddReport(addReport);
			reportHelper.setWithdrawReport(withdrawReport);

			contentPanel.add(btnNewButton_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
