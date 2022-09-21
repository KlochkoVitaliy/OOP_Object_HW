package redone_Car;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Car c1 = new Car("Lada ","Grande",2015,"России","желтого",1.7);
        c1.result();

        Car c2 = new Car("Audi ","A8 50 L TDI quattro",2020,"Германии","черный ",3.0);
        c2.result();

        Car c3 = new Car("BMW ","Z8",2021,"Германии","черный ",3.0);
        c3.result();

        Car c4 = new Car("Kia ","Sportage 4 поколение",2018,"Южной Корее","красный ",2.4);
        c4.result();

        Car c5 = new Car("Hyundai ","Avante",2016,"Южной Корее","оранжевый ",1.6);
        c5.result();
    }
}
