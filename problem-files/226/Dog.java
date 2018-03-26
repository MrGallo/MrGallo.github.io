public class Dog {
  String name;
  String breed;
  String furColor;
  int birthYear;
  
  public Dog(String name, String breed, String furColor, int birthYear) {
    this.name = name;
    this.breed = breed;
    this.furColor = furColor;
    this.birthYear = birthYear;
  }
  
  public void sayHello() {
    System.out.println("Woof");
  }
  
  public void sayName() {
    System.out.println("Woof");
  }
  
  public int getAge() {
    int humanYears = 2018 - birthYear;
    int dogYears = humanYears * 7;   // not the most accurate
    return dogYears;
  }
}