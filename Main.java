public class Main {
    public static void main(String[] args) {
        // Problem Statement 1
        System.out.println("Problem 1.1:");
        Animal dog = new Dog();
        dog.sound();
        dog.sleep();

        System.out.println("\nProblem 1.2:");
        Shape circle = new Circle();
        circle.draw();
        circle.color();

        System.out.println("\nProblem 1.3:");
        Vehicle car = new Car();
        car.start();

        System.out.println("\nProblem 1.4:");
        ReverseArray.main(null);

        System.out.println("\nProblem 1.5:");
        ToStringOverride.main(null);

        System.out.println("\nProblem 1.6:");
        StringComparison.main(null);

        System.out.println("\nProblem 1.7:");
        StringConcatenation.main(null);

        // Problem Statement 4
        System.out.println("\nProblem 4.1:");
        FileExample.main(null);

        System.out.println("\nProblem 4.2:");
        AverageArray.main(null);

        System.out.println("\nProblem 4.3:");
        ArrayListExample.main(null);

        System.out.println("\nProblem 4.4:");
        Swapper.main(null);

        System.out.println("\nProblem 4.5:");
        LinkedListExample.main(null);

        System.out.println("\nProblem 4.6:");
        MapExample.main(null);

        System.out.println("\nProblem 4.7:");
        TreeSetClone.main(null);
    }
}
