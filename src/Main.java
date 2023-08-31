public class Main {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle(4,"blue",123,"regular");
        Car c1 = new Car(4,"red",156,"regular", "Dodge");
        Vehicle v2 = new Car(4, "grey", 225, "diesel", "Ford");
        System.out.println(((Car) v2).honk());
        System.out.println(v2.toString());
    }
}