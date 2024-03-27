public class CharacterBuilder {

    public char letter;
    public String fontFamily;
    public String fontColor;
    public int fontSize;

    public CharacterBuilder(Character anyChar){

        this.letter = anyChar.letter;
        this.fontColor = anyChar.fontColor;
        this.fontFamily = anyChar.fontFamily;
        this.fontSize = anyChar.fontSize;
    }

    public CharacterBuilder setLetter(char letter) {
        this.letter = letter;
        return this;
    }

    public CharacterBuilder setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
        return this;
    }

    public CharacterBuilder setFontColor(String fontColor) {
        this.fontColor = fontColor;
        return this;
    }

    public CharacterBuilder setFontSize(int fontSize) {
        this.fontSize = fontSize;
        return this;
    }

    public  Character build(CharacterFlyweightFactory anyFlyWeight){
        return anyFlyWeight.get(this.letter + "," + this.fontFamily + "," + this.fontColor + "," + this.fontSize);
    }
}
