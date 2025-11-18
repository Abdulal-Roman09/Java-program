public class Distance {

    int km;
    int m;

    // Constructor
    Distance(int km, int m) {
        this.km = km;
        this.m = m;
    }

    // Convert distance to meters
    public int toMeters() {
        return km * 1000 + m;
    }

    // Convert distance to kilometers (with decimal)
    public double toKiloMeters() {
        return km + m / 1000.0; // use 1000.0 to get decimal
    }

    // Main method
    public static void main(String[] args) {
        Distance dist = new Distance(5, 750);

        System.out.println("Distance in meters: " + dist.toMeters());
        System.out.println("Distance in kilometers: " + dist.toKiloMeters());
    }
}
