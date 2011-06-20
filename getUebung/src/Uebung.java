
public class Uebung {
    private boolean get;
    private Uebung next;
    private Uebung previous;
    private String name;
    
    Uebung(String name,Uebung previous,Uebung next,boolean get){
        this.name = name;
        this.previous = previous;
        this.next = next;
        this.get = get;
    }
    
    public String getName(){
        return null;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNext(Uebung next){
        this.next = next;
    }
    public Uebung getNext(){
        return this.next;
    }
    public Uebung getPrevious(){
        return this.previous;
    }
    public void setGet(boolean get){
        this.get = get;
    }
    public boolean getGet(){
        return this.get;
    }
}
