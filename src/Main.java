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

    }
    public static void tireWarning(String tireType){
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth >= 11 && tireType == "летняя"){
            System.out.println("Пора поменять резину на зимнюю!");
        }else if (currentMonth <= 4 && tireType == "зимняя"){
            System.out.println("Нужно поставить летнюю резину!");
        }else {
            System.out.println("Сезонные шины уже установлены");
        }
    }
    public static void insuranceValidity(LocalDate validity) {
        LocalDate now = LocalDate.now();
        if (validity.isBefore(now)) {
            System.out.println("Срок действия страховки истёк.");
        } else {
            System.out.println("Страховка действительна.");
        }
    }
    public static void insuranceNumberChecking(String number){
        if (number.length() < 9){
            System.out.println("Номер страховки некорректный!");
        }else {
            System.out.println("Всё в порядке!");
        }
    }
    }
