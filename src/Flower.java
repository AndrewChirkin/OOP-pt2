import java.text.DecimalFormat;

public class Flower {
    private final String name;
    private String color;
    private String country;
    private double cost;
    public int lifeSpan;

    public Flower(String name, String color, String country, double cost, int lifeSpan) {
        this.name = name;
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (country != null && !country.isBlank() && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
        if (cost <= 0) {
            System.out.println("Некорректно указана цена!");
        }else {
//            DecimalFormat formattedCost = new DecimalFormat("0.00").format(formattedCost);
            this.cost = cost;
        }
        if (lifeSpan < 0 && lifeSpan % 1 != 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

    }


    public String getColor() {
        return this.color;
    }

    public void setFlowerColor(String color) {
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = "белый";
        }
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        if (country != null && !country.isBlank() && !country.isEmpty()) {
            this.country = country;
        } else {
            this.country = "Россия";
        }
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            System.out.println("Некорректно указана цена!");
        }
//        String formattedCost = String.format("%.2f", cost);
//        this.cost = new DecimalFormat("0.00").format(cost);
        this.cost = cost;

    }

    public int getLifeSpan() {
        return this.lifeSpan;
    }

    public void setLifeSpan() {
        if (lifeSpan < 0 && lifeSpan % 1 != 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    public String getName() {
        return this.name;
    }

    public void flowerInfo() {
        System.out.println(getName() + ": страна происхождения - " + getCountry() + ", стоимость - " + getCost() + " руб., срок стояния цветка - " + getLifeSpan() + " суток.");
    }
    public void getBouquet(int quantityOfRose, int quantityOfChrizo, int quantityOfPion, int quantityOfGipsophyla){
        double price = (quantityOfRose * getCost() + quantityOfChrizo * getCost() + quantityOfPion * getCost() + quantityOfGipsophyla * getCost()) * 1.1;

    }
}
