public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        MyThreadPoolDemo tp = new MyThreadPoolDemo();
        Future<String> f = tp.submit(() -> {
            try{
                Thread.sleep(4000);
            }
            catch (InterruptedException e){
            }
            return "42";
        } );

        System.out.println(f.get());
    }
}