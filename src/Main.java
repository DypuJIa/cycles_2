public class Main {
    public static void main(String[] args) {
        System.out.println();
//        Task1
        System.out.println("Task 1");

        int saveUp = 2_459_000;
        int sum = 0;
        int amount = 15000;
        double percet = 1D / 100;
        int mounth = 0;
        while (sum < saveUp) {
            sum += amount;
            sum = (int) (sum * (1 + percet));
            mounth++;
            System.out.println("Месяц " + mounth + " сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
//        Task2
        System.out.println("Task 2");
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
//        Tak3
        System.out.println("Task 3");
        int population = 12000000;
        int fertilityPerThousand = 17;
        int mortalityPerThousand = 8;
        int currentYear = 2024;
        for (int year = currentYear; year <= currentYear + 10; year++) {
            population += population * fertilityPerThousand / 1000 - population * mortalityPerThousand / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();
//        Task4
        System.out.println("Task 4");
        percet = 7D / 100;
        mounth = 0;
        sum = amount;
        int desiredSum = 12_000_000;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percet));
            mounth++;
            System.out.println("Месяц " + mounth + ", сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();
//        Task5
        System.out.println("Task 5");
        sum = amount;
        mounth = 0;
        while (sum < desiredSum) {
            sum = (int) (sum * (1 + percet));
            mounth++;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println();
//        Task6
        System.out.println("Task 6");
        sum = amount;
        mounth = 0;
        int months = 12 * 9;
        while (mounth < months) {
            sum = (int) (sum * (1 + percet));
            mounth++;
            if (mounth % 6 == 0) {
                System.out.println("Месяц " + mounth + ", сумма накоплений равна " + sum + " рублей");
            }
        }
        System.out.println();
//        Task7
        System.out.println("Task 7");
        int firstFriday = 3;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-e число. Необходимо подготовить отчет");
        }
        System.out.println();
//        Task8
        System.out.println("Task 8");
        int period = 79;
        int startSeeing = 0;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int year = startSeeing; year < end; year += period) {
            if (year > start) {
                System.out.println(year);
            }
        }
    }
}


