package lab5;

public class MyCircle {
    private MyPoint center;
    private int radius = 1;

    MyCircle(){}
    MyCircle(int x, int y, int radius){
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }
    MyCircle(MyPoint center, int radius){
        this.radius = radius;
        this.center = center;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public MyPoint getCenter(){
        return center;
    }
    public void setCenter(MyPoint center){
        this.center = center;
    }

    public int getCenterY(){
        return center.getY();
    }

    public void setCenterY(int y){
        center.setY(y);
    }

    public int getCenterX(){
        return center.getX();
    }

    public void setCenterX(int x){
        center.setX(x);
    }

    public int[] getCenterXY() {
        return center.getXY();
    }

    public void setCenterXY(int x, int y){
        center.setXY(x, y);
    }

    @Override
    public String toString(){
        return "[radius=" + radius + ", center=" + center.toString() + "]";
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public double distance(MyCircle another){
        return center.distance(another.getCenter());
    }

    public static void main(String[] args){
        MyCircle circ = new MyCircle(1, 2, 5);
        System.out.println(circ.toString());
        System.out.printf("%.2f",circ.getArea());
        System.out.println();
        System.out.printf("%.2f",circ.getCircumference());
        System.out.println();
        MyCircle circ2 = new MyCircle(4, 5, 3);
        System.out.printf("%.2f",circ.distance(circ2));
    }

}
