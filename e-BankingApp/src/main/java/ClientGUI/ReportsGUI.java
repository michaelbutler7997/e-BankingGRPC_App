package ClientGUI;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;

import com.michaelbutler.grpc.report.addReportListReply;
import com.michaelbutler.grpc.report.addReportListRequest;
import com.michaelbutler.grpc.report.fullReportListReply;
import com.michaelbutler.grpc.report.fullReportListRequest;
import com.michaelbutler.grpc.report.reportServiceGrpc;
import com.michaelbutler.grpc.report.reportServiceGrpc.reportServiceBlockingStub;
import com.michaelbutler.grpc.report.reportServiceGrpc.reportServiceStub;
import com.michaelbutler.grpc.report.withdrawReportListReply;
import com.michaelbutler.grpc.report.withdrawReportListRequest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.swing.JList;
import ClientGUI.reportHelper;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;

public class ReportsGUI extends JDialog {

	private static reportServiceBlockingStub blockingStub;
	private static reportServiceStub asyncStub;
	private ServiceInfo reportServiceInfo;
	 
	private List<String> req = reportHelper.getAllReport();
	private List<String> req2 = reportHelper.getAddReport();
	private List<String> req3 = reportHelper.getWithdrawReport();
	private List<String> serverAllReports; 
	private List<String> serverAddReports; 
	private List<String> serverWithdrawReports; 
	private int index;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ReportsGUI dialog = new ReportsGUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
public ReportsGUI() {
	
		String report_service_type = "_bankreport._tcp.local.";
		discoverAccountService(report_service_type);
		
		String host = reportServiceInfo.getHostAddresses()[0];
		int port = reportServiceInfo.getPort();
		
		ManagedChannel channel = ManagedChannelBuilder
				.forAddress(host, port)
				.usePlaintext()
				.build();

		//stubs -- generate from proto
		blockingStub = reportServiceGrpc.newBlockingStub(channel);
		asyncStub = reportServiceGrpc.newStub(channel);

		
		initialize();
	}
	
	private void discoverAccountService(String service_type) {
		
		
		try {
			// Create a JmDNS instance
			JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
	
				
			jmdns.addServiceListener(service_type, new ServiceListener() {
				
				@Override
				public void serviceResolved(ServiceEvent event) {
					System.out.println("Report Service resolved: " + event.getInfo());
	
					reportServiceInfo = event.getInfo();
	
					int port = reportServiceInfo.getPort();
					
					System.out.println("resolving " + service_type + " with properties ...");
					System.out.println("\t port: " + port);
					System.out.println("\t type:"+ event.getType());
					System.out.println("\t name: " + event.getName());
					System.out.println("\t description/properties: " + reportServiceInfo.getNiceTextString());
					System.out.println("\t host: " + reportServiceInfo.getHostAddresses()[0]);
				
					
				}
				
				@Override
				public void serviceRemoved(ServiceEvent event) {
					System.out.println("Report Service removed: " + event.getInfo());
	
					
				}
				
				@Override
				public void serviceAdded(ServiceEvent event) {
					System.out.println("Report Service added: " + event.getInfo());
	
					
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
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{

				JButton btnNewButton_2 = new JButton("All Reports");
				btnNewButton_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						String reqAsString = String.join(",", req);
						//for getting all deposits and withdrawals from the account 
						System.out.println("printing arraylist  "+req);
	
						fullReportListRequest gimme = fullReportListRequest.newBuilder().setReport(reqAsString).build();
						
						fullReportListReply response = blockingStub.fullReportList(gimme);
						
						String strAllReports = response.getRReport();
						System.out.println("As String******"+ strAllReports);
						
						serverAllReports = new ArrayList<String>(Arrays.asList(strAllReports.split(",")));
						
						
						System.out.println("ALL REPORT******"+serverAllReports);
						
						index = 1;
						initialize();
						
					}	
					
					
				});
				buttonPane.add(btnNewButton_2);
			}
			{
				JButton btnNewButton_1 = new JButton("Deposit Reports");
				btnNewButton_1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						//
						String reqAsString = String.join(",", req2);
						
						System.out.println("printing arraylist  "+req2);
	
						addReportListRequest gimme = addReportListRequest.newBuilder().setReport(reqAsString).build();
						
						addReportListReply response = blockingStub.addReportList(gimme);
						
						String strAddReports = response.getRReport();
						System.out.println("As String******"+ strAddReports);
						
						serverAddReports = new ArrayList<String>(Arrays.asList(strAddReports.split(",")));

						index = 2;
						initialize();
					}
				});
				buttonPane.add(btnNewButton_1);
			}
			{
				JButton btnNewButton = new JButton("Withdrawal Reports");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						
						String reqAsString = String.join(",", req3);
						
						System.out.println("printing arraylist  "+req3);
	
						withdrawReportListRequest gimme = withdrawReportListRequest.newBuilder().setReport(reqAsString).build();
						
						withdrawReportListReply response = blockingStub.withdrawReportList(gimme);
						
						String strAWithdraReports = response.getRReport();
						System.out.println("As String******"+ strAWithdraReports);
						
						serverWithdrawReports = new ArrayList<String>(Arrays.asList(strAWithdraReports.split(",")));
						
						
						System.out.println("WITHDRAW REPORT******"+serverAllReports);
						index = 3;
						initialize();
					}
				});
				buttonPane.add(btnNewButton);
			}
		}
		{
			//populate arraylist with reports
			DefaultListModel<String> listModel = new DefaultListModel<String>();
			JList<String> list = new JList<String>();
			list.setVisibleRowCount(15);
			getContentPane().add(list, BorderLayout.CENTER);
			if(index == 1) {
				for (int i = 0; i < serverAllReports.size(); i++)
				{
				    listModel.addElement(serverAllReports.get(i));
				}
				list.setModel(listModel);
			}
			else if(index == 2) {
				for (int i = 0; i < serverAddReports.size(); i++)
				{
				    listModel.addElement(serverAddReports.get(i));
				}
				list.setModel(listModel);
			}
			
			else if(index == 3) {
				for (int i = 0; i < serverWithdrawReports.size(); i++)
				{
				    listModel.addElement(serverWithdrawReports.get(i));
				}
				list.setModel(listModel);
			}
		}
	}

}
