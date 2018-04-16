public class CarManager {
    public static void main(String[] args) {
        CarExt car = new CarExt(0, 0, 0);

        car.forward(20);
        car.printCoordinates();

        car.setCourse(90);
        car.forward(20);
        car.printCoordinates();

        car.setCourse(45);
        car.forward(20);
        car.printCoordinates();
        car.back(10);
        car.printCoordinates();
    }
}