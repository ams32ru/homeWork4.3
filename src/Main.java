public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад. ");
        } else if (age >= 7 && age < 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу. ");
        } else if (age >= 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет. ");
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу. ");
        }
        System.out.println("Задание 2");
        int ageBaby = 10;
        if (ageBaby < 5) {
            System.out.println("Ребенку меньше 5 лет, ему нельзя кататься на этом атракционе");
        } else if (ageBaby >= 5 && ageBaby < 14) {
            System.out.println("Детям данного возраста можно кататься на атракционе только в сопровождении взрослого ");
        } else {
            System.out.println("Дети старше 14 лет могут кататься без сопровождения");
        }
        System.out.println("Задание 3");
        int one = 9;
        int two = 4;
        int free = 98;
        if (one>two&&one>free){
            System.out.println(one + " больше чем " + two + " и " + free);
        }
        else if (two > one&& two > free){
            System.out.println(two + " больше чем " + one + " и " + free);
        }
        else if (free > one&& free > two){
            System.out.println(free + " больше чем " + two + " и " + one);
        }
        else {
            System.out.println(" Ошибка! Пожалуйста, введите разные числа");
        }



    }
}