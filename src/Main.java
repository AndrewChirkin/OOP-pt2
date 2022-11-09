import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Car Lada = new Car("Lada", "Granta", "жёлтый", 2015, 1.7,"Россия","","","",4,"летняя");
        Car Audi = new Car("Audi", "A8 50 L TDI quattro", "чёрный", 2020, 3.0,"Германия","","","",4,"летняя");
        Car BMW = new Car("BMW", "Z8", "чёрный", 2021, 3.0,"Германия","","","",4,"летняя");
        Car Kia = new Car("Kia", "Sportage 4-го поколения", "красный", 2018, 2.4,"Южная Корея","","","",4,"летняя");
        Car Hyundai = new Car("Hyundai", "Avante", "оранжевый", 2016, 1.6,"Южная Корея","","","",4,"летняя");
        Lada.carInfo();
        Audi.carInfo();
        BMW.carInfo();
        Kia.carInfo();
        Hyundai.carInfo();
    tireWarning("летняя");
    }
    public static void tireWarning(String tireType){
        String rezina = "летняя";
        LocalDate winter = null;
        int cold = winter.getMonthValue();
        if(tireType.equals(rezina) && cold == 12 ){
            System.out.println("Пора бы поставить зимнюю резину!");
        }else if(cold == 3){
            System.out.println("Пора ставить летнюю резину!");
        }
    }
}