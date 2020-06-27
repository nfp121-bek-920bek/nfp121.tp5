package question2;

import java.util.Stack;
/**
 * Write a description of class Guardien here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gardien
{
    private Stack<Memento> mementos;
    
    public Gardien(){
        mementos = new Stack<>();
    }
    
    public Stack<Memento> getMementos(){
        return mementos;
    }
    
    public Memento getMemento(){
        return mementos.pop();
    }
    
    public Memento addMemento(Memento memento){
        return mementos.push(memento);
    }

}
