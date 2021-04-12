package com.michaelbutler.grpc.bankAccount;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Properties;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.util.Date;
import com.michaelbutler.grpc.bankAccount.addWithdrawFundsRequest.Operation;
import com.michaelbutler.grpc.bankAccount.bankServiceGrpc.bankServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class bankAccountServer extends bankServiceImplBase {
	
	private ArrayList<String> allReport=new ArrayList<String>();
	private ArrayList<String> addReport=new ArrayList<String>();
	private ArrayList<String> withdrawReport=new ArrayList<String>();
	private SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");

	public static void main(String[] args) {
		
		bankAccountServer bankServer = new bankAccountServer();

		Properties prop = bankServer.getProperties();
		
		bankServer.registerService(prop);
		
		int port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;

		try {

			Server server = ServerBuilder.forPort(port)
					.addService(bankServer)
					.build()
					.start();

			System.out.println("bankAccountServer, listening on " + port);

			server.awaitTermination();


		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
private Properties getProperties() {
		
		Properties prop = null;		
		
		 try (InputStream input = new FileInputStream("src/main/resources/bankAccount.properties")) {

	            prop = new Properties();

	            // load a properties file
	            prop.load(input);

	            // get the property value and print it out
	            System.out.println("Bank Server properies ...");
	            System.out.println("\t service_type: " + prop.getProperty("service_type"));
	            System.out.println("\t service_name: " +prop.getProperty("service_name"));
	            System.out.println("\t service_description: " +prop.getProperty("service_description"));
		        System.out.println("\t service_port: " +prop.getProperty("service_port"));

	        } catch (IOException ex) {
	            ex.printStackTrace();
	        }
	
		 return prop;
	}

private  void registerService(Properties prop) {
	
	 try {
           // Create a JmDNS instance
           JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());
           
           String service_type = prop.getProperty("service_type") ;//"_http._tcp.local.";
           String service_name = prop.getProperty("service_name")  ;// "example";
          // int service_port = 1234;
           int service_port = Integer.valueOf( prop.getProperty("service_port") );// #.50051;

           
           String service_description_properties = prop.getProperty("service_description")  ;//"path=index.html";
           
           // Register a service
           ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port, service_description_properties);
           jmdns.registerService(serviceInfo);
           
           System.out.printf("registrering service with type %s and name %s \n", service_type, service_name);
           
           // Wait a bit
           Thread.sleep(1000);

           // Unregister all services
           //jmdns.unregisterAllServices();

       } catch (IOException e) {
           System.out.println(e.getMessage());
       } catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   
}
	
	//for unary rpc
@Override
	public void accountBalance(accountBalanceRequest request,
	        StreamObserver<accountBalanceReply> responseObserver) {
	
	System.out.println("Receiving Balance Request" + request.getBalance());
	accountBalanceReply reply = accountBalanceReply.newBuilder().setRBalance("Balance Request Test" + request.getBalance()).build();
	
	responseObserver.onNext(reply);
	//Server notifies that it has completed processing 
	responseObserver.onCompleted();
	
}

	public void addWithdrawFunds(addWithdrawFundsRequest request,
			StreamObserver<addWithdrawFundsReply> responseObserver) {
		
		Date date = new Date();
		System.out.println("Transaction is " + "balance: " + request.getBalance() + " " + request.getOperation() );

		float value = Float.NaN;
		String msg= "ok " + request.getOperation().name() + " result ";

		if(	request.getOperation()== Operation.ADD) {
			value = request.getBalance() + request.getTransaction();
		
			allReport.add(value + formatter.format(date));
			addReport.add(value + formatter.format(date));
		}
		
		else if(	request.getOperation()== Operation.WITHDRAW) {
			value = request.getBalance() - request.getTransaction();
			
			allReport.add(formatter.format(date) + "   " +value );
			withdrawReport.add(formatter.format(date) + "   " +value );
		}
			
		else{
			value = Float.NaN;
			msg = "no supported/implemented operation";
		}		

		addWithdrawFundsReply reply = addWithdrawFundsReply.newBuilder().setNewBalance(value).setMessage(msg).build();

		responseObserver.onNext(reply);

		responseObserver.onCompleted();
	}
		
}


