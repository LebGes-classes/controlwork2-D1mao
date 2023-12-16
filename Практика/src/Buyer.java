public class Buyer extends Human{
    protected int age;

    Buyer(){
        super();
        System.out.println("Задайте возраст: ");
        age = scan.nextInt();
    }

    @Override
    public void printInfo(){
        System.out.println("Инфа о покупателе:");
        System.out.println("Имя: "+name);
        System.out.println("Возраст: "+age+"\n");
    }
}
