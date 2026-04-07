class Numbers{
    int a, b, c;
    Numbers(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int sum(){
        return a + b + c;
    }
    public double average(){
         return sum() / 3.0;
    }
    public int min(){
        int minV = a;
        if(b < minV){
            minV = b;
        }
        if(c < minV){
            minV = c;
        }
        return minV;
    }
    public int max(){
        int maxV = a;
        if(b > maxV){
            maxV = b;
        }
        if(c > maxV){
            maxV = c;
        }
        return maxV;
    }
    public double geometric(){
        return Math.cbrt((double) a * b * c);
    }
}
public class zad5 {
    public static void main(String[] args){
        Numbers num = new Numbers(2, 4, 6);
        System.out.println(num.sum());
        System.out.println(num.average());
        System.out.println(num.min());
        System.out.println(num.max());
        System.out.println(num.geometric());
    }
}
