
public class Circle {
    final double pi = 3.14;
    int diameter;

    public double getPi() {
        return pi;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    double area() {
        return this.diameter * this.diameter * pi;
    }

    Circle(int r) {
        this.diameter = r;
    }

}