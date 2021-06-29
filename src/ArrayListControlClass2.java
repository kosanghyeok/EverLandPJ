package EVERLANDPROJECT;

import java.util.ArrayList;

public class ArrayListControlClass {
	
	
	public ArrayList<String> arrTicket = new ArrayList<String>();
	public ArrayList<String> arrAge = new ArrayList<String>();
	public ArrayList<Integer> arrCount = new ArrayList<Integer>();
	public ArrayList<Integer> arrPrice = new ArrayList<Integer>();
	public ArrayList<String> arrb = new ArrayList<String>();
	
	public void clearALL() {
		   arrTicket.clear();
	  	  	arrAge.clear();
	  	  	arrCount.clear();
	  	  	arrPrice.clear();
	  	  	arrb.clear(); }
	
	public void Arrayadd(String ticketType, String age, int Count, int Price, String b) {
		arrTicket.add(ticketType);
		arrAge.add(age);
		arrCount.add(Count);
		arrPrice.add(Price);
		arrb.add(b);
	
	}
	
	public void Result() {
	for(int index = 0; index < arrTicket.size(); index++) {
	      System.out.printf("%s  %s  X  %d  %d  %s\n", arrTicket.get(index), arrAge.get(index),
	    		  			arrCount.get(index), arrCount.get(index)*arrPrice.get(index), arrb.get(index));
		}
	System.out.println("========================================");
	}
	
	
	
	
}
