public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    private static void task1() {

        var dog = 8.0;
        System.out.println(dog);
        dog=dog + 4;
        System.out.println(dog);
        dog=dog - 3.5;
        System.out.println(dog);
    }

    private static void task2() {
        var cat = 3.6;
        System.out.println(cat);
        cat=cat + 4;
        System.out.println(cat);
        cat=cat - 1.6;
        System.out.println(cat);
    }

    private static void task3() {
        var paper = 7639;
        System.out.println(paper);
        paper = paper + 4;
        System.out.println(paper);
        paper = paper - 7639;
        System.out.println(paper);
    }

    private static void task4() {
        var friend = 19;
        System.out.println(friend);
        friend=friend * 2;
        System.out.println(friend);
        friend=friend / 7;
        System.out.println(friend);
    }

    private static void task5() {
      var frog = 3.5;
      System.out.println(frog);
      frog=frog * 10;
      System.out.println(frog);
      frog=frog / 3.5;
      System.out.println(frog);
    }

    private static void task6() {
        var firstBoxerWeigt = 78.2;
        var secondBoxerWeigt = 87.7;
        var BoxersWeight = firstBoxerWeigt + secondBoxerWeigt;
        System.out.println("Общий вес бойцов" + BoxersWeight);
        BoxersWeight = secondBoxerWeigt - firstBoxerWeigt;
        System.out.println("Разница между весами бойцов" + BoxersWeight + "кг");

    }

    private static void task7() {
        var hours = 640;
        var workerTime = 8;
        var companyEmployees = hours/workerTime;
        System.out.println("Всего работников в компании" + companyEmployees + "человек");
        var worker = 94;
        var totalEmploees = companyEmployees + worker;
        System.out.println("Общее колчество" + totalEmploees + "работнка");
        var workingHours = hours / totalEmploees;
        System.out.println("Если в компании работает" + totalEmploees + "всего человек" + workingHours + "часов работы может быть поделено между сотрудниками");
    }}





