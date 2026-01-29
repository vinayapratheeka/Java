package Usecases;
class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void display() {
        System.out.println(name + " " + age);
    }
}
class Student extends Person {
    Student(String name, int age) {
        super(name, age);
    }
    void display() {
        super.display();
        System.out.println("Role: Student");
    }
}
class Teacher extends Person {
    Teacher(String name, int age) {
        super(name, age);
    }
    void display() {
        super.display();
        System.out.println("Role: Teacher");
    }
}

public class PersonInh {
    public static void main(String[] args) {
        Person p1 = new Student("Vinaya", 21);
        Person p2 = new Teacher("Ramesh", 40);

        p1.display();
        p2.display();
    }
}
