package lab6;

import java.util.Scanner;

public class CreateLoans {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Loan[] loans = new Loan[5];
        System.out.println("Enter prime rate: ");
        double primeRate = scan.nextDouble();

        for(int i = 0; i < 5; i++){
            System.out.println("Loan no. " + (i+1));
            System.out.println("Select type: (1 - Business, 2 - Personal)");
            int type = scan.nextInt();
            System.out.print("Number: "); int num = scan.nextInt();
            System.out.print("Client's Last name: "); String name = scan.next();
            System.out.print("Amount: "); double amount = scan.nextDouble();
            System.out.print("Term (1, 3, 5 years): "); int term = scan.nextInt();

            if(type == 1){
                loans[i] = new BusinessLoan(num, name, amount, term, primeRate);
            }else{
                loans[i] = new PersonalLoan(num, name, amount, term, primeRate);
            }
        }

        for(Loan l : loans){
            System.out.println(l.toString());
        }
    }
}
