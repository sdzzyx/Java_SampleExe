import java.util.Scanner;

public class recurs {
    public static void main(String[]args){
        // Recursion = the process in which a method calls itself continuously
        // A method that calls itself is called a recursive method

        // recursion = the process in which a method calls itself continuously
        // a method that calls itself is called a recursive method
        // useful for factorials, transversing trees, and simplifying a complex task
        Scanner sc = new Scanner(System.in);
        System.out.print("How far do you want to walk(meters)? ");
        int distance = sc.nextInt();

        takeAStep(0,distance);
    }
    static void takeAStep(int i,int distance){
        if(i<distance){
            i++;
            System.out.println("**You take a step** : " + i + " meter/s");
            takeAStep(i, distance);
        }
        else{
            System.out.println("You are done walking after taking a " + i + " meter/s steps");
        }
    }
}
