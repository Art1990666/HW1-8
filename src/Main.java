public class Main {

    public static void main(String[] args) {
        transient1();
        transient2();
        transient3();
        transient4();
        transient5();
        transient6();
        transient7();
        transient8();

    }

    public static void transient1() {
        System.out.println("HW-1!");
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total < 2_459_000) {
            total = total + salary;
            System.out.println(" Месяц " + i + " , сумма накоплений равна " + total + " рублей ");
            i = i + 1;
        }
    }

    public static void transient2() {
        System.out.println("HW-2!");
        int i = 1;
        while (i < 10) {
            System.out.print(i);
            i = i + 1;
        }
        System.out.println(i);
        for (int b = 10; b > 0; b = b - 1) {
            System.out.print(b);
        }
    }

    public static void transient3() {
        System.out.println("HW-3!");
        int population = 12_000_000;
        int fer = 17;
        int mor = 8;
        int L = fer - mor;
        int b = 10;
        for (int i = 1; i <= b; i++) {
            population += population * L / 1000;
            System.out.println(" Год " + i + " , численность населения составляет " + population);
        }
    }

    public static void transient4() {
        System.out.println("HW-4!");
        int have = 15_000;
        int wanted = 12_000_000;
        int month = 1;
        double percent = 7 / 100D;
        while (have < wanted) {
            have = have + (int) (have * percent);
            System.out.println(" Месяц" + month + " , сумма накоплений равна " + have + " рублей ");
            month = month + 1;
        }
    }

    public static void transient5() {
        System.out.println("HW-5!");
        int have = 15_000;
        int wanted = 12_000_000;
        int month = 1;
        double percent = 7 / 100D;
        while (have < wanted) {
            have = have + (int) (have * percent);
            if (month % 6 == 0) {
                System.out.println(" Месяц" + month + " , сумма накоплений равна " + have + " рублей ");
            }
            month = month + 1;
        }
    }

    public static void transient6() {
        System.out.println("HW-6!");
        int have = 15_000;
        int months = 9 * 12;
        double percent = 7 / 100D;
        for (int month = 1; month <= months; month++) {
            have = have + (int) (have * percent);
            if (month % 6 == 0) {
                System.out.println(" Месяц" + month + " , сумма накоплений равна " + have + " рублей ");

            }
        }
    }

    public static void transient7() {
        System.out.println("HW-7!");
        int f = 6;
        for (int i = 1; i <= 31; i++) {
            if (i % 7 == f) {
                System.out.println(" Сегодня пятница, " + i + " число. Необходимо подготовить отчет ");
            }
        }
    }

    public static void transient8() {
        System.out.println("HW-8!");
        int y = 0;
        do {
            y += 79;
        }
        while (y < 1822);
        while (y < 2122) {
            System.out.println( + y);
            y += 79;
        }
    }
}
