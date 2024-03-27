import java.util.HashMap;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
public class GenericAbstractFactory {

    private HashMap<String, String> map = new HashMap<>();

    private void loadFile(String filePath) throws FileNotFoundException, ClassNotFoundException {

        File file = new File(filePath);
        Scanner myReader = new Scanner(file);

        while (myReader.hasNextLine()) {

            String data = myReader.nextLine();
            String[] keyAndArmory = data.split(",");
            String key = keyAndArmory[0];
            String armory = keyAndArmory[1];

            this.map.put(key, armory);
        }

        myReader.close();
    }

    public  GenericAbstractFactory(String configFilePath) throws FileNotFoundException, ClassNotFoundException {
        loadFile(configFilePath);
    }
    public <T> T get(String key) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        String className = this.map.get(key);

        if(className != null){

            Class<?> cls = ClassLoader.getSystemClassLoader().loadClass(className);
            return (T) cls.newInstance();
        }


        return null;
    }
}
