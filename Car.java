public class Car {

    private String carID;
    private String carModel;
    private  String carBrand;
    private double basePrice;
    private boolean isAvailable;

    public Car(String carID, String carModel, String carBrand, double basePrice)
    {
        this.carID = carID;
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.basePrice = basePrice;

        this.isAvailable = true;
    }

    public String getCarID() {
        return carID;
    }

    public String getCarModel() {
        return carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public double calculatePrice(int rentalDays) {
        return basePrice * rentalDays;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void rent()
    {
        isAvailable = false;
    }

    public void returnCar()
    {
        isAvailable = true;
    }
}