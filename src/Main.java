public class Main {
    public static void main(String[] args){
        Driver d1= new Driver("John", "D001");
        Driver d2= new Driver("Anna", "D002");

        Vehicle car = new Car("Toyota", 2020, 4, "Petrol");
        Vehicle motorcycle = new Motorcycle("Idk", 2021, false);
        Vehicle truck = new Truck("Mercedes", 2025, 15.5, 4);
        Vehicle electtruck = new ElectricTruck("Tesla", 2022, 20.0, 4, 500.0);

        car.setDriver(d1);
        motorcycle.setDriver(d2);
        truck.setDriver(d1);
        electtruck.setDriver(d2);

        Vehicle[] vehicles = {car, motorcycle, truck, electtruck};
        for (Vehicle v: vehicles){
            v.startEngine();
            v.displayInfo();
            if(v.getDriver()!=null){
                v.getDriver().displayDriverInfo();
            }
            v.stopEngine();
            System.out.println("\n");
        }
    }
}