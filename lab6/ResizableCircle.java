package lab6;

public class ResizableCircle extends Circle implements Resizable{
    ResizableCircle(double radius){
        super(radius);
    }

    @Override
    public void resize(int percent) {
        this.radius -= this.radius * (percent / 100.0);
    }
}
