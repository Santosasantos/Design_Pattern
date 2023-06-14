package Behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    List<Memento> mementos=new ArrayList<>();

    public void addToMemento(Memento memento){
        mementos.add(memento);
    }
    public Memento getFromMemento(int index){
        return mementos.get(index);
    }
}
