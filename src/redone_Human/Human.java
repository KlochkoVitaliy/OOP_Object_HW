package redone_Human;

public class Human {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    int yearOfBirth;
    String name;
    String town;
    String job;

    Human(String name, String town, int yearOfBirth, String job) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = 2022 - yearOfBirth;
        this.job = job;
    }

    void result() {
        System.out.println(ANSI_GREEN + "Привет! Меня зовут " + ANSI_RESET + name);
        System.out.println(ANSI_GREEN + "Я из города " + ANSI_RESET + town);
        System.out.println(ANSI_GREEN + "Я родился в " + ANSI_RESET + yearOfBirth + ANSI_GREEN + " году" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Я работаю на должности " + ANSI_RESET + job);
        System.out.println(ANSI_RED + "Будем знакомы!" + ANSI_RESET);
    }

}


