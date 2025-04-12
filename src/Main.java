public class Main {
    public static void main(String[] args) {

    // Задача 1
        // Объявите переменные типа int, byte, short, long, float, double.
        // Название переменных может быть любым, но если состоит из двух слов и более,
        // должно соответствовать правилу camelCase.
        // Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …»

    int num1 = 100;
    System.out.println("Значение переменной num1 с типом int равно " + num1);
    byte num2 = 1;
    System.out.println("Значение переменной num2 с типом byte равно " + num2);
    short num3 = 5;
    System.out.println("Значение переменной num3 с типом short равно " + num3);
    long num4 = 1000L;
    System.out.println("Значение переменной num4 с типом long равно " + num4);
    float num5 = 5.25f;
    System.out.println("Значение переменной num5 с типом float равно " + num5);
    double num6 = 1.314;
    System.out.println("Значение переменной num6 с типом double равно " + num6);

    // Задача 2
        // Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        // Значения:
        // 27.12
        // 987 678 965 549
        // 2,786
        // 569
        // -159
        // 27897
        // 67

    float a = 27.12f;
    System.out.println(a); // по условию задачи вывод не требуется, однако я его вставил чтобы при коммите не было ошибки never used
    long b = 987678965549L;
    System.out.println(b); // по условию задачи вывод не требуется, однако я его вставил чтобы при коммите не было ошибки never used
    float c = 2.786f;
    System.out.println(c); // по условию задачи вывод не требуется, однако я его вставил чтобы при коммите не было ошибки never used
    short d = 569;
    System.out.println(d); // по условию задачи вывод не требуется, однако я его вставил чтобы при коммите не было ошибки never used
    short e = -159;
    System.out.println(e); // по условию задачи вывод не требуется, однако я его вставил чтобы при коммите не было ошибки never used
    short f = 27897;
    System.out.println(f); // по условию задачи вывод не требуется, однако я его вставил чтобы при коммите не было ошибки never used
    byte g = 67;
    System.out.println(g); // по условию задачи вывод не требуется, однако я его вставил чтобы при коммите не было ошибки never used

    // Задача 3
        // Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        // У Людмилы Павловны — 23 ученика, у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        // Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        // Посчитайте, сколько достанется листов каждому ученику.
        // Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        // Для объявления переменных не используйте тип var

    byte classLP = 23; // класс 1
    byte classAS = 27; // класс 2
    byte classEA = 30; // класс 3
    short paper = 480; // бумаги закуплено
    byte totalStudents = (byte) (classLP + classAS + classEA); // считаем сколько всего учеников
    byte paperPerStudent = (byte) (paper / totalStudents); // считаем сколько бумаги на ученика
    System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");

    // Задача 4
        // Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты.
        // Какая производительность машины будет:
        // за 20 минут,
        // в сутки,
        // за 3 дня,
        // за 1 месяц?
        // Рассчитывайте производительность работы машины в том случае, если она работает без перерыва
        // заданный промежуток времени.
        // Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        // Для объявления переменных не используйте тип var.

        byte bottlesPer2Minutes = 16;
        short bottlesPer20Minutes = (short) (bottlesPer2Minutes * (20 / 2)); // считаем производительность за 20 минут
        System.out.println("За 20 минут машина произвела " + bottlesPer20Minutes + " бутылок");
        short minutesInDay = 24 * 60;
        short bottlesPerDay = (short) (bottlesPer2Minutes * (minutesInDay / 2)); // считаем производительность в сутки
        System.out.println("За сутки машина произвела " + bottlesPerDay + " бутылок");
        int bottlePer3Days = bottlesPerDay * 3; // считаем производительность за 3 дня
        System.out.println("За 3 дня машина произвела " + bottlePer3Days + " бутылок");
        int bottlesPerMonth = bottlesPerDay * 30; // считаем производительность за месяц, равный 30 дням
        System.out.println("За месяц машина произвела " + bottlesPerMonth + " бутылок");

    // Задача 5
        // На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        // Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски
        // и … банок коричневой краски».
        // Для объявления переменных не используйте тип var.

        byte totalPots = 120;
        byte whiteColorPotPerClass = 2;
        byte brownColorPotPerClass = 4;
        byte totalPotsPerClass = (byte) (whiteColorPotPerClass + brownColorPotPerClass); // считаем сколько всего банок краски на класс
        short totalClasses = (short) (totalPots / totalPotsPerClass); // считаем на сколько классов будет потрачена краска
        byte totalWhiteColorPots = (byte) (whiteColorPotPerClass * totalClasses); // считаем количество банок белой краски
        byte totalBrownColorPots = (byte) (brownColorPotPerClass * totalClasses); // считаем количество банок коричневой краски
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteColorPots + " банок белой краски и " + totalBrownColorPots + " банок коричневой краски");

    // Задача 6
        // Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.
        // Вот один из рецептов, по которому спортсмен готовит себе завтрак:
        // Бананы — 5 штук (1 банан — 80 грамм).
        // Молоко — 200 мл (100 мл = 105 грамм).
        // Мороженое-пломбир — 2 брикета по 100 грамм.
        // Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        // Смешать всё в блендере — и готово.
        // Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.
        // Результат в граммах и килограммах напечатайте в консоль.

        short bananWeight = 5 * 80;
        short milkWeight = 200 * 105;
        short icecreamWeight = 2 * 100;
        short eggWeight = 4 * 70;
        short weightInGramms = (short) (bananWeight + milkWeight + icecreamWeight + eggWeight); // считаем общий вес завтрака в граммах
        float weightInKilogramms = (float) (weightInGramms / 1000.0); // переводим вес в килограммы
        System.out.println("Вес завтрака спортсмена " + weightInGramms + " грамм");
        System.out.println("Вес завтрака спортсмена " + weightInKilogramms + " килограмм");

        // Задача 7
            // Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
            // Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.
            // Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
            // а сколько — если каждый день будет худеть на 500 грамм.
            // Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.
            // Результаты всех подсчетов выведите в консоль.

        byte weightToLose = 7; // сколько нужно сбросить кг
        short weightToLosePerDayInGrammMin = 250; // минимальный план 250 грамм в день
        short weightToLosePerDayInGrammMax = 500; // максимальный план 500 грамм в день
        float weightToLosePerDayInKgMin = (float) weightToLosePerDayInGrammMin / 1000; // переводим в килограммы
        float weightToLosePerDayInKgMax = (float) weightToLosePerDayInGrammMax / 1000; // переводим в килограммы
        byte daysMin = (byte) (weightToLose / weightToLosePerDayInKgMin); // вычисляем количество дней для похудения при минимальной потере веса
        System.out.println("При ежедневной минимальной потере веса в " + weightToLosePerDayInGrammMin + " грамм, для потери " + weightToLose + " кг веса, потребуется " + daysMin + " дней");
        byte daysMax = (byte) (weightToLose / weightToLosePerDayInKgMax); // вычисляем количество дней для похудения при максимальной потере веса
        System.out.println("При ежедневной максимальной потере веса в " + weightToLosePerDayInGrammMax + " грамм, для потери " + weightToLose + " кг веса , потребуется " + daysMax + " дней");
        byte daysAvg = (byte) ((daysMin + daysMax) / 2); // вычисляем среднее количество дней для похудения
        System.out.println("В среднем понадобится " + daysAvg + " дней, чтобы сбросить " + weightToLose + " кг");

        // Задача 8
            // Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
            // В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса.
            // Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
            // Каждый год повышение составляет 10% от текущей зарплаты.
            // К вам пришел руководитель с задачей автоматизировать повышение зарплаты,
            // а также провести расчет для следующих сотрудников:
            // Маша получает 67 760 рублей в месяц.
            // Денис получает 83 690 рублей в месяц.
            // Кристина получает 76 230 рублей в месяц.
            // Каждому нужно увеличить зарплату на 10% от текущей месячной.
            // Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой
            // и после повышения.
            // Посчитайте, сколько будет получать каждый из сотрудников,
            // а также разницу между годовым доходом до и после повышения.
            // Выведите в консоль информацию по каждому сотруднику.
            // Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».

            int zpMasha = 67760;
            int zpDenis = 83690;
            int zpKristina = 76230;
            byte zpPercentIncrease = 10;
            int zpMashaIncrease = zpMasha * zpPercentIncrease / 100;
            int zpDenisIncrease = zpDenis * zpPercentIncrease / 100;
            int zpKristinaIncrease = zpKristina * zpPercentIncrease / 100;
            int newZpMasha = zpMasha + zpMashaIncrease;
            int newZpDenis = zpDenis + zpDenisIncrease;
            int newZpKristina = zpKristina + zpKristinaIncrease;
            int zpMashaYearBefore = zpMasha * 12;
            int zpMashaYearAfter = newZpMasha * 12;
            int zpDenisYearBefore = zpDenis * 12;
            int zpDenisYearAfter = newZpDenis * 12;
            int zpKristinaYearBefore = zpKristina * 12;
            int zpKristinaYearAfter = newZpKristina * 12;
            int zpMashaYearDiff = zpMashaYearAfter - zpMashaYearBefore;
            int zpDenisYearDiff = zpDenisYearAfter - zpDenisYearBefore;
            int zpKristinaYearDiff = zpKristinaYearAfter - zpKristinaYearBefore;
            System.out.println("Маша раньше получала " + zpMasha + " рублей, а теперь получает " + newZpMasha + " рублей. Ее годовой доход вырос на " + zpMashaYearDiff + " рублей!");
            System.out.println("Денис раньше получал " + zpDenis + " рублей, а теперь получает " + newZpDenis + " рублей. Его годовой доход вырос на " + zpDenisYearDiff + " рублей!");
            System.out.println("Кристина раньше получала " + zpKristina + " рублей, а теперь получает " + newZpKristina + " рублей. Ее годовой доход вырос на " + zpKristinaYearDiff + " рублей!");

    }
}