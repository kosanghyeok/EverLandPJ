
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class everland {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

Scanner myInput = new Scanner(System.in) ;
      
      
      int putDate;
      int registNumber;
      int Count;
      int PriorCount;
      int Price;
      String ticketType = null;
      int middlePrice = 0;
      
      System.out.println("�̿볯¥�� �Է����ּ���. ex)20210605 ");
      putDate=myInput.nextInt();
      
      if(putDate == 20210904 || putDate == 20210905 || putDate == 20210911 || putDate == 20210912 
    		  || putDate == 20210918 ||putDate == 20210920 || putDate == 20210921 || putDate == 20210922 || 
    		  putDate == 20210925 || putDate == 20210926) {
	ticketType = "AƼ��" ;
	} 

	   else if(putDate == 20210903 || putDate == 20210906 || putDate == 20210907 || putDate == 20210908 || putDate == 20210909 ||
        putDate == 20210910 || putDate == 20210913 || putDate == 20210914 || putDate == 20210915 || putDate == 20210916 ||
        putDate == 20210917 || putDate == 20210923 || putDate == 20210924 || putDate == 20210927 || putDate == 20210928 ||
        putDate == 20210929 || putDate == 20210930) {
	ticketType = "BƼ��";
        } 

      else if(putDate == 20210901 || putDate == 20210902)  {
	ticketType = "CƼ��";
	} 

      
      switch(ticketType) {
    	  case "AƼ��" : middlePrice = 60000; break;
    	  case "BƼ��" : middlePrice = 56000; break;
    	  case "CƼ��" : middlePrice = 50000; break;
      }
      

      System.out.println("�ֹι�ȣ ���ڸ��� �Է��ϼ���. ex) 880425 ");
      registNumber = myInput.nextInt();
      
      
      
           
      
      System.out.println("��� �ֹ��Ͻðڽ��ϱ�?  ");
      Count = myInput.nextInt();
      System.out.println("�������� �����ϼ���. ");
      System.out.println("1. ���� (���� ���� �ڵ�ó��) \n");
      System.out.println("2. ����� \n");
      System.out.println("3. ���������� \n");
      System.out.println("4. ���ڳ� \n");
      System.out.println("5. �ӻ�� \n");
      PriorCount = myInput.nextInt();
      
      
      
      int finalPrice = 0;
      int middlePrice40 = middlePrice * 60  / 100;
      int middlePrice50 = middlePrice * 50 / 100;
      int middlePrice20 = middlePrice * 80 / 100;
      int middlePrice15 = middlePrice * 85 / 100;
      
      switch(PriorCount) {
	  case 1 : finalPrice = middlePrice; break;
	  case 2 : finalPrice = middlePrice40 ; break;
	  case 3 : finalPrice = middlePrice50; break;
	  case 4 : finalPrice = middlePrice20; break;
	  case 5 : finalPrice = middlePrice15; break;
	  
	  
  }
  
      
     


      int Sum   ;
      Sum = Count * finalPrice ;
      System.out.printf("������ %d�� �Դϴ�. \n", Sum);
      System.out.println("�����մϴ�.");
      
      System.out.println("=============== �������� =================");
      System.out.printf("%s   � X %d    %d��   *%d ���� \n", ticketType, Count, Sum, PriorCount);
      System.out.println("========================================");
      
      
      
      
   }

}
