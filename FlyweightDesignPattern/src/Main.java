public class Main {
    public static void main(String[] args) {

        CharacterFlyweightFactory flyweightFactory = new CharacterFlyweightFactory();


        Character doc[][] = new Character[100][100];
        doc[10][5] = flyweightFactory.get("A,David,red,3");
        doc[13][2] = flyweightFactory.get("A,David,red,3");
        doc[14][2] = flyweightFactory.get("A,David,blue,4");
        //doc[13][2].setFontSize(4);
        doc[13][2] = flyweightFactory.get(doc[13][2]).setFontSize(4).setFontColor("blue").build(flyweightFactory);
        System.out.println(doc[10][5] == doc[13][2]);
        System.out.println(doc[14][2] == doc[13][2]);
        System.out.println(doc[10][5].getFontSize());

        for(int i = 0; i < doc.length ; i++){
            for(int j = 0; j < doc[i].length; j++){
                if(doc[i][j] != null){
                    doc[i][j].paint(i, j);
                }
            }
        }

    }
}