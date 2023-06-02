package practice.service;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import practice.model.Vehicle;

public class ParkingLot {
	
	int totalNumberOfSlotForTwoWheel= 10;
	int totalNumberOfSlotForFourWheel= 10;
	
	int remainigSlotForTwoWheel;
	int remainigSlotForFourWheel;
	
	Scanner sc = new Scanner(System.in);
	 
	List<Vehicle> twoWheelerparkedVehicle = new ArrayList<>(10);
	List<Vehicle> fourWheelerparkedVehicle = new ArrayList<>(10);

	 
	 public void twoWheelerParking() {
		Vehicle vehicle = new Vehicle();
		 System.out.print("\n Enter No vehicle you want to park ");
		 int noOfVehicle = sc.nextInt();
		 for(int i=0; i < noOfVehicle; i++) {
			 System.out.print("\n Enter slot No ");
			 vehicle.setId(sc.nextInt());
			 System.out.print("\n Enter Car No ");
			 vehicle.setLicensePlate(sc.next());
		
			 twoWheelerparkedVehicle.add(vehicle);
			 
		 }
		 if (twoWheelerparkedVehicle.size() <= 10) {
			 remainigSlotForTwoWheel = totalNumberOfSlotForTwoWheel-twoWheelerparkedVehicle.size();
	            System.out.print("\n Remainig slot is "+ remainigSlotForTwoWheel + "Two Wheeler");
	        }else {
		 System.out.print("slot is not available");
	    }
	 }
	 
	 public void fourWheelerParking()  {
			Vehicle vehicle = new Vehicle();
			 System.out.print("\n Enter No vehicle you want to park ");
			 int noOfVehicle = sc.nextInt();
			 for(int i=0; i < noOfVehicle; i++) {
				 System.out.print("\n Enter slot No ");
				 vehicle.setId(sc.nextInt());
				 System.out.print("\n Enter Car No ");
				 vehicle.setLicensePlate(sc.next());
			
				 fourWheelerparkedVehicle.add(vehicle);
				 
			 }
			 if (fourWheelerparkedVehicle.size() <= 10) {
				 remainigSlotForFourWheel = totalNumberOfSlotForFourWheel-fourWheelerparkedVehicle.size();
				 		
		            System.out.print("\n Remainig slot is "+ remainigSlotForFourWheel +"Four Wheeler");
		        }else {
			 System.out.print("slot is not available");
		    }
		 }
	 
	 
	 public void removeVehicle() {
		 System.out.print("\n Please enter type of vehicle 2 Wheeler for enter 1 and  4 wheeler for enter 2");
		 
		 int choice = sc.nextInt();
		 
		 switch (choice) {
         case 1:
        	 removeTwoWheeler();
             break;
         case 2:
        	 removeFourWheeler();
             break;
		 }
		 
	 }
		 public void removeTwoWheeler() {
			 ListIterator<Vehicle> iterator = twoWheelerparkedVehicle.listIterator();
			 while (iterator.hasNext()) {
			     Vehicle item = iterator.next();
			     System.out.print("\n Please enter Vehicle Number ");
			     String VehicleNumber = sc.next();
			     
			     if (item.equals(VehicleNumber)) {
			         iterator.remove(); 
			     }
			     remainigSlotForTwoWheel++;
			     System.out.println("\n Remainig slot is "+ remainigSlotForTwoWheel);
			     System.out.println(twoWheelerparkedVehicle);
			     
		 }
			 
		 }
		 
		 public void removeFourWheeler() {
			 ListIterator<Vehicle> iterator = fourWheelerparkedVehicle.listIterator();
			 while (iterator.hasNext()) {
			     Vehicle item = iterator.next();
			     System.out.print("\n Please enter Vehicle Number ");
			     String VehicleNumber = sc.next();
			     
			     if (item.equals(VehicleNumber)) {
			         iterator.remove(); 
			     }
			     remainigSlotForTwoWheel++;
			     System.out.println("\n Remainig slot is "+remainigSlotForTwoWheel);
			     System.out.println(fourWheelerparkedVehicle);
		 }
			 
		 }
		 
		 public void slot() {
			 System.out.println("\nSlots avilable for Four Wheeler " +remainigSlotForTwoWheel);
			 System.out.println("\nSlots avilable for Two Wheeler " +remainigSlotForFourWheel);
			 
		 }
	 
	 
	 
	 
	 
	 
//	 public void fourWheelerParking() {
//		 List<Vehicle> slot = new ArrayList<>(10);
//		 slot.add(new Vehicle(1,"MH29BD2345"));
//		 slot.add(new Vehicle(2,"MH29BD2345"));
//		 slot.add(new Vehicle(3,"MH29BD2345"));
//		 slot.add(new Vehicle(4,"MH29BD2345"));
//		 
//		 System.out.print("\n"+slot);
//		 
//		 if (slot.size() <= 10) {
//			 int Remainig = totalNumberOfSlotForFourWheel-slot.size();
//	            System.out.print("\n Remainig slot is "+ Remainig);
//	        }else {
//		 System.out.print("slot is not available");
//	    }
//	 }
//		
//	

	 
}
