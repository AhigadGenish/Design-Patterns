public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Thread newThread = new Thread(new CodeExeRunnable());
        newThread.start();
    }
}