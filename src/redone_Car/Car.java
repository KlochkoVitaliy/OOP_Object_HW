package redone_Car;
    public class Car {
        String brand;
        String model;
        double engineVolume;
        String color;
        int productionYear;
        String productionCountry;

        Car(String brand, String model, int productionYear, String productionCountry, String color,double engineVolume) {
            if (brand == null) {
                this.brand = "default";
            } else {
                this.brand = brand;
            }
            if (model == null) {
                this.model = "default";
            } else {
                this.model = brand;
            }
          if(productionYear==0){
              this.productionYear=2000;
          }else{
              this.productionYear = productionYear;
          }
            if (productionCountry == null) {
                this.productionCountry = "default";
            } else {
                this.productionCountry = brand;
            }
            if (color == null) {
                this.color = "белый";
            } else {
                this.color = color;
            }
            if (engineVolume == 0) {
                this.engineVolume = 1.5;
            } else {
                this.engineVolume = engineVolume;
            }
        }
        void result() {
            System.out.println(brand+model+", "+productionYear+" год выпуска, "+"сборка в "+productionCountry+", "+color +" цвета,"+" обьем двигателя - " +engineVolume);
        }

    }

