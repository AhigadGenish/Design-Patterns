import java.util.HashMap;

public class GenericFactory<T> {

    private interface Creator<T>{

        T create() throws InstantiationException, IllegalAccessException;
    }

    HashMap<String, Creator<T>> map;

    public GenericFactory(){

        map = new HashMap<>();

    }

    public void insertProduct(String key, Class<? extends T> c){

        this.map.put(key, new Creator<T>() {
            @Override
            public T create()  {
                try{
                    return c.newInstance();
                }
               catch (Exception e){
                    e.printStackTrace();
               }
                return null;
            }
        });
    }
    public T getNewProduct(String key) throws InstantiationException, IllegalAccessException {

        if(map.containsKey(key) == true){
            return map.get(key).create();
        }

        return null;
    }

}
