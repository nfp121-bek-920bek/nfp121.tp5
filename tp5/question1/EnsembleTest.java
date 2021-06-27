package question1;

public class EnsembleTest extends junit.framework.TestCase {

   public void testUnion() {
    question1.Ensemble<Integer> e1, e2;
    e1 = new question1.Ensemble<Integer>();
    assertEquals(true, e1.add(2));
    assertEquals(true, e1.add(3));

    e2 = new question1.Ensemble<Integer>();
    assertEquals(true, e2.add(3));
    assertEquals(true, e2.add(4));

    question1.Ensemble<Integer> union = e1.union(e2);
    assertEquals(3, union.size());
    assertTrue(union.contains(2));
    assertTrue(union.contains(3));
    assertTrue(union.contains(4));
    }

    public void testAdd(){
        question1.Ensemble<Integer> ensemble = new question1.Ensemble<Integer>();
        assertTrue(ensemble.add(11));
        assertTrue(ensemble.add(12));
        assertTrue(ensemble.add(13));
        assertEquals(3, ensemble.size());
        assertTrue(ensemble.add(14));
        assertEquals(4, ensemble.size());
        assertFalse(ensemble.add(14));
        assertEquals(4, ensemble.size());
    }

    public void testInter() {
        question1.Ensemble<Integer> ensemble1, ensemble2;
        ensemble1 = new question1.Ensemble<Integer>();
        assertEquals(true, ensemble1.add(1));
        assertEquals(true, ensemble1.add(2));

        ensemble2 = new question1.Ensemble<Integer>();
        assertEquals(true, ensemble2.add(1));
        assertEquals(true, ensemble2.add(4));
        assertEquals(true, ensemble2.add(5));

        question1.Ensemble<Integer> inter = ensemble1.inter(ensemble2);
        assertEquals(1, inter.size());
        assertTrue(inter.contains(1));
        assertFalse(inter.contains(5));
        assertFalse(inter.contains(4));
        assertFalse(inter.contains(2));
    }

    public void testDiff() {
        question1.Ensemble<Integer> ensemble1, ensemble2;
        ensemble1 = new question1.Ensemble<Integer>();
        assertEquals(true, ensemble1.add(1));
        assertEquals(true, ensemble1.add(2));
        assertEquals(true, ensemble1.add(3));

        ensemble2 = new question1.Ensemble<Integer>();
        assertEquals(true, ensemble2.add(3));
        assertEquals(true, ensemble2.add(4));

        question1.Ensemble<Integer> diff = ensemble1.diff(ensemble2);
        assertEquals(2, diff.size());
        assertTrue(diff.contains(1));
        assertTrue(diff.contains(2));
        assertFalse(diff.contains(3));
    }

    public void testDiffSym() {
        question1.Ensemble<Integer> ensemble1, ensemble2;
        ensemble1 = new question1.Ensemble<Integer>();
        assertEquals(true, ensemble1.add(1));
        assertEquals(true, ensemble1.add(2));

        ensemble2 = new question1.Ensemble<Integer>();
        assertEquals(true, ensemble2.add(1));
        assertEquals(true, ensemble2.add(5));

        question1.Ensemble<Integer> diffSym = ensemble1.diffSym(ensemble2);
        assertEquals(2, diffSym.size());
        assertTrue(diffSym.contains(2));
        assertTrue(diffSym.contains(5));
        assertFalse(diffSym.contains(1));
    }
    
}
