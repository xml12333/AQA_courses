package FigureOOP;

public class StraightForwardTriangl extends Figure {

    private double height;
    private double weight;

    public StraightForwardTriangl(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public double squre() {
        return height*weight*0.5;
    }
}
