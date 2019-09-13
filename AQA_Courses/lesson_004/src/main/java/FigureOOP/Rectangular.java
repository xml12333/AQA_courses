package FigureOOP;

public class Rectangular extends Figure {
 //   public class Rectangular implements IFigure {

    private double height;
    private double weight;

    public Rectangular(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double squre() {
        return height * weight;
    }
}
