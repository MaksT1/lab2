package lab6;

import java.util.Scanner;

public class UseInsurance {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose insurance: 1 - Life, 2 - Health");
        int type = scanner.nextInt();
        Insurance policy;
        if(type == 1){
            policy = new Life();
            policy.display();
        }
        else if(type == 2){
            policy = new Health();
            policy.display();
        }else{
            System.out.println("Wrong type!");
        }

    }
}
