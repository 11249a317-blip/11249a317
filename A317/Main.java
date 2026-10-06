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