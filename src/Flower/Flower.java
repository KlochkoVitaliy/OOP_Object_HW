package Flower;

public class Flower {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan; //Срок стояния указанный в целых днях

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = ANSI_GREEN + ", страна происхождения - " + ANSI_RESET + country;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <=0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }

    public Flower(String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerColor == null) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = ANSI_GREEN + ", страна происхождения - " + ANSI_RESET + country;
        }
        if (cost <=0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
        if (lifeSpan >= 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public Flower(String flowerColor, double cost, int lifeSpan) {
        if (flowerColor == null) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        this.country = ", Россия";

        if (cost > 0 && cost != 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        if (lifeSpan >= 0) {
            this.lifeSpan = lifeSpan;
        } else {
            this.lifeSpan = 3;
        }
    }

    public Flower(String flowerColor, String country, double cost) {
        if (flowerColor == null) {
            this.flowerColor = "Белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null) {
            this.country = "Россия";
        } else {
            this.country = ANSI_GREEN + ", страна происхождения - " + ANSI_RESET + country;
        }
        if (cost > 0 && cost != 0) {
            this.cost = cost;
        } else {
            this.cost = 1;
        }
        this.lifeSpan = 3;
    }

    void result() {
        System.out.println(ANSI_RED + flowerColor + ANSI_RESET + country + ANSI_GREEN + ", стоимость шутки - " + ANSI_RESET + cost + ANSI_GREEN + " руб." + ANSI_RESET + ANSI_GREEN + ", срок стояния - " + ANSI_RESET + lifeSpan + ANSI_GREEN + " day/days" + ANSI_RESET);
    }
}
