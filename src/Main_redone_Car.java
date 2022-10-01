import Transport.Train;
import Transport.Car_redone;
import Transport.Bus;

import java.time.LocalDate;

public class Main_redone_Car {
    public static void main(String[] args) {
        System.out.println();

        Car_redone c1 = new Car_redone("Lada ", "Grande", 2015, "России", "желтого", 1.7);
        c1.setRegistrationNumber("в145уо123");
        System.out.println(c1.isCorrectRegNumber());

        Car_redone c2 = new Car_redone("Audi ", "A8 50 L TDI quattro", 2020, "Германии", "черный ", 3.0);
        c2.setGearBox("AT");
        c2.setTiresWinOrSum(false);
        c2.setInsurance(new Car_redone.Insurance(LocalDate.now(), 30_000, "54231349"));
        c2.getInsurance().checkExpireDate();
        c2.getInsurance().checkNumber();
        c2.setFuel("Дизель");

        Car_redone c3 = new Car_redone("BMW ", "Z8", 2021, "Германии", "черный ", 3.0);
        c3.setTiresWinOrSum(false);
        c3.setKey(new Car_redone.Key(true, true));
        c3.setFuel("Электро");

        Car_redone c4 = new Car_redone("Kia ", "Sportage 4 поколение", 2018, "Южной Корее", "красный ", 2.4);
        Car_redone c5 = new Car_redone("Hyundai ", "Avante", 2016, "Южной Корее", "оранжевый ", 1.6);

        System.out.println();
        printInfoCar(c1);
        printInfoCar(c2);
        printInfoCar(c3);
        printInfoCar(c4);
        printInfoCar(c5);

        System.out.println();

        Train t1 = new Train("Ласточка", "В-901", 2011, "Россия", 301, 3500, 0, "Белорусский вокзал", "Минск-Пассажирский", 11);
        Train t2 = new Train("Ленинград", "D-125", 2019, "Россия", 270, 1700, 0, "Ленинградский вокзал", "Ленинград-Пассажирский", 8);

        System.out.println();
        printInfoTrain(t1);
        printInfoTrain(t2);

        System.out.println();

        Bus b1 = new Bus("Экарус", "В-52", 1991, "Россия", "Красный", 150);
        Bus b2 = new Bus("Луаз", "Ли-2", 1984, "Россия", "Желтый", 100);
        Bus b3 = new Bus("Пазик", "ПА-2", 1981, "Россия", "Белый", 120);

        System.out.println();
        printInfoBus(b1);
        printInfoBus(b2);
        printInfoBus(b3);

    }

    public static void printInfoCar(Car_redone car_redone) {
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
                        ", срок действия страховки: " + car_redone.getInsurance().getInsuranceValPer()+
                        ", топливо: "+car_redone.getFuel()
        );
    }

    public static void printInfoTrain(Train train) {
        System.out.println(
                train.getBrand() + " " + train.getModel() +
                        ", год выпуска " + train.getProductionYear() +
                        ", страна сборки " + train.getProductionCountry() +
                        ", скорость передвижения -  " + train.getMaxSpeed() +
                        ", цена проезда - " + train.getPriceOfTrip() +
                        ", отходит от - " + train.getStationName() +
                        ", следует до - " + train.getFinalStop() +
                        ", в поезде - " + train.getNumberOfWagons() + " вагонов."
        );
    }

    public static void printInfoBus(Bus bus) {
        System.out.println(
                bus.getBrand() + " " + bus.getModel() +
                        ", год выпуска " + bus.getProductionYear() +
                        ", страна сборки " + bus.getProductionCountry() +
                        ", скорость передвижения -  " + bus.getMaxSpeed() +
                        ", цвет - " + bus.getColor() +
                        ", скорость - " + bus.getMaxSpeed()
        );
    }
}
