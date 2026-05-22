package lab5;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int[] grades = new int[n];
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            System.out.println("Enter the grade for student " + (i+1));
            grades[i] = sc.nextInt();
            sum+= grades[i];
            if(grades[i] > max){
                max = grades[i];
            }
            if(grades[i] < min){
                min = grades[i];
            }

        }
        int[] sorted = grades.clone();
        double average = (double) sum/n;
        Arrays.sort(sorted);
        System.out.println("The grades are: " + Arrays.toString(grades));
        System.out.printf("The average is: %.2f\n",average);
        System.out.printf("The median is: %.2f\n",(n%2 == 0 ? ((sorted[n/2] + sorted[n/2-1]) / 2.0) : sorted[n/2]));
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);

        double squaresSum = 0;
        for(int i = 0; i < n; i++){
            squaresSum += grades[i] * grades[i];
        }
        double standardDev = Math.sqrt((squaresSum/n) - (average * average));
        System.out.printf("The standard deviation is: %.2f\n", standardDev);
        sc.close();

    }
}
