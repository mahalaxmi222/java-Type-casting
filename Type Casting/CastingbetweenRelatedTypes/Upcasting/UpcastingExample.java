
public class UpcastingExample {
    public static void main(String[] args) {
        // Upcasting: Converting Dog to Animal
        Dog myDog = new Dog();
        Animal myAnimal = myDog; // Upcasting

        // Both references point to the same object (myDog), but the type of the reference determines accessible methods.
        myAnimal.eat();  // Calls eat from Animal
        // myAnimal.bark();  // Error: The method bark() is undefined for the type Animal

        // Accessing the common method in both classes
        myDog.eat();    // Calls eat from Animal
        myDog.bark();   // Calls bark from Dog
    }
}
