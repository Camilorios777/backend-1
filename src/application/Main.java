package application;

public class Main {
    public static void main(String[] args){
        System.out.println("hello,world");
        String name;
        int age;
        boolean male;

        name = "luis";
        age = 30;
        male= true;

        System.out.println("My name is " + name);
        System.out.println("i am " + age + "years old");
        System.out.println("Am I male? " + male);

        int currentYear = 2026;
        int birthYear = 1996;
        int calculateAge = currentYear - birthYear;
        System.out.println("calculated age : " + calculateAge);

        for (int i = 1; i <= 10; i++) {
            System.out.println("iteration: " + i);
        }

    }
}

