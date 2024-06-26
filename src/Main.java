public class Main {
    public static void main(String[] args) {
        {
            System.out.println("\nTask1");
            int month = 1;
            int sum = 0;
            while (sum < 2_459_000) {
                sum += 15_000;
                month++;
            }
            System.out.println("Месяц " + month + ", сумма накоплений равна " + sum + " рублей");
        }
        {
            System.out.println("\nTask2");
            int num = 0;
            while (num < 10) {
                num++;
                System.out.print(num + " ");
            }
            System.out.println();
            for (; num > 0; num--) {
                System.out.print(num + " ");
            }
        }
        {
            System.out.println("\nTask3");
            int population = 12_000_000;
            int deathRate = 8;
            int birthRate = 17;
            for (int year = 1; year <= 10; year++) {
                population = population + (birthRate - deathRate) + population / 1000;
                System.out.println("Год " + year + " численность населения составляет " + population);
            }
        }
        {
            System.out.println("\nTask4");
            int deposit = 15_000;
            int mouth = 1;
            while (deposit < 12_000_000) {
                deposit = deposit + (int)(deposit * 0.07);
                System.out.println("Месяц " + mouth + ", сумма: " + deposit);
                mouth++;
            }
        }
        {
            System.out.println("\nTask5");
            int deposit = 15_000;
            var period = 9 * 12;
            for (int month = 1; month < period; month++) {
                deposit = deposit + (int)(deposit * 0.07);
                if (month % 6 == 0) {
                    System.out.println("Месяц " + month + ". сумма: " + deposit);
                }
            }
        }
        {
            System.out.println("\nTask6");
            int deposit = 15_000;
            var period = 9 * 12;
            for (int month = 1; month < period; month++){
                deposit = deposit + (int)(deposit * 0.07);
                if (month % 6 == 0){
                    System.out.println("Месяц " + month + ", сумма: " + deposit);
                }
            }
        }
        {
            System.out.println("\nTask7");
            for (int day = 2; day < 31; day += 7) {
                System.out.println("Сегодня пятница " + day + "-е число.Необходимо подготовить отчет ");
            }
        }
        {
            System.out.println("\nTask8");
            for (int year = 2024 - 200; year < 2024 + 100; year++) {
                if (year % 79 == 0) {
                    System.out.println(year);
                }
            }
        }
    }
}














