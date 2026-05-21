package lab5;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "MyTriangle[v1=" + v1.toString() + "," + v2.toString() + "," + v3.toString() + "]";
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);
        if (Math.abs(d1 - d2) < 0.00001 && Math.abs(d2 - d3) < 0.00001) {
            return "Equilateral";
        } else if (Math.abs(d1 - d2) < 0.00001 || Math.abs(d2 - d3) < 0.00001 || Math.abs(d1 - d3) < 0.0001) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }

    public static void main(String[] args) {
        MyTriangle tri = new MyTriangle(0, 0, 5, 0, 3, 3);
        System.out.println(tri.toString());
        System.out.printf("%.2f", tri.getPerimeter());
        System.out.println();
        System.out.println(tri.getType());
    }
}
