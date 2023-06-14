package Behavioural.memento;

public class MementoMain {
    public static void main(String[] args) {
        Originator originator=new Originator();
        Caretaker caretaker=new Caretaker();

        originator.setState("Hello");
        caretaker.addToMemento(originator.saveState());
        originator.setState("world");
        caretaker.addToMemento(originator.saveState());
        originator.setState("Shanto");
        caretaker.addToMemento(originator.saveState());

//        caretaker.getFromMemento(2);
//        caretaker.getFromMemento(1);
//        caretaker.getFromMemento(0);
        originator.restorefromMemento(caretaker.getFromMemento(2));
        originator.restorefromMemento(caretaker.getFromMemento(1));
        originator.restorefromMemento(caretaker.getFromMemento(0));
    }
}
