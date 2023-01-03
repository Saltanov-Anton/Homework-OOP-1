public class Car {
    private String brand = "default";
    private String model = "default";
    private double engineVolume = 1.5;
    private String color = "white";
    private int year = 2000;
    private String country = "default";

    public Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand != null) {
            this.brand = brand;
        }

        if (model != null) {
            this.model = model;
        }

        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        }

        if (color != null) {
            this.color = color;
        }

        if (year > 0) {
            this.year = year;
        }

        if (country != null) {
            this.country = country;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                '}';
    }
}
