package redone_Human;

import java.time.LocalDate;

public class Human {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    private  int yearOfBirth;
    String name;
    private String town;
    String job;

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null) {
            this.town = "Информация не указана";
        } else {
            this.town = town;
        }
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth =  LocalDate.now().getYear() - yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
    }
    public Human(String name, String town, int yearOfBirth, String job) {
        if(name==null){
            this.name = "Информация не указана";
        }else {
            this.name = name;
        }
        if(town==null){
            this.town = "Информация не указана";
        }else {
            this.town = town;
        }
        if (yearOfBirth >= 0) {
            this.yearOfBirth =  LocalDate.now().getYear() - yearOfBirth;
        } else {
            this.yearOfBirth = 0;
        }
        if(job==null){
            this.job="Информация не указана";
        }else{
            this.job = job;
        }
    }

    void result() {
        System.out.println(ANSI_GREEN + "Привет! Меня зовут " + ANSI_RESET + name);
        System.out.println(ANSI_GREEN + "Я из города " + ANSI_RESET + town);
        System.out.println(ANSI_GREEN + "Я родился в " + ANSI_RESET + yearOfBirth + ANSI_GREEN + " году" + ANSI_RESET);
        System.out.println(ANSI_GREEN + "Я работаю на должности " + ANSI_RESET + job);
        System.out.println(ANSI_RED + "Будем знакомы!" + ANSI_RESET);
    }

}




