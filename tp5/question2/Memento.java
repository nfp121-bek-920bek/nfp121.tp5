package question2;
import java.util.List;

/**
 * Write a description of class Memento here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Memento
{
    private List list;
    public Memento(List list){
        this.list = list;
    }

    public List getListe(){
        return this.list;
    }
}
