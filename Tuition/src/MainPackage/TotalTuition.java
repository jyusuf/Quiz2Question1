package MainPackage;

import java.util.Scanner;

public class TotalTuition {
	
	public static void main(String[] args){
		TuitionFinal();
	}
	
	public TotalTuition(){
		
	}
	
	private static double initialTuition; 
	private static double TPI; //tuition percentage increase
	private static double tuitionIncrease;
	private static double APR;
	private static double max = 0;
	private static int numberofMonths;
	private static int years;
	
	public static void TuitionFinal(){
		System.out.println("Input the initial tuition amount ");
		Scanner scanner = new Scanner(System.in);
		double initialTuition = scanner.nextDouble();
		
		System.out.println("Input the annual tuition percentage increase. ");
		Scanner scanner2 = new Scanner(System.in);
		double TPI = (scanner2.nextDouble() / 100);
		
		System.out.println("Input the APR: ");
		Scanner scanner3 = new Scanner(System.in);
		double APR = scanner3.nextDouble() / 100;
		
		System.out.println("Input how many years: ");
		Scanner scanner4 = new Scanner(System.in);
		double years = scanner4.nextDouble();
		
		double tuitionIncrease = initialTuition;
		for(int i = 0; i < 4; i++){
			tuitionIncrease += (tuitionIncrease * TPI);
			initialTuition += tuitionIncrease;
			
		}
			System.out.println("The total cost of tuition is " + "$" +initialTuition + "\n");
		
	
		for(int i = 0; i < 100000; i++){
			max += (numberofMonths * APR);
			
			if(max == numberofMonths && max > numberofMonths){
				numberofMonths = i;
				break;
			}
				System.out.println("The monthly payment is. " + (initialTuition * years) / 192); 
				break;
	
		}
		
		}
	}


