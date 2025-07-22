package solid;

public class Main {
    public static void main(String[] args) {
        Bird peacock = new Peacock();
        peacock.makeSound();  // Output: Peacock says: ahhh!
        peacock.fly();
        peacock.swim();
        ((Dance) peacock).dance();
        // Output: Can Fly

        System.out.println();

        Peacock peacock2 = new Peacock();
        peacock2.sing();
        peacock2.fly();


        System.out.println();


        penguin pen = new penguin();
        pen.makeSound();  // Output: pennn
        pen.fly();
        pen.swim();// Output: Cannot Fly

        System.out.println();


    }
}
