public class Main {
    public static void main(String[] args) {
        Car carGranta = new Car("Lada", "Granta", 1.7, "yellow", 2015, "Russia");

        Car carA8 = new Car("Audi", "A8", 3.0, "black", 2020, "Germany");

        Car carZ8 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");

        Car carSportage = new Car("KIA", "Sportage", 2.4, "red", 2016, "South Korea");

        Car carAvante = new Car("Hyundai", "Avante", 1.6, "orange", 2016, "South Korea");

        System.out.println(carGranta.toString());
        System.out.println(carA8.toString());
        System.out.println(carZ8.toString());
        System.out.println(carSportage.toString());
        System.out.println(carAvante.toString());
    }
}