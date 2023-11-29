
public class DowncastingExample {
    public static void main(String[] args) {
        // Upcasting: Converting Dog to Animal
        Animal myAnimal = new Dog();

        // Downcasting: Converting Animal back to Dog
        if (myAnimal instanceof Dog) {
            Dog myDog = (Dog) myAnimal; // Downcasting

            // Accessing methods specific to Dog
            myDog.eat();  // Calls eat from Animal (inherited)
            myDog.bark(); // Calls bark from Dog
        } else {
            System.out.println("Cannot perform downcasting");
        }
    }
}
