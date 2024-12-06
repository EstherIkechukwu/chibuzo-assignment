import java.util.Scanner;

public class MenstrualApplication{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	String name = "";
	int recentMenstrualDate;
	int lastMenstrualMonth;
	int lastMenstrualYear;

	do{
		System.out.print("What is your name?");
		name = input.nextLine();

		System.out.print("Enter the first day of your last menstrual cycle: ");
		recentMenstrualDate = input.nextInt();

		System.out.print("Enter the month of your last menstrual cycle: ");
		lastMenstrualMonth = input.nextInt();

		System.out.print("Enter the year of your last menstrual cycle: ");
		lastMenstrualYear = input.nextInt();
		

		if(!printCorrectDate(recentMenstrualDate, lastMenstrualMonth, lastMenstrualYear)){
			System.out.print("Invalid date, Kindly enter the correct date");
		}
	}
	while(!printCorrectDate(recentMenstrualDate, lastMenstrualMonth, lastMenstrualYear));

	System.out.printf("Hello %s, Welcome to MyFlowApp, Here is the summary of your Menstrual cycle:  ", name);
	System.out.println("Your Period flow dates ( 5 Days)");
	int currentDate = recentMenstrualDate;
	int currentMonth = lastMenstrualMonth; 
	int currentYear = lastMenstrualYear;

	for(int number = 0; number < 5; number++){
		System.out.printf("Day %d: %02d-%02d-%d\n", (number + 1), currentDate, currentMonth, currentYear);

		int[] nextDate = addToDays(currentDate, currentMonth, currentYear, 1);
		currentDate = nextDate[0];
		currentMonth = nextDate[1]; 
		currentYear = nextDate[2];

	}
	
	int[] ovulationStart = addToDays(currentDate, currentMonth, currentYear, 12);
	int[] ovulationEnd = addToDays(currentDate, currentMonth, currentYear, 16);
	
	System.out.print("Ovulation period");
	System.out.printf("Start: %02d-%02d-%d\n", ovulationStart[0], ovulationStart[1], ovulationStart[2]);
	System.out.printf("End: %02d-%02d-%d\n", ovulationEnd[0], ovulationEnd[1], ovulationEnd[2]);

	int[] nextPeriod = addToDays(currentDate, currentMonth, currentYear, 28 + (int)(Math.random() * 3));
	
	System.out.print("Your Next period will be on .......");
	System.out.printf("Predicted Date: %02d-%02d-%d\n", nextPeriod[0], nextPeriod[1], nextPeriod[2]);
	

}

	public static boolean printCorrectDate(int recentMenstrualDate, int lastMenstrualMonth, int lastMenstrualYear) {
	if(recentMenstrualDate < 1 || recentMenstrualDate > printDaysInAMonth(lastMenstrualYear, recentMenstrualDate)) return false;
	if(lastMenstrualMonth < 1 || lastMenstrualMonth > 12) return false;
	if(lastMenstrualYear < 1900 || lastMenstrualYear > 2100) return false;

	return true;
	}

	public static int printDaysInAMonth(int lastMenstrualYear, int recentMenstrualMonth) {
		switch(recentMenstrualMonth) {
			case 2: 
				return printLeapYear(lastMenstrualYear) ? 29 : 28;
			case 9: case 4: case 6: case 11:
				return 30;
			default:
				return 31;	
		}


	}

	public static boolean printLeapYear(int lastMenstrualYear){
		return (lastMenstrualYear % 4 == 0 && lastMenstrualYear % 100 != 0);
	}

	public static int[] addToDays(int recentMenstrualDate, int lastMenstrualMonth, int lastMenstrualYear, int daysToAdd ) {
	int[] totalDaysInAMOnth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
		if(printLeapYear(lastMenstrualYear)) {
		totalDaysInAMOnth[1] = 29;
		}

		for(int index = 0; index < daysToAdd; index++){
			recentMenstrualDate++;
			if(recentMenstrualDate > totalDaysInAMOnth[lastMenstrualMonth - 1]){ 
				recentMenstrualDate = 1;
				lastMenstrualMonth++;
			
				if(lastMenstrualMonth > 12){ lastMenstrualYear++;
			
					if(printLeapYear(lastMenstrualYear)){
						totalDaysInAMOnth[1] = 29;
					}	
				}
			}
		}
		return new int[] {recentMenstrualDate, lastMenstrualMonth, lastMenstrualYear}; 
	}


}