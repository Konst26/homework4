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

    public static void task1() {
        System.out.println("Задача1");
        int age = 20;
        if (age >= 18) {
            System.out.println("если возраст человека " + age + " то он совершеннолетний и ему можно пить");
        } else {
            System.out.println("он не совершеннолетний, ему нельзя пить");
        }

    }

    public static void task2() {
        System.out.println("задача 2");
        int degree = 10;
        if (degree <= 5) {
            System.out.println("на улице " + degree + " градусов, нужно одеть шапку");
        } else {
            System.out.println("на улице " + degree + " градусов, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("задача 3");
        int speed = 50;
        if (speed <= 60) {
            System.out.println("если скорость " + speed + " км/ч, то можно ехать спокойно");
        } else {
            System.out.println("если скорость " + speed + " км/ч, то придется платить штраф");

        }
    }

    public static void task4() {
        System.out.println("задача 4");
        int age = 4;
        boolean goToKinderGarden = age <= 6 && age > 2;
        boolean goToSchool = age < 18 && age > 6;
        boolean goToUniversity = age < 24 && age >= 18;
        boolean goToWork = age > 24;
        if (goToKinderGarden) {
            System.out.println("если человеку " + age + " лет, то он ходит в детский сад");
        } else if (goToSchool) {
            System.out.println("если человеку " + age + " лет, то он ходит в школу");
        } else if (goToUniversity) {
            System.out.println("если человеку " + age + " лет, то он ходит в университет");
        } else if (goToWork) {
            System.out.println("если человеку " + age + " лет, то ему пора работать!");
        }
    }

    public static void task5() {
        System.out.println("задача 5");
        int age = 4;
        boolean forbidden = age < 5;
        boolean escort = age > 5 && age < 14;
        boolean one = age > 14;
        if (forbidden) {
            System.out.println("если ребенку " + age + " лет, то ему нельзя кататься на аттракционе");
        } else if (escort) {
            System.out.println("если ребенку " + age + " лет, то он может кататься на аттракционе в сопровождении взрослого");
        } else if (one) {
            System.out.println("если ребенку " + age + " лет, то он может сам кататься на аттракционе");
        }
    }

    public static void task6() {
        System.out.println("задача 6");
        int place = 150;
        boolean seat = place > 0 && place <= 60;
        boolean standing = place >= 60 && place < 102;
        boolean full = place > 102;
        if (seat) {
            System.out.println("в вагоне есть и сидячие, и стоячие места");
        } else if (standing) {
            System.out.println("в вагоне все сидячие места заняты");
        } else if (full) {
            System.out.println("вагон полностью забит");
        }
    }

    public static void task7() {
        System.out.println("задача 7");
        int a;
        a = 1;
        int b;
        b = 2;
        int c;
        c = 3;
        if ((a > b) && (a > c)) {
            System.out.println("большее число" + a);
        } else if ((b > a) && (b > c)) ;
        {
            System.out.println("большее число" + b);
        } else if ((c > a) && (c > b)) ;
        {
            System.out.println("большее число" + c);
        }
    }









