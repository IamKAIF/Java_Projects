import java.util.*;

public class AirlinesTicket {

    public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);

        int day, month, board, dest, time, pass, pay;
		long con;
        String mail; 
        String onboardtime = "";
        String names[] = new String[80];
        

  
		System.out.println("\n*-----------------------------------------------------------------*");

		System.out.println("*------------------NITHIN AIRLINES WELCOMES YOU!------------------*");

		System.out.println("*-----------------------------------------------------------------*\n");

		System.out.println("                   BOOK YOUR TICKETS RIGHT AWAY! \n");

        while(true){

            System.out.println("\n--------------------SELECT YOUR BOARDING POINT-------------------- \n");

            System.out.println("1. BANGLORE        2. CHATTISGARH         3. DELHI  \n");

            System.out.println("4. GOA             5. HARYANA             6. MUMBAI  \n");
            
            System.out.print("ENTER YOUR CHOICE (1-6) : ");

            board = sc.nextInt();

            if(board>6 || board<1){

                System.out.println("\n------[ERROR] INVALID INPUT!------");
                continue;
            }

		    System.out.print("\n[---NOTICE!---] YOU HAVE SELECTED ");

            switch(board){

                case 1 : System.out.print("BANGLORE");
                break;
                
                case 2 : System.out.print("CHATTISGARH");
                break;
                
                case 3 : System.out.print("DELHI");
                break;
                
                case 4 : System.out.print("GOA");
                break;
                
                case 5 : System.out.print("HARYANA");
                break;
                
                case 6 : System.out.print("MUMBAI");
                break;
            }

		    System.out.println(" AS YOUR BOARDING POINT! ");
            break;
        }

        while(true){

            System.out.println("\n\n-------------------SELECT YOUR DESTINATION POINT------------------  \n");

            switch(board){

                case 1 : {
                          System.out.println("1. --------        2. CHATTISGARH         3. DELHI  \n");

                          System.out.println("4. GOA             5. HARYANA             6. MUMBAI  \n");
                        }
                break;
                
                case 2 : {
                          System.out.println("1. BANGLORE        2. -----------         3. DELHI  \n");

                          System.out.println("4. GOA             5. HARYANA             6. MUMBAI  \n");
                        }
                break;
                
                case 3 : {
                          System.out.println("1. BANGLORE        2. CHATTISGARH         3. -----  \n");

                          System.out.println("4. GOA             5. HARYANA             6. MUMBAI  \n");
                        }
                break;
                
                case 4 : {
                          System.out.println("1. BANGLORE        2. CHATTISGARH         3. DELHI  \n");

                          System.out.println("4. ---             5. HARYANA             6. MUMBAI  \n");
                        }
                break;
                
                case 5 : {
                          System.out.println("1. BANGLORE        2. CHATTISGARH         3. DELHI  \n");

                          System.out.println("4. GOA             5. -------             6. MUMBAI  \n");
                        }
                break;
                
                case 6 : {
                          System.out.println("1. BANGLORE        2. CHATTISGARH         3. DELHI  \n");

                          System.out.println("4. GOA             5. HARYANA             6. -----  \n");
                        }
                break;
            }
            
            System.out.print("ENTER YOUR CHOICE (1-6) : ");

            dest = sc.nextInt();

            if(dest==board){

                System.out.println("\n------[ERROR] BOARDING AND DESTINATION POINT CAN'T BE SAME!------");
                continue;
            }
            
            if(dest>6 || dest<1){

                System.out.println("\n------[ERROR] INVALID INPUT!------");
                continue;
            }

            System.out.print("\n[---NOTICE!---] YOU HAVE SELECTED ");

            switch(dest){

                case 1 : System.out.print("BANGLORE");
                break;
                
                case 2 : System.out.print("CHATTISGARH");
                break;
                
                case 3 : System.out.print("DELHI");
                break;
                
                case 4 : System.out.print("GOA");
                break;
                
                case 5 : System.out.print("HARYANA");
                break;
                
                case 6 : System.out.print("MUMBAI");
                break;
            }

		    System.out.println(" AS YOUR DESTINATION POINT! ");
            break;

        }

        while(true){

            System.out.println("\n\n-----------------------SELECT DATE AND MONTH---------------------- ");

            System.out.print("\nENTER DAY (1 - 31) : ");

            day = sc.nextInt();

            if(day>31 || day<1){

                System.out.println("\n------[ERROR] INVALID INPUT!------");
                continue;
            }

            System.out.print("\nENTER MONTH (1 - 12) : ");
            
            month = sc.nextInt();

            if(month>12 || month<1){

                System.out.println("\n------[ERROR] INVALID INPUT!------");
                continue;
            }

			if(month==2 && (day==31 || day==30)){

                System.out.println("\n------[ERROR] INVALID INPUT!------");
                continue;
            }
            break;

        }

        while(true){

            System.out.println("\n\n------------------FLIGHTS AVAILABLE ON THIS DATE------------------ \n");
                                                             
            System.out.println("1. 10:00          2. 12:00         3. 14:00  \n");

            System.out.println("4. 16:00          5. 18:00         6. 20:00  \n");

            System.out.print("ENTER YOUR TIME SLOT (1-6) :  ");
            
            time = sc.nextInt();

            if(time>6 || time<1){

                System.out.println("\n------[ERROR] INVALID INPUT!------");
                continue;
            }

            System.out.print("\n[---NOTICE!---] YOU HAVE SELECTED ");

            switch(time){

                case 1 : {
                            System.out.print("10:00 TIME SLOT ON DATE : " + day + "/" + month );
                            onboardtime = "10:00";
                        }
                break;
                
                case 2 : {
                            System.out.print("12:00 TIME SLOT ON DATE : " + day + "/" + month  );
                            onboardtime = "12:00";
                        }
                break;
                
                case 3 : {
                            System.out.print("14:00 TIME SLOT ON DATE : " + day + "/" + month );
                            onboardtime = "14:00";
                        }
                break;
                
                case 4 : {
                            System.out.print("16:00 TIME SLOT ON DATE : " + day + "/" + month );
                            onboardtime = "16:00";
                        }
                break;
                
                case 5 : {
                            System.out.print("18:00 TIME SLOT ON DATE : " + day + "/" + month );
                            onboardtime = "18:00";
                        }
                break;
                
                case 6 : {
                            System.out.print("20:00 TIME SLOT ON DATE : " + day + "/" + month );
                            onboardtime = "20:00";
                        }
                break;
            }
            break;
        }

        while(true){

            System.out.println("\n\n\n-------------------------PASSENGER DETAILS------------------------ \n");

            System.out.print("ENTER NO. OF PASSENGERS : ");

            pass = sc.nextInt();

            sc.nextLine();

            if(pass>80 || pass<1){

                System.out.println("\n------[ERROR] INVALID INPUT!------");
                continue;
            }

            for(int i=1 ; i<=pass; i++){
                
                System.out.print("\n--> ENTER PASSENGER NO." + i + " NAME : ");

                names[i-1] = sc.nextLine();

            }

            while(true){
				
				System.out.print("\nENTER YOUR CONTACT NO. : ");

				con = sc.nextLong();

				if(con>9999999999l || con<1000000000l){

                System.out.println("\n------[ERROR] PLEASE ENTER 10-DIGIT CONTACT NUMBER!------");
                continue;
            }

			break;

			}

            sc.nextLine();
            
            System.out.print("\nENTER YOUR EMAIL ID : ");

            mail = sc.nextLine();

            break;
        }

        System.out.println("\n\n-----------------------TICKET PRICE DETAILS----------------------- \n");

        System.out.println("TICKET PRICE      : " + "1200");

        System.out.println("\nNO. OF PASSENGERS : " + pass);

        System.out.println("\nTOTAL PRICE       : " + (pass*1200));

		char yn;

        while(true){
			
			System.out.print("\n[CONTINUE FOR PAYMENT (Y/N)] : ");

			yn = sc.nextLine().charAt(0);

			if(yn=='y' || yn=='Y'){

                break;
            }
			else if(yn=='n' || yn=='N'){

                continue;
            }
			else{

                System.out.println("\n------[ERROR] INVALID INPUT!------");
                continue;
            }

		}

        while(true){
        
        System.out.println("\n\n-----------------------SELECT PAYMENT METHOD---------------------- \n");

        System.out.println("CHOOSE PAYMENT METHOD : \n");

        System.out.println("1. UPI PAYMENT          2. DEBIT/CREDIT CARD         3. NETBANKING ");

        System.out.print("\nENTER YOUR OPTION (1-3) : ");

        pay = sc.nextInt();

        sc.nextLine();

        if(pay>3 || pay<1){

                System.out.println("\n------[ERROR] INVALID INPUT!------");
                continue;
            }

        switch(pay){

            case 1 : {
                        
                System.out.println("\n[---NOTICE!---] YOU HAVE SELECTED UPI AS YOUR PAYMENT OPTION!\n");     

                System.out.print("\nPLEASE ENTER YOUR UPI ID : ");        
                
                String id = sc.nextLine();

                System.out.print("\nPLEASE ENTER YOUR UPI PASSWORD : ");        
                
                String pw = sc.nextLine();
            
            }
            break;

            case 2 : {
                        
                System.out.println("\n[---NOTICE!---] YOU HAVE SELECTED DEBIT/CREDIT CARD AS YOUR PAYMENT OPTION!\n");     

                System.out.print("\nPLEASE ENTER YOUR CARD NUMBER : ");        
                
                String id2 = sc.nextLine();

                System.out.print("\nPLEASE ENTER YOUR CVV NUMBER : ");        
                
                String pw2 = sc.nextLine();

                System.out.println("\n[---NOTICE!---] OTP HAS BEEN SENT TO YOUR REGISTERED NUMBER!"); 

                System.out.print("\nPLEASE ENTER OTP : ");        
                
                String otp = sc.nextLine();
            
            }
            break;

            case 3 : {
                        
                System.out.println("\n[---NOTICE!---] YOU HAVE SELECTED NETBANKING AS YOUR PAYMENT OPTION!\n");     

                System.out.print("\nPLEASE ENTER YOUR NETBANKING ID : ");        
                
                String id3 = sc.nextLine();

                System.out.print("\nPLEASE ENTER YOUR NETBANKING PASSWORD : ");        
                
                String pw3 = sc.nextLine();
            
            }
            break;
            
        }

        System.out.print("\n[PROCESSING PAYMENT]");

        for(int i = 0 ; i < 900000000 ; i++ ){

            if(i%100000000==0) System.out.print(".");
        }
        for(int i = 0 ; i < 900000000 ; i++ ){

            if(i%100000000==0) System.out.print(".");
        }
        for(int i = 0 ; i < 900000000 ; i++ ){

            if(i%100000000==0) System.out.print(".");
        }
        for(int i = 0 ; i < 900000000 ; i++ ){

            if(i%100000010==0) System.out.print(".");
        }

        System.out.print("\n\n[---NOTICE!---] YOUR PAYMENT HAS BEEN DONE SUCCESSFULLY!");
        
        break;

        }

            System.out.println("\n\n\n------------------------------SUMMARY----------------------------- \n");

            System.out.println("                     FLIGHT DATE	 : " + day + "/" + month);

            System.out.println("\n                     FLIGHT TIME	 : " + onboardtime);
            
            System.out.println("\n                     NO. OF PASSENGERS	 : " + pass+ "\n");

            for(int i=0 ;i<pass; i++){

                System.out.println("                     PASSENGER NO." + (i+1) + " NAME : " + names[i] + "\n");
            }

            System.out.println("                     TOTAL AMOUNT PAID	 : " + (pass*1200));

            System.out.println("\n   [---NOTICE!---] TICKET HAS BEEN SENT TO YOUR ENTERED EMAIL!\n");

            System.out.println("\n------------------------------------------------------------------\n");
            System.out.println("-----------THANK YOU FOR USING NITHIN AIRLINES SERVICES!---------- \n");
            System.out.println("-------------------------HAVE A GREAT DAY!------------------------\n");
            System.out.println("------------------------------------------------------------------ ");
        
    }
    
}
