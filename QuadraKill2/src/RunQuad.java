import java.util.Scanner;
class Quadrilateral{
    public void showDescription(){
        System.out.println("-is quadrilateral");
    }
}

class Rectangle extends Parallelogram{
    @Override
    public void showDescription() {
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

class Parallelogram extends Quadrilateral{
    @Override
    public void showDescription() {
        super.showDescription();
    }
    public void showParallelogram(){
        System.out.println("-has 2 pairs of parallel sides");
    }
}

class Rhombus extends Parallelogram{
    @Override
    public void showParallelogram() {
        super.showParallelogram();
    }

    public void showRhombus(){
        System.out.println("-has 4 congruent sides");
    }
}

class Trapezoid extends Quadrilateral{
    public void showTrapezoid(){
        System.out.println("-has 1 pair of parallel sides");
    }
}

public class RunQuad {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        Parallelogram parallelogram = new Parallelogram();
        Rhombus rhombus = new Rhombus();
        Trapezoid trapezoid = new Trapezoid();

        System.out.println("Select from the following:" + "\nR - Rectangle \nS - Square \nP - Parallelogram \nH -Rhombus \nT - Trapezoid");
        char input = sc.nextLine().charAt(0);

        if (input == 'H' || input == 'h') {
            System.out.println("A rhombus: ");
            rhombus.showRhombus();
            rhombus.showParallelogram();
            rhombus.showDescription();
        }
        else if(input == 'R' || input == 'r'){
            System.out.println("A rectangle: ");
            rectangle.showRectangleDescription();
            rectangle.showDescription();
        }
        else if(input == 'S' || input == 's'){
            System.out.println("A square: ");
            square.showRectangleDescription();
            square.showSquareDescription();
            square.showDescription();
        }
        else if(input == 'P' || input == 'p'){
            System.out.println("A parallelogram: ");
            parallelogram.showParallelogram();
            parallelogram.showDescription();
        }
        else if(input == 'T' || input == 't'){
            System.out.println("A trapezoid: ");
            trapezoid.showTrapezoid();
            trapezoid.showDescription();
        }
        else{
            System.out.println("Invalid Input!");
        }
    }
}