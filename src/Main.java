public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


        byte byteOne = 2;
        short shortTwo = 32000;
        int intThree = 210000000;
        long longFour = 5000000000L;
        float floatFive = 3.232f;
        double doubleSix = 3.23222424;
        System.out.println("Значение переменной " + byteOne + " с типом  равно …");
        System.out.println("Значение переменной " + shortTwo + " с типом short равно …");
        System.out.println("Значение переменной " + intThree + " с типом int равно …");
        System.out.println("Значение переменной " + longFour + " с типом long равно …");
        System.out.println("Значение переменной " + floatFive + " с типом float равно …");
        System.out.println("Значение переменной " + doubleSix + " с типом double равно …");

        byte byteOne1 = 67;
        short shortTwo2 = 569;
        short shortTwo3 = -159;
        int intThree3 = 27897;
        long longFour4 = 987678965549L;
        float floatFive5 = 27.12f;
        float floatSix4 = 2.786f;

        byte lyudmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreyevna = 30;
        int summ = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreyevna;
        int intPaper = 480 / summ;
        System.out.println("На каждого ученика рассчитано "+ intPaper +" листов бумаги");

        byte bottles = 16;
        byte timeM = 2;

        int timeMinute = bottles * (20 / timeM);
        System.out.println("За 20 машина произвела " + timeMinute + " штук бутылок");

        int timeSytk = bottles * ((24 * 60) / timeM);
        System.out.println("За сутки машина произвела " + timeSytk + " штук бутылок");

        int timeSytk3 = bottles * ((24* 3 * 60) / timeM);
        System.out.println("За 3 дня машина произвела " + timeSytk3 + " штук бутылок");

        int timeMonth = bottles * ((24* 30 * 60) / timeM);
        System.out.println("За месяц машина произвела " + timeMonth + " штук бутылок");


        int cans = 120;
        int cansum = cans / 6;
        int white = cansum * 2;
        int brown = cansum * 4;
        System.out.println("В школе, где "+ cansum+ " классов, нужно " + white + " банок белой краски и "+brown+" банок коричневой краски");

        int summBreakfast = (5*80) + ((200/100) * 105) + (2*100) + (4*70);
        float toKg = (float) summBreakfast / 1000;
        System.out.println(toKg);

        int kgToG = 7*1000;
        int to250 = kgToG / 250;
        System.out.println(to250);
        int to500 = kgToG / 500;
        System.out.println(to500);

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        float increaseMashaSalary = (float) (mashaSalary * 1.1);
        float increaseDenisSalary = (float) (denisSalary * 1.1);
        float increaseKristinaSalary = (float) (kristinaSalary * 1.1);

        int mashaAnnualSalary = mashaSalary * 12; // Годовой доход Маши
        int denisAnnualSalary = denisSalary * 12; // Годовой доход Дениса
        int kristinaAnnualSalary = kristinaSalary * 12; // Годовой доход Кристины

        // Годовой доход после повышения
        double mashaNewAnnualSalary = increaseMashaSalary * 12; // Новый годовой доход Маши
        double denisNewAnnualSalary = increaseDenisSalary * 12; // Новый годовой доход Дениса
        double kristinaNewAnnualSalary = increaseKristinaSalary * 12; // Новый годовой доход Кристины

        // Разница в годовом доходе
        double mashaAnnualDifference = mashaNewAnnualSalary - mashaAnnualSalary;
        double denisAnnualDifference = denisNewAnnualSalary - denisAnnualSalary;
        double kristinaAnnualDifference = kristinaNewAnnualSalary - kristinaAnnualSalary;

        // Вывод результатов
        System.out.println("Маша теперь получает " + increaseMashaSalary + " рублей в месяц.");
        System.out.println("Годовой доход вырос на " + mashaAnnualDifference + " рублей.");

        System.out.println("Денис теперь получает " + increaseDenisSalary + " рублей в месяц.");
        System.out.println("Годовой доход вырос на " + denisAnnualDifference + " рублей.");

        System.out.println("Кристина теперь получает " + increaseKristinaSalary + " рублей в месяц.");
        System.out.println("Годовой доход вырос на " + kristinaAnnualDifference + " рублей.");
        System.out.println("as");




    }

}