package Car;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    void result() {
        System.out.println(brand+model+", "+productionYear+" год выпуска, "+"сборка в "+productionCountry+", "+color +" цвета,"+" обьем двигателя - " +engineVolume);
    }

}
