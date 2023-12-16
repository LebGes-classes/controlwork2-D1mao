import java.util.Scanner;

public abstract class Human {
    protected String name;
    public static Scanner scan = new Scanner(System.in);

    Human(){
        System.out.println("Задайте имя: ");
        name = scan.nextLine();
    }

    public abstract void printInfo();
}
