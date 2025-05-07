package l18_Threading.THTaoLuongBangRunnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Luong chinh dang chay... ");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thread-1-HR-Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Luong chinh da dung lai!!! ");
    }
}