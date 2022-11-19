package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> myTreeSet = new TreeSet<>();

        for (Integer element: sourceList) {
            myTreeSet.add(element * element);
        }
        return myTreeSet.subSet(lowerBound, true, upperBound, true);
    }
}
