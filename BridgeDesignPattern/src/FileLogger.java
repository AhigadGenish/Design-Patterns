public class FileLogger implements Logger{
    @Override
    public void writeToLog(String text) {
        // Write log to file
        System.out.println(text);
    }
}
