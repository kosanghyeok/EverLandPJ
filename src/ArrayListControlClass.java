package EVERLANDPROJECT;

import java.util.ArrayList;

public class ArrayListControlClass {
	
	

	public ArrayList <DataClass> arrData = new ArrayList<DataClass>(); 
	

		
	
	public void Arrayadd(String ticketType, String age, int Count, int Price, String b, String isEventCoupon) {
		DataClass item = new DataClass();
		item.ticketType = ticketType;
		item.Count = Count;
		item.Price = Price;
		item.age = age;
		item.b = b;
		item.isEventCoupon = isEventCoupon;
		arrData.add(item);
		
		
	}
	
	
	public void Result() {
		int totalPrice = 0;
		for(int index = 0; index < arrData.size(); index++) {
			totalPrice += arrData.get(index).Price * arrData.get(index).Count;}
		System.out.println("가격은" +totalPrice +"원입니다. \n감사합니다.");
		System.out.println("================ 에버랜드 ================");
		
		
		for(int index = 0; index < arrData.size(); index++) {
		
	      System.out.printf("%s  %s  X  %d  %d  %s\n", arrData.get(index).ticketType, arrData.get(index).age,
	    		  			arrData.get(index).Count, arrData.get(index).Price * arrData.get(index).Count, 
	    		  			arrData.get(index).b, arrData.get(index).isEventCoupon);
		}
	System.out.println("========================================");
	}
	
	
	
	
}
