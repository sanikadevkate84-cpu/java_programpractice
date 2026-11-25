package CombinedOOP;

public class VechicleonRent {
    public static void main(String[] args) {
        Car c = new Car();
        c.rent();
        Bike b = new Bike();
        b.rent();
        Truck t = new Truck();
        t.rent();
    }
}
