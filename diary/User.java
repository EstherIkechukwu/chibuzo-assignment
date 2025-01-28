import java.util.Scanner;

public class User{
	public static void main(String... args){

	Diary diary = new Diary(); 
	Scanner input = new Scanner(System.in); 

	boolean running = true; 
	while (running) { 
		System.out.println("\nDiary Menu:");
		System.out.println("1. Create New Entry"); 
		System.out.println("2. View Entry"); 
		System.out.println("3. Update Entry"); 
		System.out.println("4. Delete Entry"); 
		System.out.println("5. Lock Diary"); 
		System.out.println("6. Unlock Diary"); 
		System.out.println("7. Exit"); 
		System.out.print("Choose an option: "); 
		
		int choice = input.nextInt(); 
		input.nextLine(); 

		switch (choice) { 
			case 1: System.out.print("Enter entry ID: "); 
				String id = scanner.nextLine(); 
				System.out.print("Enter entry content: "); 

				String content = scanner.nextLine(); 
				diary.createNewEntry(id, content); 
				break; 

			case 2: System.out.print("Enter entry ID to view: "); 
				id = input.nextLine(); 
				diary.viewEntry(id); 
				break; 

			case 3: System.out.print("Enter entry ID to update: "); 				
				id = input.nextLine(); 
				System.out.print("Enter new content: "); 
				content = input.nextLine(); 							
				diary.updateEntry(id, content); 
				break; 

			case 4: System.out.print("Enter entry ID to delete: "); 
				id = input.nextLine(); 
				diary.deleteEntry(id); 
				break; 

			case 5: diary.lockDiary(); 
				break; 

			case 6: diary.unlockDiary(); 
				break; 

			case 7: running = false; 								System.out.println("Exiting..."); 
				break; 

			default: System.out.println("Invalid choice. Please try again."); 
		} 
	}


	}

}