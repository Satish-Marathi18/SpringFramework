public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void displayDetails() {
        System.out.println("Car has "+engine);
    }
}
