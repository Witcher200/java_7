package Lesson_6;

public class Lesson_6 {
    public static class Animal {
        String name;
        int run_m;
        int swim_m;

        public Animal(String name) {
            this.name = name;
        }

        public Animal() {
        }

        public void Info() {
            System.out.println(this.name);
        }

        public void Run(int run_m) {
            this.run_m = run_m;
            System.out.println("Животное пробежало: " + run_m);
        }

        public void Swim(int swim_m) {
            this.swim_m = swim_m;
            System.out.println("Животное проплыло: " + swim_m);
        }
    }

    public static class Cat extends Animal{

    public Cat(String name) {
        this.name = name;
    }

        public void Run(int run_m) {
            this.run_m = run_m;
            System.out.println("Кот " + this.name + " пробежал:  " + run_m + " m");
        }

        public void Swim(int swim_m) {
            this.swim_m = swim_m;
            System.out.println("Кот не умеет плавать");
        }
}

    public static class Dog extends Animal{

        public Dog(String name) {
            this.name = name;
        }

        public void Run(){
            System.out.println("Собака побежала");
        }

        public void Swim(){
            System.out.println("Собака поплыла");
        }

        public void Run(int run_m) {
            this.run_m = run_m;
            System.out.println("Собака: " + this.name + " пробежал:  " + run_m + " m");
        }

        public void Swim(int swim_m) {
            this.swim_m = swim_m;
            System.out.println("Собака: Нестр проплыл: " + swim_m + " m");
        }
    }


    public static void main(String[] args) {
        System.out.println("Start");
        Animal Animal1 = new Animal("животное");
        Animal1.Info();
        Animal1.Run(500);
        Animal1.Swim(300);
        Cat Cat2 = new Cat("Вася");
        Cat2.Info();
        Cat2.Run(200);
        Cat2.Swim(0);
        Dog Dog3 = new Dog("Нестр");
        Dog3.Info();
        Dog3.Run(500);
        Dog3.Swim(10);
    }
}

