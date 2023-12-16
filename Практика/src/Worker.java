public class Worker extends Human{
    protected String job;

    Worker(){
        super();
        System.out.println("Задайте должность: ");
        job = scan.nextLine();
    }

    @Override
    public void printInfo(){
        System.out.println("Инфа о сотруднике:");
        System.out.println("Имя: "+name);
        System.out.println("Должность: "+job+"\n");
    }
}
