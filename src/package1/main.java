package package1;

import java.io.IOException;
import java.util.*;

public class main {

	static void menu() {
		System.out.println("1. Input");
		System.out.println("2. View");
		System.out.println("3. Exit");
	}
	
	public static void main(String[] args) {
		ArrayList <Vehicle> vehicles = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		String vehicle = "";
		String brand = "";
		String name = "";
		String license = "";
		int topSpeed = 0;
		int gasCapacity = 0;
		int wheel = 0;
		int conditionalInt = 0;
		String type = "";
//		Car vehicle1 = new Car("Toyota", "Abdu", "AD 6780 SU", 4, 6, 9, "minivan", 3);
		int choice = 0;
		int listChoice = 0;
		while(choice!=3) {
			menu();
			System.out.print(">> ");
			try {
				choice = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Invalid input!");
			}
			sc.nextLine();	
			
			switch(choice) {
			case 1:
				do {
					System.out.print("Input type [Car | Motorcycle]: ");
					vehicle = sc.nextLine();
				}while(!vehicle.equals("Car") && !vehicle.equals("Motorcycle"));
				
				do {
					System.out.print("Input brand [>=5]: ");
					brand = sc.nextLine();
				}while(brand.length()<5);
				
				do {
					System.out.print("Input name [>=5]: ");
					name = sc.nextLine();
				}while(name.length()<5);
				
				do {
					System.out.print("Input license: ");
					license = sc.nextLine();
				}while(!isValidLicenseNumber(license));
				
				do {
					System.out.print("Input top speed [100<= topSpeed <= 250]: ");
					try {
						topSpeed = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Input must be a number between 100 - 250");
					}sc.nextLine();
				}while(topSpeed < 100 || topSpeed > 250);
				
				do {
					System.out.print("Input top speed [30<= topSpeed <= 60]: ");
					try {
						gasCapacity = sc.nextInt();
					} catch (Exception e) {
						System.out.println("Input must be a number between 100 - 250");
					}sc.nextLine();
				}while(gasCapacity < 30 || gasCapacity > 60);
				
				if(vehicle.equals("Motorcycle")) {
					do {
						System.out.print("Input wheel [2 <= wheel <= 3]: ");
						try {
							wheel = sc.nextInt();
						} catch (Exception e) {
							System.out.println("Input must be a number between 2 - 3");
						}sc.nextLine();
					}while(wheel<2 || wheel>3);
					
					do {
						System.out.print("Input type [Automatic | Manual]: ");
						type = sc.nextLine();
					}while(!type.equals("Automatic") && !type.equals("Manual"));
					
					do {
						System.out.print("Input helm ammount [>=1]: ");
						try {
							conditionalInt = sc.nextInt();
						} catch (Exception e) {
							System.out.println("Input must be a number!");
						}sc.nextLine();						
					}while(conditionalInt<1);
					Motorcycle motorcycles = new Motorcycle(brand, name, license, topSpeed, gasCapacity, wheel, type, conditionalInt);
					vehicles.add(motorcycles);
				}else {
					do {
						System.out.print("Input wheel [4 <= wheel <= 6]: ");
						try {
							wheel = sc.nextInt();
						} catch (Exception e) {
							System.out.print("Input must be a number between 4 - 6");
						}sc.nextLine();
					}while(wheel<4 || wheel>6);
					do {
						System.out.print("Input type [SUV | Supercar | Minivan]: ");
						type = sc.nextLine();
					}while(!(type.equals("SUV") || type.equals("Supercar") || type.equals("Minivan")));
					
					do {
						System.out.print("Input entertainment system ammount [>=1]: ");
						try {
							conditionalInt = sc.nextInt();
						} catch (Exception e) {
							System.out.println("Input must be a number!");
						}sc.nextLine();						
					}while(conditionalInt<1);
					Car cars = new Car(brand, name, license, topSpeed, gasCapacity, wheel, type, conditionalInt);
					vehicles.add(cars);
				}
					
				break;
			case 2:
				if(vehicles.size()>0) {
					int i =0;
					System.out.println("|-----|----------|----------|");
					System.out.println("|No   |Type      |Name      |");
					System.out.println("|-----|----------|----------|");
					for(Vehicle v : vehicles) {	
						i++;
						if(v instanceof Car)
						System.out.println("|" + i + "    " + "|Car     |" + v.getName() + "    |");
						else 
						System.out.println("|" + i + "    " + "|Motorcycle |" + v.getName() + "    |");
					}
					System.out.println("|-----|----------|----------|");
					System.out.print("Pick a vehicle number to test drive[Enter '0' to exit]: ");
					try {
						listChoice = sc.nextInt();
					} catch (Exception e) {
						
					}sc.nextLine();
					
					if(listChoice<0||listChoice>i) {
						System.out.println("Invalid input!");
					}else if(listChoice==0) {
						break;
					}else {
						Vehicle selected = vehicles.get(listChoice-1);
						System.out.println("Brand: " + selected.getBrand());
						System.out.println("Name: " + selected.getName());
						System.out.println("License Plate: " + selected.getLicense());
						System.out.println("Type: " + selected.getType());
						System.out.println("Gas Capacity: " + selected.getGasCapacity());
						System.out.println("Top Speed: " + selected.getTopSpeed());
						System.out.println("Wheel(s): " + selected.getWheel());
						if(selected instanceof Car) {
							System.out.println("Entertaining System: " + ((Car) selected).getEntertainmentSystem());
						}else {
							System.out.println("Helm: " + ((Motorcycle) selected).getHelm());
						}
						selected.Selling();
						String price = "";
						do {
						    System.out.print("Input helm price: ");
						    price = sc.nextLine();

						    try {
						        if (!price.isEmpty() && Integer.parseInt(price) > 0) {
						            break; 
						        } else {
						            System.out.println("Invalid input! Please enter a positive integer.");
						        }
						    } catch (NumberFormatException e) {
						        System.out.println("Invalid input! Please enter a positive integer.");
						    }
						} while (true); 
						System.out.println("Press Enter to continue...");
						try {
						    System.in.read(); 
						} catch (IOException e) {
						    e.printStackTrace();
						}

						
					}
					
					
					
				}else {
					System.out.println("|-----|----------|----------|");
					System.out.println("|No   |Type      |Name      ");
					System.out.println("|-----|----------|----------|");
					System.out.println("|-----|----------|----------|");
				}
				break;
			default:
				break;
			}
			
			
		}
		
		
	}
	public static boolean isValidLicenseNumber(String license) {

        String regex = "^[A-Z]\\s\\d{1,4}\\s[A-Z]{1,3}$";

        if (license.matches(regex)) {
            return true;
        } else {
            System.out.println("Invalid license number. Please follow the format. [ex: A 1234 BCD // B 123 CD]");
            return false;
        }
    }
}
