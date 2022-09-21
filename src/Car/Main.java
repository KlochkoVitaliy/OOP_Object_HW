package Car;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Car c1 = new Car();
        c1.brand = "Lada ";
        c1.model = "Grande";
        c1.productionYear = 2015;
        c1.productionCountry = "России";
        c1.color = "желтого";
        c1.engineVolume = 1.7;
        c1.result();

        Car c2 = new Car();
        c2.brand = "Audi ";
        c2.model = "A8 50 L TDI quattro";
        c2.productionYear = 2020 ;
        c2.productionCountry = "Германии";
        c2.color = "черный ";
        c2.engineVolume = 3.0;
        c2.result();

        Car c3 = new Car();
        c3.brand = "BMW ";
        c3.model = "Z8";
        c3.productionYear = 2021 ;
        c3.productionCountry = "Германии";
        c3.color = "черный ";
        c3.engineVolume = 3.0;
        c3.result();

        Car c4 = new Car();
        c4.brand = "Kia ";
        c4.model = "Sportage 4 поколение";
        c4.productionYear = 2018  ;
        c4.productionCountry = "Южной Корее";
        c4.color = "красный ";
        c4.engineVolume = 2.4;
        c4.result();

        Car c5 = new Car();
        c5.brand = "Hyundai ";
        c5.model = "Avante";
        c5.productionYear = 2016   ;
        c5.productionCountry = "Южной Корее";
        c5.color = "оранжевый ";
        c5.engineVolume = 1.6;
        c5.result();
    }
}
