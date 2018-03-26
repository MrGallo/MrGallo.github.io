public class DogRunner {
  public static void main(String[] args) {
    Dog doggy1 = new Dog("Ralph", "Poodle", "White", 2014);
    Dog doggy2 = new Dog("Fido", "Lab", "Black", 2012);
    
    doggy1.sayHello();
    doggy2.sayHello();
    
    System.out.println(doggy1.name + " is " + doggy1.getAge() + " dog-years old");
    System.out.println(doggy2.name + " is " + doggy2.getAge() + " dog-years old");
    System.out.println(doggy2.name + " is " + (doggy2.getAge() - doggy1.getAge()) + " dog-years older than " + doggy1.name);
  }
}