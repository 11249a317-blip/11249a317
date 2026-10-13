Aim:
To write a Java program to demonstrate multilevel inheritance using the classes Animal, Dog, and Puppy.
Algorithm:
1.Start the program.
2.Create a class Animal with the method eat() to display "Animal eats".
3.Create a class Dog that inherits the Animal class and defines the method bark().
4.Create a class Puppy that inherits the Dog class and defines the method play().
5.Create the main class multilevelMain.
6.Create an object p of the Puppy class.
7.Call the eat(), bark(), and play() methods using the object.
8.Display the output.
9.Stop the program.
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}

public class multilevelMain {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.play();
    }
}
Output:
Animal eats
Dog barks
Puppy plays
Result:
Thus, the Java program to demonstrate multilevel inheritance was executed successfully.
