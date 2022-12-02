import java.util.Scanner;

public class Tax{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int Salary = sc.nextInt();
		if(Salary*0.9<=5000){
			System.out.println("tax:"+0);
	                System.out.println("Salary after tax:"+(Salary*0.9));
		}
		else{
			double tax = Salary*0.9-5000;

	                double results = 0.;
	
        	        if(tax>=0&&tax<=3000)
                	        tax*=0.03;
               		 else if(3000<tax&&tax<=12000)
                        	tax=3000*0.03+(tax-3000)*0.1;
               		 else if(12000<tax&&tax<=25000)
                       		tax=3000*0.03+12000*0.1+(tax-12000)*0.2;
               		 else if(25000<tax&&tax<=35000)
                        	tax=3000*0.03+12000*0.1+25000*0.2+(tax-25000)*0.25;
			 else if(35000<tax&&tax<=55000)
                       		tax=3000*0.03+12000*0.1+25000*0.2+35000*0.25+(tax-35000)*0.3;
              		 else if(55000<tax&&tax<=80000)
                        	tax=3000*0.03+12000*0.1+25000*0.2+35000*0.25+55000*0.3+(tax-55000)*0.35;
               		 else if(tax>80000)
                        	tax=3000*0.03+12000*0.1+25000*0.2+35000*0.25+55000*0.3+55000*0.35+(tax-80000)*0.45;

                	System.out.println("tax:"+tax);
                	System.out.println("Salary after tax:"+(Salary*0.9-tax));
        	}
	}

}
