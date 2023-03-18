public class Main {
    public static int year() {
        int year = 1854;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return 1;
        }else {
            return 0;
        }
    }
    public static void run(String[] args) {
        String osName = "iOS";
        int clientOS = getClientOS(osName);
    }
    public static int getClientOS(String name) {
        if (name.equals("iOS")) {
            return 0;
        } else {
            return 1;
        }
    }
     public static int distanse (){
        int distanse = 78;
        return distanse;
     }
 public static int calkulate (int distance) {
        if (distance < 20) {
            return 1;
        } else if (distance < 60) {
            return 2;
        } else {
            return -1;
        }
 }
 public static void printDays (int distance){
        int deliveryDays = calkulate(distance);
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
        if (year() > 0) {
            System.out.println("Год высокосный");
        } else {
            System.out.println("Год невысокосный");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        printDays(20);

    }
}