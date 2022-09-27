package Flower;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

    public static void main(String[] args) {
        System.out.println();
        Flower f1 = new Flower("Роза обыкновенная ", " Голландия", 35.59);
        f1.result();
        Flower f2 = new Flower("Хризантема ", 15, 5);
        f2.result();
        Flower f3 = new Flower("Пион из Англии ", 69.9, 1);
        f3.result();
        Flower f4 = new Flower("Гипсофила ", " Турция", 19.5, 10);
        f4.result();

        System.out.println();
// Cостав букета

        double costFlower;
        double floristWork;
        int a, b;
        int term;
        String structure;
        structure = f1.getFlowerColor() + ", " + f2.getFlowerColor() + ", " + f4.getFlowerColor() + ". ";
        costFlower = (f1.getCost() * 3) + (f2.getCost() * 5) + f4.getCost();            //106.77 + 75 + 19.5 = 201.27
        floristWork = costFlower * 0.1 + costFlower;                                                    // 221.39
        a = Math.min(f1.lifeSpan, f2.lifeSpan);
        b = Math.min(f1.lifeSpan, f4.lifeSpan);
        term = Math.min(a, b);
        String firstStep = String.valueOf(floristWork);
        String secondStep = firstStep.replace('.', ' ');
        String thirdStep = secondStep.substring(0, 6);
        String result = thirdStep.substring(0, 3) + "." + thirdStep.substring(3);

        System.out.println();
        System.out.println(ANSI_GREEN + "Состав:  " + ANSI_RESET + structure + ANSI_GREEN + "Стоимость букета - " + ANSI_RESET + ANSI_RED + result + ANSI_RESET + ANSI_GREEN + " и простоит он - " + ANSI_RESET + term + ANSI_GREEN + " day/days." + ANSI_RESET);
    }
}

