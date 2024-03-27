public class CodeExeRunnable extends CodeExecuterTask implements Runnable{


    @Override
    public void run() {
        preCompile();
        compile();
        execute();
    }
}
