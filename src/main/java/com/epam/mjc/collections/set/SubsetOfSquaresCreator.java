package com.epam.mjc.collections.set;

import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
      
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        for (Integer number : sourceList) {
            int square = number * number;
            if ((square >= lowerBound) && (square <= upperBound)){
                navigableSet.add(square);
            }
        }
        return navigableSet;
    }
}
