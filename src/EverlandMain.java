package EVERLANDPROJECT;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class EverlandMain {
	
	public static void main(String[] args) {
		
		EverlandProcess everProcess = new EverlandProcess(); 
		ArrayListControlClass everArray = new ArrayListControlClass();
		everProcess.whatToday();
	
		
	while(true) {
		 everArray.clearALL();
	 do {
    	  everProcess.inputDate();
    	  everProcess.Pricetag();
    	  System.out.println(everProcess.ticketType);
  		  System.out.println("��");
  		  everProcess.putID();
  		  if (everProcess.registNumber.equals("0")) {continue;}
  		  everProcess.HowBirth();
  		  everProcess.ManyCount();
  		  everProcess.choosePrior();
  		  if(everProcess.Prior == 0) {continue;}
  		  System.out.println("��");
  		  everProcess.moreORnot();
  		  everArray.Arrayadd(everProcess.ticketType, everProcess.age,
  				  			everProcess.Count, everProcess.Price, everProcess.b);
		  System.out.println("�����մϴ�.");
	      System.out.println("=============== �������� =================");
      	}while(everProcess.addOrder == 1);
      	  everArray.Result();   
      	  break;
	}
     
}

}
