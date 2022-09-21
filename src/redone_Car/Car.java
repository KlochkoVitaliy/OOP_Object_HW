package redone_Car;

    public class Car {
        String brand;
        String model;
        double engineVolume;
        String color;
        int productionYear;
        String productionCountry;

        Car(String brand, String model, int productionYear, String productionCountry, String color,double engineVolume){
         this.brand=brand;
         this.model=model;
         this.productionYear=productionYear;
         this.productionCountry=productionCountry;
         this.color=color;
         this.engineVolume=engineVolume;
        }

        void result() {
            System.out.println(brand+model+", "+productionYear+" год выпуска, "+"сборка в "+productionCountry+", "+color +" цвета,"+" обьем двигателя - " +engineVolume);
        }

    }

