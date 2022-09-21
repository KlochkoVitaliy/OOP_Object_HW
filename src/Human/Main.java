package Human;

import Human.Human;

public class Main {
    public static void main(String[] args) {

        //Task 1

        System.out.println();

        Human h1 = new Human();
        h1.name = "Максим";
        h1.town = "Минск";
        h1.yearOfBirth = 2022-35;
        h1.job = "бренд-менеджера";        // Task 2
        h1.result();

        System.out.println();

        Human h2 = new Human();
        h2.name = "Анна";
        h2.town = "Москва";
        h2.yearOfBirth = 2022-29;
        h2.job = "методиста образовательных программ";         // Task 2
        h2.result();

        System.out.println();

        Human h3 = new Human();
        h3.name = "Катя";
        h3.town = "Калининград";
        h3.yearOfBirth = 2022 - 28;
        h3.job="продакт-менеджера";            // Task 2
        h3.result();

        System.out.println();

        Human h4 = new Human();
        h4.name = "Артем";
        h4.town = "Москва";
        h4.yearOfBirth = 2022-27;
        h4.job="директора по развитию бизнеса";            // Task 2
        h4.result();

    }
}