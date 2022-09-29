package Transport;

public class Transport {

    private  String brand;
    private  String model;
    private  int productionYear;
    private   String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry ) {
        this(brand,model,productionYear,productionCountry,"Белый",1000);

        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.productionYear = productionYear;

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
        if (maxSpeed == 0) {
            this.maxSpeed = 1000;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
    public Transport(String brand, String model, int productionYear, String productionCountry, String color,int maxSpeed) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.productionYear = productionYear;

        if (productionCountry == null) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (maxSpeed == 0) {
            this.maxSpeed = 1000;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public  String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null) {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if(maxSpeed==0){
            this.maxSpeed=1000;
        }else{
            this.maxSpeed = maxSpeed;
        }
    }
}
