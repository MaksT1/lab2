package lab6;

public class MovableRectangle implements Movable{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;
    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }
    @Override
    public String toString(){
        return "Top Left: " + topLeft.toString() + ", Bottom Right: " + bottomRight.toString();
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }

    public static void main(String[] args){
        MovableRectangle mov = new MovableRectangle(1, 4, 4, 1, 2, 2);
        System.out.println(mov.toString());
        mov.moveDown();
        System.out.println(mov.toString());
        mov.moveLeft();
        System.out.println(mov.toString());
        mov.moveRight();
        System.out.println(mov.toString());
        mov.moveUp();
        System.out.println(mov.toString());
    }
}
