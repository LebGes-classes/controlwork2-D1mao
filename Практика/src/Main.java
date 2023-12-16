//Вариант 4
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Human> peopleList = new ArrayList<Human>();

        System.out.println("Сколько записей о людях хотите сделать: ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++){
            System.out.println("Работник/Посетитель: ");
            scan.nextLine();
            String choice = scan.nextLine();
            if (choice.equals("Работник")){
                peopleList.add(new Worker());
            } else if (choice.equals("Посетитель")){
                peopleList.add(new Buyer());
            }
        }
        System.out.println("Все люди в магазине: ");
        for (int i = 0; i < peopleList.size(); i++){
            peopleList.get(i).printInfo();
        }
        scan.close();
    }
}
