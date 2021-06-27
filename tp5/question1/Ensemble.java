package question1;

import java.util.*;

public class Ensemble<T> extends AbstractSet<T> {

    protected java.util.Vector<T> table = new java.util.Vector<T>();

    public int size() {
    if(table == null)
            return 0;
        return table.size();
    }

    public Iterator<T> iterator() {
    if(table == null)
            return null;
        return table.iterator();
    }

    public boolean add(T t) {
    if(table == null)
            return false;
        if(!this.contains(t)){
            table.add(t); 
            /**
             * Si on utilise this.add(t), la méthode addAll de la 
             * super classe déclenche une exception de type
             * 'StackOverflowError'
             */ 
            return true;
        }
        return false;
    }

    public Ensemble<T> union(Ensemble<? extends T> e) {
    if(e == null || this.table == null)
            return null;
        Ensemble union = new Ensemble();
        union.addAll(this.table);
        union.addAll(e.table);
        return union;
    }

    public Ensemble<T> inter(Ensemble<? extends T> e) {
        if(e == null || this.table == null)
            return null;
        Ensemble inter = new Ensemble();
        inter.addAll(this.table);
        inter.retainAll(e.table); 
        return inter;
    }

    public Ensemble<T> diff(Ensemble<? extends T> e) {
    if(e == null || this.table == null)
            return null;
        Ensemble diff = new Ensemble();
        diff.addAll(this.table);
        diff.removeAll(e.table);
        return diff;
    }

    Ensemble<T> diffSym(Ensemble<? extends T> e) {
    Ensemble union = this.union(e);
        if (union == null){
            return null;
        }
        Ensemble diffSym = this.union(e).diff(this.inter(e)); //union-intersection
        return diffSym;
    }
    
}
