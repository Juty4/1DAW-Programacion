package PaqClases;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjunto {
    private HashSet<Integer> conjunto = new HashSet<Integer>();

    public Conjunto() {
        this.CreateSet();
    }

    public HashSet<Integer> CreateSet() {
        return conjunto = new HashSet<Integer>();
    }

    public boolean EmptySet() {
        return conjunto.isEmpty();
    }

    public int SizeSet() {
        return conjunto.size();
    }

    public boolean ElementInSet(int element) {
        return conjunto.contains(element);
    }

    public void InsertElementSet(int element) {
        conjunto.add(element);
    }

    public void ViewElementSet(int element) {
        System.out.println(conjunto.toString());
    }

    public boolean EraseElementSet(int element) {
        return conjunto.remove(element);
    }

    public boolean EqualitySet(Conjunto c) {
        return conjunto.equals(c.conjunto);
    }

    public Conjunto IntersectionSets(Conjunto c) {
        Conjunto intersection = new Conjunto();

        intersection.conjunto.addAll(c.conjunto);
        intersection.conjunto.retainAll(c.conjunto);

//        for (Integer n : conjunto) {
//            if (conjunto.contains(n) && c.conjunto.contains(n)) {
//                intersection.InsertElementSet(n);
//            }
//        }
        return intersection;
    }

    public Conjunto UnionSets(Conjunto c) {
        Conjunto union = new Conjunto();
        for (Integer n : conjunto) {
            union.InsertElementSet(n);
        }
        for (Integer n : c.conjunto) {
            union.InsertElementSet(n);
        }
        return union;
    }

    public boolean SubSet(Conjunto c) {
        return conjunto.containsAll(c.conjunto);
    }

    public Conjunto DifferenceSets(Conjunto c) {
        Conjunto difference = new Conjunto();
//
//        for (Integer n : conjunto) {
//            difference.InsertElementSet(n);
//        }
//        for (Integer n : c.conjunto) {
//            if (c.conjunto.contains(n) == difference.conjunto.contains(n))
//            difference.EraseElementSet(n);
//            else
//                difference.InsertElementSet(n);
//        }
        difference.CreateSet();
        difference.conjunto = conjunto;
        for (Integer n : c.conjunto) {
            difference.conjunto.remove(n);
        }
        return difference;
    }
}