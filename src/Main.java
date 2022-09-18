public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int box = 4;
        System.out.println("Значение переменной box с типом int равно " + box);
        byte tool = 2;
        System.out.println("Значение переменной tool с типом byte равно " + tool);
        short wood = 1;
        System.out.println("Значение переменной wood с типом short равно " + wood);
        long diamond = 545L;
        System.out.println("Значение переменной diamond с типом long равно " + diamond);
        float cracker = 7;
        System.out.println("Значение переменной cracker с типом float равно " + cracker);
        double banana = 3.5;
        System.out.println("Значение переменной banana с типом double равно " + banana);

        System.out.println("Задача 2");

        double boxOne = 27.12;
        System.out.println(boxOne);
        long boxTwo = 987678965549L;
        System.out.println(boxTwo);
        byte boxTree = 2;
        System.out.println(boxTree);
        short boxFour = 786;
        System.out.println(boxFour);
        boolean five = false;
        System.out.println(five);
        short six = 569;
        System.out.println(six);
        short seven = -159;
        System.out.println(seven);
        short eight = 27897;
        System.out.println(eight);
        byte nine = 67;
        System.out.println(nine);

        System.out.println("Задача 3");

        byte teacherOne = 23;
        byte teacherTwo = 27;
        byte teacherTree = 30;
        int allStudents =teacherOne + teacherTwo + teacherTree;
        System.out.println("Всего учеников " + allStudents);
        short paper = 480;
        int forEach = paper /allStudents;
        System.out.println("На каждого ученика рассчитано " + forEach + " листов бумаги");

        System.out.println("Задача 4");

        byte bottles = 16;
        byte time = 2;
        int bottlesPerMinute = bottles /time;
        byte givenTime = 20;
        System.out.println("За 20 минут машины произвела бутылок " + givenTime *bottlesPerMinute + " штук");
        byte hoursOfDay = 24;
        byte minuteInAnHour = 60;
        int minuteInDay = hoursOfDay *minuteInAnHour;
        int inDay = minuteInDay *bottlesPerMinute;
        System.out.println("За 1 день машины произвела бутылок " + inDay  + " штук");
        byte threeDays = 3;
        int inThreeDays = inDay *threeDays;
        System.out.println("За 3 дня машины произвела бутылок " + inThreeDays + " штук");
        byte daysInMonth = 30;
        int inMonth = daysInMonth *inDay;
        System.out.println("За месяц машины произвела бутылок " + inMonth + " штук");

        System.out.println("Задача 5");

        byte cansOfPaint = 120;
        byte whitePaintClassroom = 2;
        byte brownPaintClassroom = 4;
        int classroom = cansOfPaint /(whitePaintClassroom + brownPaintClassroom);
        int whitePaint = classroom *whitePaintClassroom;
        int brownPaint = classroom *brownPaintClassroom;
        System.out.println("В школе, где " + classroom + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        System.out.println("Задача 6");

        byte bananas = 5;
        byte bananaWeight = 80;
        short milkWeight = 210;
        byte cream = 2;
        byte creamWeight = 100;
        byte rawEggs = 4;
        byte eggWeight = 70;
        int allBananas = bananas *bananaWeight;
        int allWeightCream = cream *creamWeight;
        int allEggs = rawEggs *eggWeight;
        int allWeight = allWeightCream + allEggs +allBananas + milkWeight;
        double kg = allWeight / 1000;
        System.out.println(kg + " киллограмм");

        System.out.println("Задача 7");

        short weightAll = 7000;
        short everyDay1 = 250;
        short everyDay2 = 500;
        int dayLoseWeight250 = 7000 / 250;
        System.out.println("При рационе " + everyDay1 + " граммов в день, на похудение уйдеть " + dayLoseWeight250 + " дней");
        int dayLoseWeight500 = 7000 / 500;
        System.out.println("При рационе " + everyDay2 + " грамов в денеь, на похудение уйдет " + dayLoseWeight500 + " дней");
        double m = 7000 / (750/2);
        System.out.println(m);

        //задача 8

        int masha1 = 67760;
        double masha2 = 67760 * 1.1;
        int denis1 = 83690;
        double denis2 = 83690 * 1.1;
        int kristina1 = 76230;
        double kristina2 = 76230 * 1.1;
        double difference1 = masha2 - masha1;
        System.out.println("Маша теперь получает " + masha2 + " рублей. Годовой доход вырос на " + difference1 + " рублей");
        double difference2 = denis2 - denis1;
        System.out.println("Денис теперь получает " + denis2 + " рублей. Годовой доход вырос на " + difference2 + " рублей");
        double difference3 = kristina2 - kristina1;
        System.out.println("Кристина теперь получает " + kristina2 + " рублей. Годовой доход вырос на " + difference3 + " рублей");



    }
}