public class Uebung {
    private boolean get;
    private String name;
    Uebung(String name,boolean get){
        this.name = name;
        this.get = get;
    }
    

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setGet(boolean get){
        this.get = get;
    }
    public boolean getGet(){
        return this.get;
    }
    public String toString(){
        return name;
    }
}
