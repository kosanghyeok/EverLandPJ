package EVERLANDPROJECT;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class EverlandMain {
	public static int addOrder = 0, Prior;
	public static String ticketType, registNumber;
	public static void main(String[] args) {
		
		EverlandProcess everProcess = new EverlandProcess(); 
		ArrayListControlClass everArray = new ArrayListControlClass();
		everProcess.whatToday();
      while(true) {
    	  everArray.clearALL();
      do {
    	  everProcess.inputDate();
    	  everProcess.Pricetag();
    	  System.out.println(ticketType);
  		  System.out.println("��");
  		everProcess.putID();
  		  if (registNumber.equals("0")) {continue;}
  		everProcess.HowBirth();
  		everProcess.ManyCount();
  		everProcess.choosePrior();
  		  if(Prior == 0) {continue;}
  		  System.out.println("��");
  		everProcess.moreORnot();
  		 everArray.Arrayadd(everProcess.ticketType, everProcess.age,
  				  			everProcess.Count, everProcess.Price, everProcess.b);
		  System.out.println("�����մϴ�.");
	      System.out.println("=============== �������� =================");
      	}while(addOrder == 1);
      everArray.Result();   
  		 break;
      }
     
	}

}
