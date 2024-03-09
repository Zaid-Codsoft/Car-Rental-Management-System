package CRS;
import java.util.*;

import java.util.ArrayList;
import java.util.List;
class Car {               // this is car class which inherit other types of car
    final private int CarID;
    final private String Brand;

    final private String Model;
    final private int Year;
    private boolean RentalStatus;
     private  double RentalFee;
    final private String PlateNumber;


    @Override
    public String toString() {
        return "Car{" +
                "CarID=" + CarID +
                ", Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", Year=" + Year +
                ", RentalStatus=" + RentalStatus +
                ", RentalFee=" + RentalFee +
                ", PlateNumber='" + PlateNumber + '\'' +
                '}';
    }

    public Car(int carID, String brand, String model, int year, boolean rentalStatus, double rentalFee, String plateNumber) {
        CarID = carID;
        Brand = brand;
        Model = model;
        Year = year;
        RentalStatus = rentalStatus;
        RentalFee = rentalFee;
        PlateNumber = plateNumber;
    }

    public int getCarID() {
        return CarID;
    }

    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public int getYear() {
        return Year;
    }

    public boolean isRentalStatus() {
        return RentalStatus;
    }

    public  double getRentalFee() {
        return RentalFee;
    }

    public String getPlateNumber() {
        return PlateNumber;
    }
    public double RentCalculation(double distance) {        // funtion to calculation of Rent
        double baseRent = getRentalFee();
        double distanceCost = distance * 0.10;
        double totalRent = baseRent + distanceCost;
        return totalRent;
    }
    public double calculateInsuranceCost() {        //calculation of insurance
        double InsurancePercentage = 0.3;
        double InsuranceCost = getRentalFee() * InsurancePercentage;
        return InsuranceCost;
    }
    public  double calculateDamageCost() {      //calculate the damage cost
        double DamagePercentage = 0.5;
        double DamageCost = getRentalFee() * DamagePercentage;
        return DamageCost;
    }
    public double damageafterinsurance(){           //damage after insurance
        double result=calculateInsuranceCost()-calculateDamageCost();
        return result;
    }



    public boolean IsEnsurable(int x){               //check the insurablity
        if(x==1) {
            System.out.println("Your Car is Ensurable ");
            return true;

        }
        else
            System.out.println("Your Car is NOT Ensurable ");

            return false;
    }
     public void Feature(){}
    void DisplayCar(double distance){
        System.out.println(toString());

        Feature();

        System.out.println("Total Rent Calculated : "+RentCalculation(distance));
        System.out.println("Insurance Cost : " +calculateInsuranceCost());
        System.out.println("Damage Cost : "+calculateDamageCost());
        System.out.println("Damaged Cost of Insured Car : "+damageafterinsurance());
        System.out.println("Rental Status (car is on rent ? ): "+ isRentalStatus());
        //System.out.print("TOTAL COST : ");
       // System.out.println(RentCalculation(distance)+calculateInsuranceCost()+calculateDamageCost());
    }

    public void setRentalStatus(boolean rentalStatus) {
        RentalStatus = rentalStatus;
    }

    public void setRentalFee(double rentalFee) {
        RentalFee = rentalFee;
    }
}
class CompactCar extends Car{
    private double Distance;
private boolean insuablee=false;
    public CompactCar(int carID, String brand, String model, int year, boolean rentalStatus, double rentalFee, String plateNumber,double distance) {
        super(carID, brand, model, year, rentalStatus, rentalFee, plateNumber);
        this.Distance=distance;
    }


    public double getDistance() {
        return Distance;
    }

    @Override
    public void Feature() {
        System.out.println("This Car Is Suitable for Short travel Distance : "+getDistance());
    }


    public boolean checkEnsurable() {
        Scanner sc=new Scanner(System.in);

        int x=2;
        return super.IsEnsurable(x);
    }

    @Override
    public double RentCalculation(double distance) {
        distance=getDistance();
        return super.RentCalculation(distance);
    }

    @Override
    public  double calculateInsuranceCost() {
        return super.calculateInsuranceCost();
    }

    @Override
    public double calculateDamageCost() {
        return super.calculateDamageCost();
    }
     //System.out.println("                COMPACT CAR          ");

    @Override
    void DisplayCar(double distance) {
        System.out.println("               <---------- COMPACT CAR ---------->     ");
        System.out.println();
       Feature();
        System.out.println("Insurable :"+checkEnsurable());
        System.out.println("Total Rent : " +RentCalculation(distance));

    }
}

class SUV extends Car{
    private double Distance;

    public SUV(int carID, String brand, String model, int year, boolean rentalStatus, double rentalFee, String plateNumber,double distance) {
        super(carID, brand, model, year, rentalStatus, rentalFee, plateNumber);
        this.Distance=distance;
    }


    public double getDistance() {
        return Distance;
    }

    @Override
    public void Feature() {
        System.out.println("Spacious, suitable for family trips. Distance travel : "+getDistance());
    }


    public boolean checkEnsurable() {
        Scanner sc=new Scanner(System.in);

        int x=1;
        return super.IsEnsurable(x);
    }

    @Override
    public double RentCalculation(double distance) {
        distance=getDistance();
        return super.RentCalculation(distance);
    }

    @Override
    public double calculateInsuranceCost() {
        return super.calculateInsuranceCost();
    }

    @Override
    public double calculateDamageCost() {
        return super.calculateDamageCost();
    }
    //System.out.println("                COMPACT CAR          ");

    @Override
    void DisplayCar(double distance) {
        System.out.println("               <---------- SUV CAR ---------->     ");
        System.out.println();
        System.out.println("Insurable :"+checkEnsurable());
        super.DisplayCar(getDistance());
    }
}
class Luxury extends Car{
    private double Distance;

    public Luxury(int carID, String brand, String model, int year, boolean rentalStatus, double rentalFee, String plateNumber,double distance) {
        super(carID, brand, model, year, rentalStatus, rentalFee, plateNumber);
        this.Distance=distance;
    }


    public double getDistance() {
        return Distance;
    }

    @Override
    public void Feature() {
        System.out.println("High-end, suitable for special occasions. Travel Distance : "+getDistance());
    }


    public boolean checkEnsurable() {
        Scanner sc=new Scanner(System.in);

        int x=1;
        return super.IsEnsurable(x);
    }

    @Override
    public double RentCalculation(double distance) {
        distance=getDistance();
        return super.RentCalculation(distance);
    }

    @Override
    public double calculateInsuranceCost() {
        return super.calculateInsuranceCost();
    }

    @Override
    public double calculateDamageCost() {
        return super.calculateDamageCost();
    }
    //System.out.println("                COMPACT CAR          ");

    @Override
    void DisplayCar(double distance) {
        System.out.println("               <----------  LUXURY CAR (INCLUDING TAX) ---------->     ");
        System.out.println();
        System.out.println("Insurable :"+checkEnsurable());
        super.DisplayCar(getDistance()+(0.10*getRentalFee()));
    }
}




class Renter {
    final private int renterId;
    final private String name;
    final private String Email;
    private List<Car> RentedCars;
    private double TotalRentalFee;
    final private double PhoneNumber;
    final  private String Address;
     Car car;


    public void setTotalRentalFee(double totalRentalFee) {
        TotalRentalFee = totalRentalFee;
    }

    public Renter(int renterId, String name, String email, double phoneNumber, String address) {
        this.renterId = renterId;
        this.name = name;
        Email = email;

        PhoneNumber = phoneNumber;
        Address = address;
        RentedCars=new ArrayList<>();

    }

    public List<Car> getRentedCars() {
        return RentedCars;
    }
    public void AddCar(Car car,double distance){
        RentedCars.add(car);

        car.DisplayCar(distance);
        System.out.println(" IS your Car is insured .? ");
        Scanner scs=new Scanner(System.in);
        int x=scs.nextInt();
        if(car.IsEnsurable(x)){
            System.out.println("do you want to a add Isurance into your total cost..? press 1 to yes ");
            int x1=scs.nextInt();
            if(x1==1){
                double extendedfee=car.getRentalFee()+car.calculateInsuranceCost();
                car.setRentalFee(extendedfee);
                System.out.println(" Insuarance Fee is Add to your cost : "+ car.getRentalFee());
            }
            else{
                System.out.println("Your insurance is not implemented ");
            }
        }
        car.setRentalStatus(true);
    }
    public void RemoveCar(Car car){
        RentedCars.remove(car);
        System.out.println("Car wit ID no :"+car.getCarID() +" is Removed successfully by Renter  ");
        car.setRentalStatus(false);
        System.out.println("Now Rental status is : False");
    }
    public int getRenterId() {
        return renterId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return Email;
    }

    public double getTotalRentalFee() {
        return TotalRentalFee;
    }

    public double getPhoneNumber() {
        return PhoneNumber;
    }

    public String getAddress() {
        return Address;
    }
    public void AllCarStutus(){
        for (Car car : RentedCars) {
            System.out.println( "Car Name :" +car.getBrand() +"   Car Model :" +car.getModel() +"   Car Rental Status (Is Car on Rent ?) : "+car.isRentalStatus());
        }
    }


    public double calculateTotalRentalFee() {
        double totalFee = 0.0;
        for (Car car : RentedCars) {
            totalFee += car.getRentalFee();
        }
        return totalFee;
    }
}
abstract interface RenterType {

    public  double calculateRent(Car carType, double distance);
}

// Concrete classes representing different types of renters
 class RegularRenter extends Renter implements RenterType {     //regularRenter Type

    public RegularRenter(int renterId, String name, String email, double phoneNumber, String address) {
        super(renterId, name, email, phoneNumber, address);
    }

    @Override
    public double calculateRent(Car carType, double distance) {
        return car.getRentalFee()*distance * 0.2;
    }
}

 class FrequentRenter extends Renter implements RenterType  {               //frequentRenter
    public FrequentRenter(int renterId, String name, String email, double phoneNumber, String address) {
        super(renterId, name, email, phoneNumber, address);
    }

    @Override
    public double calculateRent(Car carType, double distance) {
        return car.getRentalFee()*distance/2;
    }
}
abstract class CorporateRenter extends Renter implements RenterType {
    public CorporateRenter(int renterId, String name, String email, double phoneNumber, String address) {
        super(renterId, name, email, phoneNumber, address);
    }

    @Override
    public double calculateRent(Car carType, double distance) {
        return car.getRentalFee()*distance/4;
    }
}

class CarRentalSystem {
    private List<Car> availableCars;
    private List<Renter> renters;

    public CarRentalSystem() {
        availableCars = new ArrayList<>();
        renters = new ArrayList<>();
    }

    public void addCar(Car car) {
        availableCars.add(car);
    }

    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (Car car : availableCars) {
            System.out.println("CarID: " + car.getCarID() + ", Brand: " + car.getBrand() +
                    ", Model: " + car.getModel() + ", Year: " + car.getYear() +
                    ", Plate Number: " + car.getPlateNumber() + ", Rental Status: "+ car.isRentalStatus());
        }
    }

    public void removeCar(int carID) {
        for (Car car : availableCars) {
            if (car.getCarID() == carID && !car.isRentalStatus()) {
                availableCars.remove(car);
                System.out.println("Car With ID NO " + carID + "  Successsfully Removed By Rental System.");
                return;
            }
        }
        System.out.println("Car with ID " + carID + " cannot be removed or in currently rented.");
    }

    public void addRenter(Renter renter) {
        renters.add(renter);
    }

    public void displayRenterDetails() {
        System.out.println("Renter Details:");
        for (Renter renter : renters) {
            System.out.println("RenterID: " + renter.getRenterId() + ", Name: " + renter.getName() +
                    ", Email: " + renter.getEmail() + ", Phone: " + renter.getPhoneNumber() +
                    ", Address: " + renter.getAddress());
        }
    }

    public void removeRenter(int renterID) {
        for (Renter renter : renters) {
            if (renter.getRenterId() == renterID && renter.getRentedCars().isEmpty()) {
                renters.remove(renter);
                System.out.println("Renter with ID " + renterID + " removed successfully.");
                return;
            }
        }
        System.out.println("Renter with ID " + renterID + " cannot be removed or has rented cars.");
    }
}


public class CRS {
	 public static void main(String[] args) {
	        Car C1 = new CompactCar(221, "Toyota", "B-Class", 2022, false, 500, "72x1", 300);


	        Car C2 = new SUV(222, "Honda", "C-Class", 2022, false, 1300, "34X1", 600);


	        Car C3 = new Luxury(223, "G-Wagon", "D-Class", 2022, false, 6100, "23-X2", 1200);


	        Renter R1 = new RegularRenter(270, "Zaid", "ZaidRajput477@gmail.com", 22343, "G11/3-PHA FLat");
	        Renter R2= new FrequentRenter(271, "hamza", "Hamzaraja@gmail.com", 2233243, "F-10/3-house 24");
	        CarRentalSystem crs = new CarRentalSystem();
	        crs.addCar(C1);
	        crs.addCar(C2);
	        crs.addCar(C3);
	        crs.addRenter(R1);

	        Scanner scanner = new Scanner(System.in);

	        boolean exit = false;

	        while (!exit) {
	            System.out.println();

	            System.out.println("---------------------------------------------------------------------------------------------------------------");
	            System.out.println();
	            System.out.println("Welcome to the Car Rental System [ CRS ]");
	            System.out.println("1. Display Available Cars And Renters");
	            System.out.println("2. Add Car by Renter");
	            System.out.println("3. Remove Car by Renter");
	            System.out.println("4. Add Renter into CRS");
	            System.out.println("5. Remove Renter from CRS");
	            System.out.println("6. Remove a Car From the CRS");
	            System.out.println("7. Display Rental Details");
	            System.out.println("8. Calculate and Display Total Rental Cost");
	            System.out.println("9. Remove All Car by Renter");
	            System.out.println("10. Add Car to the CRS ");
	            System.out.println("11. Exit");
	            System.out.print("Select an option: ");
	            int option = scanner.nextInt();
	            System.out.println();

	            System.out.println("---------------------------------------------------------------------------------------------------------------");
	            System.out.println();
	            switch (option) {
	                case 1:
	                    System.out.println("---------------------------------------------------------------------------------------------------------------");
	                    /*  R1.AllCarStutus();*/
	                    System.out.println("                                           < CAR AVAILABLE  >");

	                    crs.displayAvailableCars();
	                    System.out.println("                                           < RENTER DETAILS >");

	                    crs.displayRenterDetails();
	                    break;
	                case 2:
	                    System.out.println("                                           < ADDING CARS BY RENTER >");

	                    System.out.println("---------------------------------------------------------------------------------------------------------------");
	                    System.out.println(C1.toString());

	                    System.out.println("Do you want to Add Car Then press [ 1 ] :");
	                    int x2=scanner.nextInt();
	                    if(x2==1){
	                        R1.AddCar(C1, 232);

	                    }
	                    else{
	                        System.out.println("CAR NOT ADDED ");
	                    }
	                    System.out.println("---------------------------------------------------------------------------------------------------------------");

	                    System.out.println(C2.toString());

	                    System.out.println("Do you want to Add Car Then press [ 1 ] :");
	                    int x3=scanner.nextInt();
	                    if(x3==1){
	                        R1.AddCar(C2, 4545);

	                    } else{
	                        System.out.println("CAR NOT ADDED ");
	                    }
	                    System.out.println("---------------------------------------------------------------------------------------------------------------");

	                    System.out.println(C3.toString());

	                    System.out.println("Do you want to Add Car Then press [ 1 ] :");
	                    int x4=scanner.nextInt();
	                    if(x4==1){
	                        R1.AddCar(C3, 222);

	                    } else{
	                        System.out.println("CAR NOT ADDED ");
	                    }

	                    System.out.println();



	                    break;
	                case 3:
	                    System.out.println("                                           < REMOVING CARS BY RENTER >");

	                    System.out.println("---------------------------------------------------------------------------------------------------------------");

	                    System.out.println(C1.toString());

	                    System.out.println("Do you want to Remove Car Then press [ 1 ] :");
	                    int x21=scanner.nextInt();
	                    if(x21==1){
	                        R1.RemoveCar(C1);

	                    }
	                    else{
	                        System.out.println("CAR NOT Removed ");
	                    }
	                    System.out.println("---------------------------------------------------------------------------------------------------------------");

	                    System.out.println(C2.toString());

	                    System.out.println("Do you want to Remove Car Then press [ 1 ] :");
	                    int x31=scanner.nextInt();
	                    if(x31==1){
	                        R1.RemoveCar(C2);

	                    } else{
	                        System.out.println("CAR NOT REMOVED ");
	                    }
	                    System.out.println("---------------------------------------------------------------------------------------------------------------");

	                    System.out.println(C3.toString());

	                    System.out.println("Do you want to Remove Car Then press [ 1 ] :");
	                    int x41=scanner.nextInt();
	                    if(x41==1){
	                        R1.RemoveCar(C3);

	                    } else{
	                        System.out.println("CAR NOT REMOVED1 ");
	                    }

	                    System.out.println();


	                    break;
	                case 4:
	                    addRenter(crs);
	                    break;
	                case 5:
	                    removeRenter(crs);
	                    break;
	                case 6:
	                    crs.displayAvailableCars();
	                    System.out.println("Which car you want to Remove from the System. Enter The ID of Car : ");
	                    int xp=scanner.nextInt();
	                    crs.removeCar(xp);
	                  //  rentCar(carRentalSystem);
	                    break;
	                case 7:
	                    System.out.println("---------------------------------------------------------------------------------------------------------------");
	                    System.out.println("                                           < CAR STATUS >");

	                    System.out.println();
	                    R1.AllCarStutus();
	                    System.out.println();
	                    break;
	                case 8:
	                    System.out.println("---------------------------------------------------------------------------------------------------------------");
	                    System.out.println("                                           < TOTAL CALCULATIONS >");
	                    System.out.println();
	                    System.out.println("TOTAL CALCULATION :" + R1.calculateTotalRentalFee());
	                    break;
	                case 9:
	                    System.out.println("---------------------------------------------------------------------------------------------------------------");

	                    R1.RemoveCar(C2);
	                    R1.RemoveCar(C1);
	                    R1.RemoveCar(C3);
	                    System.out.println("All car removed successfully!!");
	                    System.out.println("---------------------------------------------------------------------------------------------------------------");

	                    break;
	                case 10:
	                    System.out.println("---------------------------------------------------------------------------------------------------------------");
	                    addCar(crs);

	                     break;
	                case 11:
	                    exit = true;
	                    System.out.println("Exiting the system. Goodbye!");
	                    break;
	                default:
	                    System.out.println("Invalid option. Please select again.");
	            }
	        }
	        scanner.close();

	    }
	    public static void addCar(CarRentalSystem carRentalSystem) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter Car details:");
	        System.out.print("Car ID: ");
	        int carID = scanner.nextInt();
	        System.out.print("Brand: ");
	        String brand = scanner.next();
	        System.out.print("Model: ");
	        String model = scanner.next();
	        System.out.print("Year: ");
	        int year = scanner.nextInt();
	        System.out.print("Rental Status (true/false): ");
	        boolean rentalStatus = scanner.nextBoolean();
	        System.out.print("Rental Fee: ");
	        double rentalFee = scanner.nextDouble();
	        System.out.print("Plate Number: ");
	        String plateNumber = scanner.next();

	        // Add car to the system
	        Car car = new Car(carID, brand, model, year, rentalStatus, rentalFee, plateNumber);
	        carRentalSystem.addCar(car);
	        System.out.println("Car added successfully.");
	    }
	    public static void addRenter(CarRentalSystem carRentalSystem) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Which Type of Renter you Are :");
	        System.out.println("1. Regular Renter");
	        System.out.println("2. Frequent Renter");
	        System.out.println("3. Corporate Renter");
	    int tx=scanner.nextInt();
	    if(tx==1){
	        System.out.println("Enter Renter details:");
	        System.out.print("Renter ID: ");
	        int renterId = scanner.nextInt();
	        System.out.print("Name: ");
	        String name = scanner.next();
	        System.out.print("Email: ");
	        String email = scanner.next();
	        System.out.print("Phone Number: ");
	        double phoneNumber = scanner.nextDouble();
	        System.out.print("Address: ");
	        String address = scanner.next();

	        // Add renter to the system
	        Renter renter = new RegularRenter(renterId, name, email, phoneNumber, address);
	        carRentalSystem.addRenter(renter);
	        System.out.println("Renter added successfully.");
	    }
	    else if(tx==2){
	        System.out.println("Enter Renter details:");
	        System.out.print("Renter ID: ");
	        int renterId = scanner.nextInt();
	        System.out.print("Name: ");
	        String name = scanner.next();
	        System.out.print("Email: ");
	        String email = scanner.next();
	        System.out.print("Phone Number: ");
	        double phoneNumber = scanner.nextDouble();
	        System.out.print("Address: ");
	        String address = scanner.next();

	        // Add renter to the system
	        Renter renter = new FrequentRenter(renterId, name, email, phoneNumber, address);
	        carRentalSystem.addRenter(renter);
	        System.out.println("Renter added successfully.");
	    }
	    else if(tx==3){
	        System.out.println("Enter Renter details:");
	        System.out.print("Renter ID: ");
	        int renterId = scanner.nextInt();
	        System.out.print("Name: ");
	        String name = scanner.next();
	        System.out.print("Email: ");
	        String email = scanner.next();
	        System.out.print("Phone Number: ");
	        double phoneNumber = scanner.nextDouble();
	        System.out.print("Address: ");
	        String address = scanner.next();

	        // Add renter to the system
	        Renter renter = new CorporateRenter(renterId, name, email, phoneNumber, address) {
	        };
	        carRentalSystem.addRenter(renter);
	        System.out.println("Renter added successfully.");
	    }
	    else{
	        System.out.println("Not added");
	    }


	    }

	    public static void removeRenter(CarRentalSystem carRentalSystem) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Renter ID to remove: ");
	        int renterID = scanner.nextInt();

	        // Remove renter from the system
	        carRentalSystem.removeRenter(renterID);
	    }
}
