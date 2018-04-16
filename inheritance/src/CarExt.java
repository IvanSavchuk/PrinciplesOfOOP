public class CarExt extends Car{

    public CarExt(double x, double y, double course) {
        super(x, y);
        this.course = course;
    }

    public void back(int distance) {
        forward(-distance);
    }
}