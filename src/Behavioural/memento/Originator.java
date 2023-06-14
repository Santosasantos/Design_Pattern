package Behavioural.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }
    public Memento saveState(){
        System.out.println("Originator save the state: "+state+" To Memento");
        return new Memento(state);
    }
    public void restorefromMemento(Memento memento){
        this.state= memento.getState();
        System.out.println(state+" State restored from Memento");

    }
}
