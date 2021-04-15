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

import com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest;
import com.michaelbutler.grpc.bankAccount.bankServiceGrpc;
import com.michaelbutler.grpc.payment.GreeterGrpc;
import com.michaelbutler.grpc.payment.GreeterGrpc.GreeterBlockingStub;
import com.michaelbutler.grpc.payment.GreeterGrpc.GreeterStub;
import com.michaelbutler.grpc.payment.paymentAmountReply;
import com.michaelbutler.grpc.payment.paymentAmountRequest;
import com.michaelbutler.grpc.payment.paymentDateReply;
import com.michaelbutler.grpc.payment.paymentDateRequest;

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
import java.awt.event.ActionEvent;
import ClientGUI.reportHelper;

public class PaymentGUI extends JDialog {

	//unfortunately i was unable to register my python server and so was unable to connect to it
	
	private final JPanel contentPanel = new JPanel();
	private JTextField amount;
	private JTextField When;
	
	private static GreeterBlockingStub blockingStub;
	private static GreeterStub asyncStub;
	
	private ServiceInfo paymentServiceInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PaymentGUI dialog = new PaymentGUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

public PaymentGUI() {
	
	//unfortunately i was unable to register my python server and so was unable to connect to it
	
	//String account_service_type = "_bank._tcp.local.";
	//discoverPaymentService(account_service_type);
	
	//String host = paymentServiceInfo.getHostAddresses()[0];
	//int port = paymentServiceInfo.getPort();
	
	//ManagedChannel channel = ManagedChannelBuilder
			//.forAddress(host, port)
			//.usePlaintext()
			//.build();

	//stubs -- generate from proto
	//blockingStub = GreeterGrpc.newBlockingStub(channel);
	//asyncStub = GreeterGrpc.newStub(channel);


	
	initialize();
}
	
	private void discoverPaymentService(String service_type) {
		

		try {
			System.out.println("this far");
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
			System.out.println("this far");
				
			jmdns.addServiceListener(service_type, new ServiceListener() {
				
				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Payment Service resolved: " + event.getInfo());
	
					paymentServiceInfo = event.getInfo();
	
					int port = paymentServiceInfo.getPort();
					
					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:"+ event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + paymentServiceInfo.getNiceTextString());
					System.out.println("\t host: " + paymentServiceInfo.getHostAddresses()[0]);
				
					
				}
				
				@Override
				public void serviceRemoved(ServiceEvent event) {
					System.out.println("Payment Service removed: " + event.getInfo());
	
					
				}
				
				@Override
				public void serviceAdded(ServiceEvent event) {
					System.out.println("Payment Service added: " + event.getInfo());
	
					
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
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new GridLayout(5, 2, 0, 0));
		{
			JLabel lblNewLabel = new JLabel("Amount ");
			contentPanel.add(lblNewLabel);
		}
		{
			amount = new JTextField();
			contentPanel.add(amount);
			amount.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Date as dd/mm/yyy");
			contentPanel.add(lblNewLabel_1);
		}
		{
			When = new JTextField();
			contentPanel.add(When);
			When.setColumns(10);
		}
		{
			JButton btnNewButton = new JButton("Accept");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//button to set the payment

			        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			        String validateDate = "";
					String strAmount = amount.getText() ;
					String date = null;
					
					validateDate = When.getText();;

	                try{        //make sure input is in the correct format 
	                    df.parse(validateDate);
	                    date = validateDate;
	                }
	                catch(Exception a){
	                    System.out.print("This is in the incorrect format, please try again\t");
	                    initialize();
	                }
	                if(!strAmount.matches("[0-9]+")) {
						JOptionPane.showMessageDialog(null, "Invalid number, please try again");
					}
	                else {
	                	int amount = Integer.parseInt(strAmount);         
	                	paymentHelper.setAmount(amount);
	                	paymentHelper.setDate(date);
	                	
	                	paymentAmountRequest req = paymentAmountRequest.newBuilder().setAmount(strAmount).build();
	                	paymentDateRequest req2 = paymentDateRequest.newBuilder().setDate(date).build();
	                	
	                	//paymentAmountReply response = blockingStub.paymentAmount(req);
	                	//paymentDateReply response2 = blockingStub.paymentDate(req2);
	                	
	                	JOptionPane.showMessageDialog(null, "Payment set for: "+amount+ " on: "+date);
	                }
	                
	                
				}
			});
			contentPanel.add(btnNewButton);
		}
		{
			JButton btnNewButton_1 = new JButton("Close");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			contentPanel.add(btnNewButton_1);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
