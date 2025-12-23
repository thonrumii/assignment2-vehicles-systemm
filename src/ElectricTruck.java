public class ElectricTruck extends Truck{
    private double batteryCap;
    public ElectricTruck(String brand, int year, double capacity, int numAxles, double batteryCap){
        super(brand, year, capacity, numAxles);
        this.batteryCap=batteryCap;
    }

    @Override
    public void startEngine() {
        System.out.println("Electric truck powered on");
    }
    @Override
    public void stopEngine() {
        System.out.println("Electric truck powered off");
    }
}
