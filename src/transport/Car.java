package transport;

public class Car {
    private  String brand;
    private  String model;
    private String color;
    private final int productionYear;
    private final double engineVolume;
    private String productionCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String tireType;

    public Car(String brand, String model, String color, int productionYear, double engineVolume, String productionCountry, String transmission,String bodyType, String registrationNumber, int numberOfSeats, String tireType) {
        if(brand != null && !brand.isBlank() && !brand.isEmpty()){
            this.brand = brand;
        } else {
            System.out.println("Информация не указана.");
        }
        if(color != null && !color.isBlank() && !color.isEmpty()){
            this.color = color;
        } else {
            System.out.println("Информация не указана.");
        }
        if(engineVolume < 0){
            this.engineVolume = Math.abs(engineVolume);
        }else {
            this.engineVolume = engineVolume;
        }
        if(model != null && !model.isBlank() && !model.isEmpty()){
            this.model = model;
        } else {
            System.out.println("Информация не указана.");
        }
        this.productionYear = productionYear;
        if(productionCountry != null && !productionCountry.isBlank() && !productionCountry.isEmpty()){
            this.productionCountry = productionCountry;
        } else {
            System.out.println("Информация не указана.");
        }
        if(transmission != null && !transmission.isBlank() && transmission.isEmpty()){
            this.transmission = transmission;
        } else {
            System.out.println("Информация не указана.");
        }
        if(bodyType != null && !bodyType.isBlank() && !bodyType.isEmpty()){
            this.bodyType = bodyType;
        } else {
            System.out.println("Информация не указана.");
        }
        if(registrationNumber != null && !registrationNumber.isBlank() && !registrationNumber.isEmpty()){
            this.registrationNumber = registrationNumber.toLowerCase();
        } else {
            System.out.println("Информация не указана.");
        }
        this.numberOfSeats = numberOfSeats;
        if(tireType != null && !tireType.isBlank() && !tireType.isEmpty() && (tireType == "зимняя" || tireType == "летняя")){
            this.tireType = tireType;
        } else {
            System.out.println("Информация не указана.");
        }

    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }
    public String getColor(){
        return this.color;
    }
    public int getProductionYear(){
        return this.productionYear;
    }
    public double getEngineVolume(){
        return this.engineVolume;
    }
    public String getProductionCountry(){
        return this.productionCountry;
    }


    public String getTransmission() {
        return this.transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber.toLowerCase();//.replace(' ','') - почему-то не работает, хотя в шпаргалке приводится//
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTireType() {
        return tireType;
    }

    public void setTireType(String tireType) {
        if(tireType == "зимняя" || tireType == "летняя") {
            this.tireType = tireType;
        }else {
            System.out.println("Укажите тип резины(летняя или зимняя).");
        }
    }
    public void carInfo(){
        System.out.println("Машина - " + brand + " " + model + ", " + productionYear + " года выпуска\n страна производства " + productionCountry + ", цвет - " + color + ", объём двигателя  - " + engineVolume + " литров\n коробка передач - " + transmission + "\n тип кузова - " + bodyType + "\n регистрационный номер - " + registrationNumber + "\n количество мест - " + numberOfSeats + "\n резина - " + tireType);
    }

}