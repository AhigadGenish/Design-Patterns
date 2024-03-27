public class Main {
    public static void main(String[] args) {

        CFuture<String> cs = CFuture.supplyAsync(()->{try{
        Thread.sleep(4000);}
        catch (InterruptedException e){

        }
         return "42";
        });

        CFuture<Integer> ci = cs.thenApply(s->Integer.parseInt(s));
        CFuture<Integer> ci2 = ci.thenApply(x->2*x);
        ci2.thenAccept(x->System.out.println(x));
        System.out.println("Main is dead");
    }
}