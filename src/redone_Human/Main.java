package redone_Human;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Human h1 = new Human("Максим","Минск",35,"бренд-менеджера");
        h1.result();

        System.out.println();

        Human h2 = new Human("Анна","Москва",29,"методиста образовательных программ");
        h2.result();

        System.out.println();

        Human h3 = new Human("Катя","Калининград",28,"продакт-менеджера");
        h3.result();

        System.out.println();

        Human h4 = new Human("Артем","Москва",27,"директора по развитию бизнеса");
        h4.result();

        System.out.println();

        Human h5 = new Human("Владимир", "Казань", 21, "сейчас нигде не работает");
        h5.result();
    }
}
