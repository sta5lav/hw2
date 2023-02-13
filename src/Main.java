public class Main {
        public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
            task8();
        }

        public static void task1 () {
            var dog = 8.0;
            var cat = 3.6;
            var paper = 763789;
            System.out.println(dog + " " + cat + " " + paper);
        }

        public static void task2 () {
            var dog = 8.0 + 4;
            var cat = 3.6 + 4;
            var paper = 763789 + 4;
            System.out.println(dog + " " + cat + " " + paper);
        }
        public static void task3 () {
            var dog = 8.0 - 3.5;
            var cat = 3.6 - 1.6;
            var paper = 763789 - 7639;
            System.out.println(dog + " " + cat + " " + paper);
        }
        public static void task4 () {
        var friend = 19;
            System.out.println(friend);
        friend = friend + 2;
            System.out.println(friend);
        friend = friend / 7;
            System.out.println(friend);
    }
        public static void task5 () {
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
        public static void task6 () {
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weight = firstBoxer + secondBoxer;
        System.out.println(weight);
        var m = Math.abs(firstBoxer - secondBoxer);
        System.out.println(m);
    }
        public static void task7 () {
            var firstBoxer = 78.2;
            var secondBoxer = 82.7;
            if (secondBoxer > firstBoxer){
                var a = secondBoxer - firstBoxer;
                System.out.println(a);
            } else  System.out.println(firstBoxer-secondBoxer);
            var del = secondBoxer % firstBoxer;
            System.out.println(del);
    }
    public static void task8 () {
        var timeWork = 640;
        var members = timeWork / 8;
        System.out.println("Всего работников в компании — " + members + " человек");
        members = members + 94;
        timeWork = members * 8;
        System.out.println("Если в компании работает " + members + " человек, то всего " + timeWork + " часов работы может быть поделено между сотрудниками");
    }
    }