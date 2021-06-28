
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
      
      System.out.println("이용날짜를 입력해주세요. ex)20210605 ");
      putDate=myInput.nextInt();
      
      if(putDate == 20210904 || putDate == 20210905 || putDate == 20210911 || putDate == 20210912 
    		  || putDate == 20210918 ||putDate == 20210920 || putDate == 20210921 || putDate == 20210922 || 
    		  putDate == 20210925 || putDate == 20210926) {
	ticketType = "A티켓" ;
	} 

	   else if(putDate == 20210903 || putDate == 20210906 || putDate == 20210907 || putDate == 20210908 || putDate == 20210909 ||
        putDate == 20210910 || putDate == 20210913 || putDate == 20210914 || putDate == 20210915 || putDate == 20210916 ||
        putDate == 20210917 || putDate == 20210923 || putDate == 20210924 || putDate == 20210927 || putDate == 20210928 ||
        putDate == 20210929 || putDate == 20210930) {
	ticketType = "B티켓";
        } 

      else if(putDate == 20210901 || putDate == 20210902)  {
	ticketType = "C티켓";
	} 

      
      switch(ticketType) {
    	  case "A티켓" : middlePrice = 60000; break;
    	  case "B티켓" : middlePrice = 56000; break;
    	  case "C티켓" : middlePrice = 50000; break;
      }
      

      System.out.println("주민번호 앞자리를 입력하세요. ex) 880425 ");
      registNumber = myInput.nextInt();
      
      
      
           
      
      System.out.println("몇개를 주문하시겠습니까?  ");
      Count = myInput.nextInt();
      System.out.println("우대사항을 선택하세요. ");
      System.out.println("1. 없음 (나이 우대는 자동처리) \n");
      System.out.println("2. 장애인 \n");
      System.out.println("3. 국가유공자 \n");
      System.out.println("4. 다자녀 \n");
      System.out.println("5. 임산부 \n");
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
      System.out.printf("가격은 %d원 입니다. \n", Sum);
      System.out.println("감사합니다.");
      
      System.out.println("=============== 에버랜드 =================");
      System.out.printf("%s   어른 X %d    %d원   *%d 적용 \n", ticketType, Count, Sum, PriorCount);
      System.out.println("========================================");
      
      
      
      
   }

}
