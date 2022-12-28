public class Main {
    public static void main(String[] args) {
        Car carGranta = new Car();
        carGranta.brand = "Lada";
        carGranta.model = "Granta";
        carGranta.color = "yellow";
        carGranta.country = "Russia";
        carGranta.engineVolume = 1.7;
        carGranta.year = 2015;

        Car carA8 = new Car();
        carA8.brand = "Audi";
        carA8.model = "A8";
        carA8.color = "black";
        carA8.country = "Germany";
        carA8.engineVolume = 3.0;
        carA8.year = 2020;

        Car carZ8 = new Car();
        carZ8.brand = "BMW";
        carZ8.model = "Z8";
        carZ8.color = "black";
        carZ8.country = "Germany";
        carZ8.engineVolume = 3.0;
        carZ8.year = 2021;

        Car carSportage = new Car();
        carSportage.brand = "KIA";
        carSportage.model = "Sportage";
        carSportage.color = "red";
        carSportage.country = "South Korea";
        carSportage.engineVolume = 2.4;
        carSportage.year = 2016;

        Car carAvante = new Car();
        carAvante.brand = "Hyundai";
        carAvante.model = "Avante";
        carAvante.color = "orange";
        carAvante.country = "South Korea";
        carAvante.engineVolume = 1.6;
        carAvante.year = 2016;

        System.out.println(carGranta.toString());
        System.out.println(carA8.toString());
        System.out.println(carZ8.toString());
        System.out.println(carSportage.toString());
        System.out.println(carAvante.toString());
    }
}