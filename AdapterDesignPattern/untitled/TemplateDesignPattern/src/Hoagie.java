public abstract class Hoagie {

    final void makeSandwich(){

        cutBun();

        if(customerWantsMeat() == true){
            addMeat();
        }
        if(customerWantsCheese() == true){
            addCheese();
        }

        wrapTheHoagie();
    }

    public boolean customerWantsCheese() {
        return true;
    }

    abstract void addMeat();
    abstract void addCheese();
    boolean customerWantsMeat(){
        return true;
    }
    public void cutBun(){
        System.out.println("The Hoagie is Cut");
    }
    public void wrapTheHoagie(){
        System.out.println("The Hoagie is Wrapped");
    }


}
