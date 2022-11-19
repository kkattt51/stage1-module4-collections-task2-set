package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {
        Set<String> mySet = new HashSet<>();

        for (String element: firstSet) {
            if (secondSet.contains(element) && !thirdSet.contains(element)){
                mySet.add(element);
            }
        }

        for (String element: thirdSet) {
            if (!secondSet.contains(element) && !firstSet.contains(element)){
                mySet.add(element);
            }
        }
        return mySet;
    }
}
