/*Fady Zaki SDEV200 1/20/24
------------------------------------
|           UML DIAGRAM            |
------------------------------------
| - n: int                         |
| - side: double                   |
| - x: double                      |
| - y: double                      |
------------------------------------
| + Main()                         |
| + Main(n: int, side: double)     |
| + Main(n: int, side: double,     |
|   x: double, y: double)          |
| + getN(): int                    |
| + setN(n: int): void             |
| + getSide(): double              |
| + setSide(side: double): void    |
| + getX(): double                 |
| + setX(x: double): void          |
| + getY(): double                 |
| + setY(y: double): void          |
| + getPerimeter(): double         |
| + getArea(): double              |
------------------------------------
*/
public class Main {
    private int n;
    private double side;
    private double x;
    private double y;

    public Main() {
        this.n = 3;
        this.side = 1;
        this.x = 0;
        this.y = 0;
    }

    public Main(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public Main(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }

    public static void main(String[] args) {
        Main polygon1 = new Main();
        Main polygon2 = new Main(6, 4);
        Main polygon3 = new Main(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1 Perimeter: " + polygon1.getPerimeter());
        System.out.println("Polygon 1 Area: " + polygon1.getArea());

        System.out.println("Polygon 2 Perimeter: " + polygon2.getPerimeter());
        System.out.println("Polygon 2 Area: " + polygon2.getArea());

        System.out.println("Polygon 3 Perimeter: " + polygon3.getPerimeter());
        System.out.println("Polygon 3 Area: " + polygon3.getArea());
    }
}
