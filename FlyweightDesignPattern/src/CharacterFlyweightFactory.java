import java.util.HashMap;

public class CharacterFlyweightFactory {

    private HashMap<String, Character> map;

    public CharacterFlyweightFactory(){
        this.map = new HashMap<>();
    }

    public Character get(String key){

        if(map.containsKey(key)){
            return map.get(key);
        }

        Character c = new Character(key);
        map.put(key,c);
        return c;
    }

    public CharacterBuilder get(Character anyChar) {
        return new CharacterBuilder(anyChar);
    }



}
