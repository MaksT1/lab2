package lab5;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    MyPoint(){}
    MyPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }

    public int[] getXY(){
        return new int[] {x, y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public double distance(int x, int y){
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double distance(MyPoint another){
        return distance(another.getX(), another.getY());
    }

    public double distance(){
        return distance(0, 0);
    }

    public static void main(String[] args){
        MyPoint[] points = new MyPoint[10];
        for(int i = 0; i < points.length; i++){
            points[i] = new MyPoint(i + 1, i + 1);
        }

        for(MyPoint p : points){
            System.out.println(p.toString());
        }
    }


}
