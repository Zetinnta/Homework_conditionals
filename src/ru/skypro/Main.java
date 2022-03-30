package ru.skypro;

public class Main {
/*
    По невнимательности забыл изначально создать новую ветку перед тем,
    как начать писать код. Прошу прощения
*/

    public static void main(String[] args) {

        int clientOS = 0;
        int clientDeviceYear = 2015;

        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }

        int year = 900;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0);
        if (isLeapYear) {
            System.out.println(year + " год является високосным.");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        int deliveryDistance = 3;
        int daysTillReceive;
        boolean isNear = deliveryDistance <= 20;
        boolean isNotThatFar = deliveryDistance >20 && deliveryDistance <= 60;
        boolean isFarFarAway = deliveryDistance > 60 && deliveryDistance <= 100;
        if (isNear) {
            daysTillReceive = 1;
            System.out.println("Потребуется дней: " + daysTillReceive);
        } else if (isNotThatFar) {
            daysTillReceive = 2;
            System.out.println("Потребуется дней: " + daysTillReceive);
        } else if (isFarFarAway) {
            daysTillReceive = 3;
            System.out.println("Потребуется дней: " + daysTillReceive);
        }

        int monthNumber = 6;

        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого сезона не существует");
        }
    }
}
