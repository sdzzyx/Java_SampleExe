import java.util.Scanner;

class identity{
    private String name;
    private int age;
    private String course;


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setCourse(String course){
        this.course = course;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}

public class Person {
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        identity identity = new identity();

        System.out.println("What is your name: " );
        identity.setName(sc.nextLine());
        System.out.println("What is your age: ");
        identity.setAge(Integer.parseInt(sc.nextLine()));
        System.out.println("What is your course: ");
        identity.setCourse(sc.nextLine());

        System.out.println("Your name is " + identity.getName() + "\nYour age is " + identity.getAge() + " and your course is " + identity.getCourse());

    }
}
