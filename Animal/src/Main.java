import java.util.Scanner;
class Animal{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
}

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Animal a = new Animal();

        System.out.println("What is the name of the animal? ");
        a.setName(sc.nextLine());
        System.out.println("Age of the animal: ");
        a.setAge(sc.nextInt());

        System.out.println("Animal name: " + a.getName() + " Animal age: " + a.getAge());
    }
}
