public class CodeExecuterTask implements Task{

    protected void preCompile(){}
    protected void compile(){}

    protected void execute(){ System.out.println("In execute");}

    @Override
    public void doTask() {
        execute();
    }
}
