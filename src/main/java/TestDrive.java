public class TestDrive {
    public static void main(String... args) {
        Car vendorCode_10983 = new Car();
        vendorCode_10983.brand = "BMW";
        vendorCode_10983.model = "XC7601";
        vendorCode_10983.yearOfCreation = 2016;
        vendorCode_10983.mileage = 5478;
        vendorCode_10983.enginePower = 317;

        Car vendorCode_92 = new Car();
        vendorCode_92.brand = "Tesla";
        vendorCode_92.model = "X_Plaid";
        vendorCode_92.yearOfCreation = 2021;
        vendorCode_92.enginePower = 1034;
        vendorCode_92.smartCar = true;

        vendorCode_10983.characteristics();
        vendorCode_10983.startTheEngine();

        vendorCode_92.characteristics();
        vendorCode_92.startTheEngine();
    }
}
