package lab5;

public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    MyRectangle(int x1, int y1, int x2, int y2){
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }
    MyRectangle(MyPoint topLeft, MyPoint bottomRight){
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getArea(){
        int height = Math.abs(topLeft.getY() - bottomRight.getY());
        int width = Math.abs(topLeft.getX() - bottomRight.getX());
        return width * height;
    }

    public double getPerimiter(){
        int height = Math.abs(topLeft.getY() - bottomRight.getY());
        int width = Math.abs(topLeft.getX() - bottomRight.getX());
        return 2 * (width + height);
    }

    @Override
    public String toString(){
        return "MyRectangle[topLeft=" + topLeft.toString() + ",bottomRight=" + bottomRight.toString() + "]";
    }


    public static void main(String[] args){
        MyRectangle re = new MyRectangle(1, 5, 6, 1);
        System.out.println(re.toString());
        System.out.println(re.getArea());
        System.out.println(re.getPerimiter());
    }
}
