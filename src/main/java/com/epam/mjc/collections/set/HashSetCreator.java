package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int number : sourceList){
            if (number % 2 == 0){
                do{
                    hashSet.add(number);
                    number = number / 2;
                }
                while (number % 2 == 0);
                hashSet.add(number);
            } else {
                hashSet.add(number);
                hashSet.add(number * 2);
            }
        }
        return hashSet;
    }
    
}
