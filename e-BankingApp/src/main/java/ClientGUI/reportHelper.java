package ClientGUI;

import java.util.ArrayList;

public class reportHelper {
	public static  ArrayList<String> allReports=new ArrayList<String>();
	public static  ArrayList<String> addReports=new ArrayList<String>();
	public static  ArrayList<String> withdrawReports=new ArrayList<String>();
	
	public static void setAllReport(ArrayList<String> allReport) {
		allReports = allReport;
	}
	
	public static ArrayList<String> getAllReport() {
		return allReports;
	}
	
	public static void setAddReport(ArrayList<String> addReport) {
		addReports = addReport;
	}
	
	public static ArrayList<String> getAddReport() {
		return addReports;
	}
	
	public static void setWithdrawReport(ArrayList<String> withdrawReport) {
		withdrawReports = withdrawReport;
	}
	
	public static ArrayList<String> getWithdrawReport() {
		return withdrawReports;
	}
	
	
}
