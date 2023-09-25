import java.util.*;

class Standard_Programs{

	//Calculator program
	public static void Calc(){

		System.out.println("\n-----------CALCULATOR PROGRAM HAS BEEN INITITATED------------\n");

		Scanner sc = new Scanner(System.in);

		//taking input from user

		System.out.print("Enter First Number : ");
		double num1 = sc.nextInt();
		
		System.out.print("\nEnter Second Number : ");
		double num2 = sc.nextInt();
		
		System.out.print("\nEnter Operation You Want To Perform : ");
		char c = sc.next().charAt(0);
	
		switch(c){
		
			//addition
			case '+': System.out.println("\nAddition of " + num1 + " and " + num2 + " is " + (num1+num2) + "\n");
			break;
			
			//subtraction
			case '-': System.out.println("\nSubtraction of " + num1 + " and " + num2 + " is " + (num1-num2) + "\n");
			break;
			
			//multiplication
			case '*': System.out.println("\nMultiplication of " + num1 + " and " + num2 + " is " + (num1*num2) + "\n");
			break;
			
			//division
			case '/': System.out.println("\nDivision of " + num1 + " and " + num2 + " is " + (num1/num2) + "\n");
			break;

			default : System.out.println("\nInvalid Symbol" + "\n");
			}
	
	} //Calculator program end



	//Patterns program
	public static void Pattern(){
		
		System.out.println("\n-----------PATTERNS PROGRAM HAS BEEN INITITATED------------\n");

		System.out.println("SOME PATTERNS PROGRAMS ARE LISTED BELOW : " + "\n");
		System.out.println("1 : Print Square" + "\n");
		System.out.println("2 : Print Hollow Square" + "\n");
		System.out.println("3 : Print Triangle" + "\n");
		System.out.println("4 : Print Diamond Pattern" + "\n");
		System.out.println("5 : Print Butterfly Pattern" + "\n");
		System.out.println("6 : Print Palindromic Number Pattern" + "\n");


		System.out.print("PLEASE SELECT THE PATTERN YOU WANT TO PRINT (1-6) : ");


		Scanner sc = new Scanner(System.in);

		//taking input from user
		int opt = sc.nextInt();

		switch(opt){

			case 1 : {

				System.out.print("\nEnter the length of the square pattern : ");
				int len =  sc.nextInt();
				System.out.println("");

				for(int i=0; i<len; i++){

					for (int j=0;j<len;j++)
					{
						System.out.print("* ");
					}

					System.out.println("");
				}

				System.out.println("");
			}
			break;


			case 2 : {

				System.out.print("\nEnter the length of the hollow square pattern : ");
				int len =  sc.nextInt();
				System.out.println("");

				for(int i=0; i<len; i++){

					System.out.print("* ");

					for (int j=1;j<len-1;j++)
					{
						if(i==0 || i==len-1){

							System.out.print("* ");
						}
						
						else{

							System.out.print("  ");
						}
					}

					System.out.print("*");

					System.out.println("");
				}

				System.out.println("");
			
			}
			break;


			case 3 : {

				System.out.print("\nEnter the length of the triangle pattern : ");
				int len =  sc.nextInt();
				System.out.println("");

				for(int i=0; i<len; i++){

					for(int j=0;j<=i;j++){

						System.out.print("* ");

					}

					for(int j=len-1;j>i;j--){

						System.out.print("  ");
					
					}

					System.out.println("");
				}

				System.out.println("");
			
			}
			break;

			
			case 4 : {

				System.out.print("\nEnter the length of the diamond pattern : ");
				int len =  sc.nextInt();
				System.out.println("");

				for(int i=0; i<len/2 ; i++){

					for(int j=len/2-1 ; j>i ; j--){

						System.out.print("  ");

					} 

					for(int j=0 ; j<=i ; j++){

						System.out.print("* ");

					}

					for(int j=0 ; j<i ; j++){

						System.out.print("* ");

					}
					
					for(int j=len/2-1 ; j>i ; j--){

						System.out.print("  ");

					}
					
					System.out.println("");
				
				}

				for(int i=len/2-1; i>=0 ; i--){

					for(int j=len/2-1 ; j>i ; j--){

						System.out.print("  ");

					} 

					for(int j=0 ; j<=i ; j++){

						System.out.print("* ");

					}

					for(int j=0 ; j<i ; j++){

						System.out.print("* ");

					}
					
					for(int j=len/2-1 ; j>i ; j--){

						System.out.print("  ");

					}
					
					System.out.println("");
				
				}

				System.out.println("");
			
			}
			break;


			case 5 : {

				System.out.print("\nEnter the length of the butterfly pattern : ");
				int len =  sc.nextInt();
				System.out.println("");

				for(int i=0; i<len; i++){

					for(int j=0;j<=i;j++){

						System.out.print("* ");

					}

					for(int j=len-1;j>i;j--){

						System.out.print("  ");
					
					}

					for(int j=len-1;j>i;j--){

						System.out.print("  ");
					
					}

					for(int j=0;j<=i;j++){

						System.out.print("* ");

					}

					System.out.println("");
				}

				for(int i=len-1; i>=0; i--){

					for(int j=0;j<=i;j++){

						System.out.print("* ");

					}

					for(int j=len-1;j>i;j--){

						System.out.print("  ");
					
					}

					for(int j=len-1;j>i;j--){

						System.out.print("  ");
					
					}

					for(int j=0;j<=i;j++){

						System.out.print("* ");

					}

					System.out.println("");
				}


				System.out.println("");
			
			}
			break;


			case 6 : {

				System.out.print("\nEnter the length of the palindromic number pattern : ");
				int len =  sc.nextInt();
				System.out.println("");

				for(int i=0; i<len/2 ; i++){

					for(int j=len/2-1 ; j>i ; j--){

						System.out.print("  ");

					} 

					for(int j=0 ; j<=i ; j++){

						System.out.print(j + " ");

					}

					for(int j=i-1 ; j>=0 ; j--){

						System.out.print(j + " ");

					}
					
					for(int j=len/2-1 ; j>i ; j--){

						System.out.print("  ");

					}
					
					System.out.println("");
				
				}

				System.out.println("");

			}
			break;
		
		}


	}//Patterns program end
	


	//Sorting program
	public static void Sort(){

		System.out.println("\n-----------SORTING PROGRAM HAS BEEN INITITATED------------");

		Scanner sc = new Scanner(System.in);

		int ar[] = new int[6];

		//taking array input from user

		for(int i=0; i<6; i++){
		
			System.out.print("\nEnter Element No. " + (i + 1) + " Of Array : ");
			ar[i] = sc.nextInt();

		}

		//sorting the array using insertion sort

        for(int i=1;i<ar.length;i++){

            int curr = ar[i];
			int insert = -1;

            for(int j=i-1;j>=0;j--){
                
                if(ar[j]>curr){

                    ar[j+1] = ar[j];
                    insert = j;

                }
            }
            if(insert!=-1){

                ar[insert] = curr;

            }
        }

		//print result

		System.out.print("\nYour Sorted Array : ");

		for(int i=0;i<ar.length;i++){

			System.out.print(ar[i] + " ");
		}

		System.out.println("\n");
		
	
	}//Sorting program end




	//Fibonacci program
	public static void Fib(){

		System.out.println("\n-----------FIBONACCI PROGRAM HAS BEEN INITITATED------------");

		Scanner sc = new Scanner(System.in);

		//taking input from user

		System.out.print("\nEnter the length of the fibonacci series : ");

		int len = sc.nextInt();

		//printing the series

		System.out.print("\nFibonacci series of length " + len + " : ");
	
		int a = 0;
		int b = 1;

		if(len==1){

			System.out.print(a);
		}
		else if(len==2){
			
			System.out.print(a + " ");
			System.out.print(b + " ");
		}
		else{
			
			System.out.print(a + " ");
			System.out.print(b + " ");
		
			for(int i=2; i<len; i++){

				System.out.print( (a+b) + " ");
				
				b = a+b;
				a = b-a;
				
			}
		}

		System.out.println("\n");
	
	}//Fibonacci program end



	//Palindrome program
	public static void Palin(){

		System.out.println("\n-----------PALINDROME PROGRAM HAS BEEN INITITATED------------");

		Scanner sc = new Scanner(System.in);

		//taking input from user

		System.out.print("\nEnter the string : ");

		String str = sc.nextLine();

		//checking palindrome

		StringBuilder sb = new StringBuilder();

		for(int i=str.length()-1; i>=0; i--){

			sb.append(str.charAt(i));
		
		}

		if(str.equals(sb)){

			System.out.print("\nThis string is Palindrome");
		}

		else{
			
			System.out.print("\nThis string is not Palindrome");
		}


		System.out.println("\n");
	
	}//Palindrome program end



	//String Reverse program
	public static void Rev(){

		System.out.println("\n-----------STRING REVERSE PROGRAM HAS BEEN INITITATED------------");

		Scanner sc = new Scanner(System.in);

		//taking input from user

		System.out.print("\nEnter the string : ");

		String str = sc.nextLine();

		//reverse string

		StringBuilder sb = new StringBuilder();

		for(int i=str.length()-1; i>=0; i--){

			sb.append(str.charAt(i));
		
		}

			
		System.out.print("\nReversed String for " + str + " is : " + sb);
		


		System.out.println("\n");
	
	}//String Reverse program end



	//Check duplicate element program
	public static void Dup(){

		System.out.println("\n-----------CHECKING DUPLICATE ELEMENT PROGRAM HAS BEEN INITITATED------------");

		Scanner sc = new Scanner(System.in);

		int ar[] = new int[6];

		//taking array input from user

		for(int i=0; i<6; i++){
		
			System.out.print("\nEnter Element No. " + (i + 1) + " Of Array : ");
			ar[i] = sc.nextInt();

		}

		//checking duplicate
		
		System.out.print("\nDuplicate Elements are : ");

		for(int i=0; i<5; i++){
			
			for(int j=i+1 ; j<6; j++){

				if(ar[j] == ar[i]){

					System.out.print(ar[j] + " ");
				}
	
					
			}
		}

		System.out.println("\n");
	
	}//Check duplicate element program end



	//Check prime program
	public static void Prime(){

		System.out.println("\n-----------CHECK PRIME NUMBER PROGRAM HAS BEEN INITITATED------------");

		Scanner sc = new Scanner(System.in);

		//taking array input from user

		System.out.print("\nEnter Number : ");

		int num = sc.nextInt();
			
		//checking prime

		int count = 0;

		for(int i=2; i<num; i++){
			
				if(num%i ==0 ){

					count++;
					break;
				}	
		}

		if(count>0){
			
			System.out.print("\n" + num + " is NOT PRIME");
			
		}
		else{
			
			System.out.print("\n" + num + " is PRIME");
		}

		System.out.println("\n");
	
	}//Check prime program end




	public static void main(String[] args) 
	{

		System.out.println("*------------------WELCOME!------------------*\n");
		System.out.println("SOME STANDARD PROGRAMS OF JAVA ARE LISTED BELOW : " + "\n");
		System.out.println("1 : Calculator Program in Java" + "\n");
		System.out.println("2 : Pattern Programs in Java" + "\n");
		System.out.println("3 : Sorting Program for Arrays" + "\n");
		System.out.println("4 : Fibonacci Series Program" + "\n");
		System.out.println("5 : Palindrome Program in Java" + "\n");
		System.out.println("6 : String Reverse Program in Java" + "\n");
		System.out.println("7 : Checking Duplicate Element in Array" + "\n");
		System.out.println("8 : Check For Prime Number" + "\n");
		
		
		System.out.print("PLEASE SELECT THE PROGRAM YOU WANT TO PERFORM (1-8) : ");


		Scanner sc = new Scanner(System.in);

		//taking input for option
		int opt = sc.nextInt();


		//switch for choosing programs
		switch(opt){

			case 1 : Calc();
					 break;
			case 2 : Pattern();
					 break;
			case 3 : Sort();
					 break;
			case 4 : Fib();
					 break;
			case 5 : Palin();
					 break;
			case 6 : Rev();
					 break;
			case 7 : Dup();
					 break;
			case 8 : Prime();
					 break;
				
		}

	}
}
