import java.util.Scanner;

class Quadrilateral{
    public void showDescription(){
        System.out.println("-is quadrilateral");
    }
}

class Rectangle extends Quadrilateral{
    @Override
    public void showDescription() {
        super.showDescription();
    }

    public void showRectangleDescription(){
        System.out.println("-has 4 equal sides");
    }
}

class Square extends Rectangle{
    @Override
    public void showDescription() {
        super.showDescription();
    }

    public void showSquareDescription(){
        System.out.println("-has 4 right angles");
    }
}

public class RunQuad {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        System.out.print("Press R for Rectangle and S for Square.");

        char input = sc.nextLine().charAt(0);
        if(input == 'R' || input == 'r'){
            System.out.println("A rectangle: " );
            rectangle.showRectangleDescription();
            rectangle.showDescription();
        }if(input == 'S' || input == 's'){
            System.out.println("A square: ");
            square.showRectangleDescription();
            square.showSquareDescription();
            square.showDescription();
        }else{
            System.out.println("Invalid input!");
        }
    }
}
