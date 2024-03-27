
public class Character {

    public final char letter;
    public final String fontFamily;
    public final String fontColor;
    public final int fontSize;

    public Character(String value){

        String sp[] = value.split(",");
        this.letter = sp[0].charAt(0);
        this.fontFamily = sp[1];
        this.fontColor = sp[2];
        this.fontSize = Integer.parseInt(sp[3]);
    }

    public void paint(int row, int col){
        // paint the character
    }

    public int getFontSize(){
        return this.fontSize;
    }


}
