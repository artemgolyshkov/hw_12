public class Main {
    public static boolean isLeapYear( int year) {
        return(year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        }



        private static void printLink(int os, int year) {
            if (os == 0) {
                if (year >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
                } else {
                    if (year >= 2015) {
                        System.out.print("Установите версию приложения для Android по ссылке");
                    } else {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    }
                }
            }

     public static int distanse (){
        int distanse = 78;
        return distanse;
     }
 public static int calculateDeliveryDays (int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else if (distance < 100){
            return 3;
        } else {
            return -1;
        }
 }
 public static void printDays (int distance){
        int deliveryDays = calculateDeliveryDays(distance);
        if (deliveryDays < 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Доставка займет " + deliveryDays + " дней");
        }

 }

    public static void main(String[] args) {
        task1();
        task2();
        task3();


    }
    public static void task1() {
        System.out.println("Задача 1");
        if (isLeapYear(1856)) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год невысокосный");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        printLink(0,2014);
    }
    public static void task3() {
        System.out.println("Задача 3");
        printDays(101);

    }
}