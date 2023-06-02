package practice;

import java.util.Scanner;

import practice.service.ParkingLot;




public class A {
	public static void main(String[] args) {
		
		System.out.println("\n_______________________________________________________________");
		System.out.println("\n=================Car Parking===================");
		System.out.println("\n_______________________________________________________________");
		
		Scanner sc = new Scanner(System.in);
		
		ParkingLot lots= new ParkingLot();
		
		
//		lots.fourWheelerParking();
		
	
        boolean running = true;

        while (running) {
            System.out.println("\n Welcome to the Car parking System!");
            System.out.println("\n choose option ");
            
            System.out.println("1. Two Wheeler Parking");
            System.out.println("2. Four Wheeler Parking");
            System.out.println("3. if you want ot exit car ");
            System.out.println("4. Exit ");
            
            lots.slot();
            
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                	lots.twoWheelerParking();
                    break;
                case 2:
                	lots.fourWheelerParking();
                    break;
                case 3:
                	lots.removeVehicle();;
                    break; 
                    
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
		
	
	
}
}