import java.util.*;

class Salaryinformationsystem{
	public static void main(String args[]){
		L:do{
		Scanner input = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------");
		System.out.println("|                SALARY INFORMATION SYSTEM        |");
		System.out.println("---------------------------------------------------");
		System.out.println();
		System.out.println("        [1] Calculate Income Tax             ");
		System.out.println("        [2] Calculate Annual Bonus           ");
		System.out.println("        [3] Calculate Loan amount            ");
		System.out.println();
		System.out.print("Enter an option to continue > ");
		int option = input.nextInt();
		
		
			if(option==1){L1:do{
		       System.out.println("------------------------------------------------");
		       System.out.println("|             Calculate Income Tax             |");
		       System.out.println("------------------------------------------------");
		       System.out.println();
		       System.out.print("Input Employee name - ");
		       String Ename= input.next();
		       System.out.print("Input Employee salary - ");
		       double Esalary=input.nextDouble();
		       
		       double Tempsalary=0;
		       double newtax=0;
		      
		       
		       if(Esalary<100000){
					System.out.println("Not tax included");
			   }
			   else if(100000<Esalary && Esalary<141667){
				   Tempsalary = Esalary -100000;
				   newtax = Tempsalary*0.06;
				   
			   }
			   else if(141667<=Esalary && Esalary<183333){
				   Tempsalary = Esalary -141667;
				   double tax = Tempsalary*0.12;
				   newtax = 2500 + tax; 
				   
			   }
			   else if(183333<=Esalary && Esalary<225000){
				   Tempsalary = Esalary -183333;
				   double tax = Tempsalary*0.18;
				   newtax = 7500 + tax;
				   
			   }
			   else if(225000<=Esalary && Esalary<266667){
				   Tempsalary = Esalary -225000;
				   double tax = Tempsalary*0.24;
				   newtax = 15000 + tax;
				  
			  }
			  else if(266667<=Esalary && Esalary<=308333){
					Tempsalary = Esalary -266667;
				    double tax = Tempsalary*0.30;
				    newtax = 25000 + tax;
				   
			  }
			  else{
					Tempsalary = Esalary -308333;
					double tax = Tempsalary*0.36;
					newtax = 37500 + tax;
			  }
			System.out.println();
			System.out.println("You have to pay Income Tax per month: " + newtax);	
			System.out.println();	
			L2:do{
				System.out.print("Do you want to calculate another Income Tax per month(Y/N)? ");
			    String i = input.next();
			    
			       if(i.equalsIgnoreCase("Y")){
					  continue L1;
				   }else if(i.equalsIgnoreCase("N")){
						continue L;
				   }
				   else{
				   System.out.println("Try again");
						continue L2;	
				   }
			   }while(true);
		} while(true);
	}
		
	   else if(option==2){
		       L3:do{
				System.out.println("-------------------------------------------------");
		        System.out.println("| 	       Calculate Annual Bonus	        |");
		        System.out.println("-------------------------------------------------");
		        System.out.println();
		        System.out.print("Input Employee name - ");
		        String Ename = input.next();
		        System.out.print("Input Employee Salary - ");
		        double Esalary = input.nextDouble();
		        
		        double bonus=0;
		        
		        if(Esalary<100000){
					bonus=5000;
				}
				else if(100000<=Esalary && Esalary<=199999){
					bonus = Esalary*0.10;
				}
				else if(200000<=Esalary && Esalary<=299999){
					bonus = Esalary*0.15;
				}
				else if(300000<=Esalary && Esalary<=399999){
					bonus = Esalary*0.20;
				}
				else{
					bonus = Esalary*0.35;
				}
				System.out.println();
				System.out.println("Annual bonus - "+ bonus);	
				System.out.println();
				L2:do{
					System.out.print("Do you want to calculate another Annual Bonus(Y/N)? ");
			        String i = input.next();
			    
			       if(i.equalsIgnoreCase("Y")){
					  continue L3;
				   }else if(i.equalsIgnoreCase("N")){
						continue L;
				   }
				   else{
				   System.out.println("Try again");
						continue L2;	
				   }
			   }while(true);	
		  }while(true);
		}
		else if(option==3){
                L4:do{
				System.out.println("--------------------------------------------------");
				System.out.println("|             Calculate Loan amount              |");
				System.out.println("--------------------------------------------------");
				System.out.println();
				System.out.print("Input Employee name - ");
				String Ename = input.next();
				System.out.print("Input Employee Salary - ");
				double Esalary = input.nextDouble();
				
				double loanamount=0;
				
				if(Esalary<50000){
					System.out.println("You can not get a loan because your salary lessthan Rs.50 000..."); 
				}
				else{
					System.out.print("Enter number of year : ");
					int Eyear = input.nextInt();
					if(Eyear>5){
					System.out.println("Can not enter greater than 5 years");
					}
					else{
						double Minstallment = Esalary*0.60;
						int month = Eyear*12;
						double r =0.15;
						double Mrate=r/12;
						double base = 1+Mrate;
					
						loanamount = (Minstallment*(1- (1/Math.pow(base,month)))/Mrate);
						System.out.println();
						double Mround = Math.round(loanamount);
						int roundnumber = (int)(Mround/1000)*1000;
						System.out.println("You can get Loan Amount : " + roundnumber);
						System.out.println();
					L2:do{
					System.out.print("Do you want to calculate another Loan Amount(Y/N)? ");
			        String i = input.next();
			    
			        if(i.equalsIgnoreCase("Y")){
					  continue L4;
				    }else if(i.equalsIgnoreCase("N")){
						continue L;
				    }
				    else{
				    System.out.println("Try again");
						continue L2;	
				   }
			   }while(true);	
				   }
			}
				
				}while(true);
	    }
	
			}while(true);
		}
		
}
