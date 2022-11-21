import java.time.LocalDate;
public class Main {
    public static void checksYear(int year) {
        if(year % 4 == 0 && year % 100 > 0) {
            System.out.println(year + " номер года — високосный год");
        } else if(year % 100 == 0 && year % 400 == 0) {
            System.out.println(year + " номер года — високосный год");
        } else {
            System.out.println(year + " номер года — не високосный год");
        }
    }
    public static String getType(int type) {
        if(type == 1) {
            return "Андроид";
        } else {
            return "IOS";
        }
    }
    public static String getTypeOfVersion(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        if(deviceYear == currentYear) {
            return "обычную";
        } else {
            return "lite";
        }
    }
    public static void distance(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Потребуется сутки для доставки");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: 3");
        }
    }
    public static void installationOS(int type, int deviceYear) {
        String os = getType(type);
        String typeOfVersion = getTypeOfVersion(deviceYear);
        System.out.println("Установите " + typeOfVersion + " версию для приложения " + os);
    }
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int year = 2023;
        checksYear(year);
        // Задание 2
        System.out.println("Задание 2");
        int clientOS = 0;
        int clientDeviceYear = 2015;
        installationOS(clientOS, clientDeviceYear);
        // Задание 3
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        distance(deliveryDistance);
    }
}