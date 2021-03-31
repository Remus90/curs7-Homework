package ro.fasttrackit.curs7;

public class Person {

    String name;
    int age;
    boolean married;

    public Person(String name, int age, boolean married) {
        this.name = name;
        this.age = age;
        this.married = married;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return married;
    }

    public static void main(String[] args) {

        Person person1 = new Person("Andrei", 30, true);
        System.out.println("Numele personei este: " + person1.getName() + " are varsta de " + person1.getAge() + " ani si este casatorit " + person1.isMarried());
        Person person2 = new Person("Cristian", 45, false);
        System.out.println("Numele personei este: " + person2.getName() + " are varsta de " + person2.getAge() + " ani si este casatorit " + person2.isMarried());
        Person person3 = new Person("Marian", 25, false);
        System.out.println("Numele personei este: " + person3.getName() + " are varsta de " + person3.getAge() + " ani si este casatorit " + person3.isMarried());

    }
}

