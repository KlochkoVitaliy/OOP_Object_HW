import Car.Car;
import Transport.Car_redone;

import java.time.LocalDate;

public class Main_redone_Car {
    public static void main(String[] args) {
        System.out.println();

        Car_redone c1 = new Car_redone("Lada ", "Grande", 2015, "России", "желтого", 1.7);
        //c1.result();
        c1.setRegistrationNumber("в145уо123");
        System.out.println(c1.isCorrectRegNumber());

        Car_redone c2 = new Car_redone("Audi ", "A8 50 L TDI quattro", 2020, "Германии", "черный ", 3.0);
        //c2.result();
        c2.setGearBox("AT");
        c2.setTiresWinOrSum(false);
        c2.setInsurance(new Car_redone.Insurance(LocalDate.now(), 30_000, "54231349"));
        c2.getInsurance().checkExpireDate();
        c2.getInsurance().checkNumber();

        Car_redone c3 = new Car_redone("BMW ", "Z8", 2021, "Германии", "черный ", 3.0);
        //c3.result();
        c3.setTiresWinOrSum(false);
        c3.setKey(new Car_redone.Key(true, true));

        Car_redone c4 = new Car_redone("Kia ", "Sportage 4 поколение", 2018, "Южной Корее", "красный ", 2.4);
        //c4.result();

        Car_redone c5 = new Car_redone("Hyundai ", "Avante", 2016, "Южной Корее", "оранжевый ", 1.6);
        //c5.result();

        System.out.println();
        printInfo(c1);
        printInfo(c2);
        printInfo(c3);
        printInfo(c4);
        printInfo(c5);

    }

    public static void printInfo(Car_redone car_redone) {
        System.out.println(
                car_redone.getBrand() + " " + car_redone.getModel() +
                        ", год выпуска " + car_redone.getProductionYear() +
                        ", страна сборки " + car_redone.getProductionCountry() +
                        ", цвет кузова " + car_redone.getColor() +
                        ", обьем двигателя " + car_redone.getEngineVolume() +
                        ", коробка передач - " + car_redone.getGearBox() +
                        ", тип кузова - " + car_redone.getBody() +
                        ", рег.номер - " + car_redone.getRegistrationNumber() +
                        ", кол-во мест - " + car_redone.getNumberOfSeats() +
                        ",  " + (car_redone.isSummerTyres() ? "летняя" : "зимняя") + "резина" +
                        ", " + (car_redone.getKey().isKeylessAccess() ? "безключевой доступ" : "ключевой") +
                        ", " + (car_redone.getKey().isDisStart() ? "удаленный запуск" : "не удаленный запуск") +
                        ", номер страховки: " + car_redone.getInsurance().getNumOfInsurance() +
                        ", стоимость страховки: " + car_redone.getInsurance().getCostInsurance() +
                        ", срок действия страховки: " + car_redone.getInsurance().getInsuranceValPer()
        );
    }
}
