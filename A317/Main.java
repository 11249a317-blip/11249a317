Aim:
To write a Java program to demonstrate the implementation of an interface using the Animal interface and the Dog class.
Algorithm:
1.Start the program.
2.Declare an interface named Animal with two methods: animalSound() and sleep().
3.Create a class named Dog that implements the Animal interface.
4.Define the animalSound() method to display the animal sound.
5.Define the sleep() method to display "Zzz".
6.Create the Main class and its main() method.
7.Create an object of the Dog class.
8.Call the animalSound() and sleep() methods using the object.
9.Stop the program.
interface Animal {
  public void animalSound();  
 public void sleep(); 
}

class Dog implements Animal {
  public void animalSound() {
       System.out.println("The pig says: wee wee");
  }
  public void sleep() {
       System.out.println("Zzz");
  }
}

class Main {
  public static void main(String[] args) {
     Dog a = new Dog();
     a.animalSound();
     a.sleep();
  }
}
Output:
The pig says: wee wee
Zzz
Result:
Thus, the Java program to demonstrate the implementation of an interface was executed successfully.
