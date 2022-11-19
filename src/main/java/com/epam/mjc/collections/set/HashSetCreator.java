package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {

        HashSet<Integer> myHashSet = new HashSet<Integer>();

        for (Integer element: sourceList) {
            if (element % 2 == 0){
                do {
                    myHashSet.add(element);
                    element /= 2;
                } while (element % 2 == 0); {
                    myHashSet.add(element);
                }
            }
            else {
                myHashSet.add(element);
                myHashSet.add(element * 2);
            }
        }
        return myHashSet;
    }
}
