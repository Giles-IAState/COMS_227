import hw1.AirportVan;

public class VanTest {

    public static void main(String[] args) {

        AirportVan v = new AirportVan(12, 10, 5, 3);

        v.pickUp();
        v.pickUp();
        v.drive(10, 20);
        System.out.println(v.getRiderCount());
        System.out.println("Expected: 2");
        System.out.println(v.getTotalPay(.02));
        System.out.println("Expected: ");
    }
}
