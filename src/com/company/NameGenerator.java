package com.company;

import java.util.*;

public class NameGenerator {
    private static Set<String> nameCat;
    private static int nameId = 0;
    NameGenerator() {
        nameCat = new HashSet<String>(Arrays.asList("Alex", "Bob", "Charlie", "David", "Elliot", "Francis", "George", "Harry", "Indiana", "John", "Kelly", "Larry", "Malcolm", "Newt", "Oscar", "Peter","Randy", "Sean", "Toby", "Van", "Willy", "Ricky", "Ray", "Phil", "Zowie", "Noel", "Neil", "Bruce"));
    }
    public static String setName() {
        nameCat = new HashSet<String>(Arrays.asList("Alex", "Bob", "Charlie", "David", "Elliot", "Francis", "George", "Harry", "Indiana", "John", "Kelly", "Larry", "Malcolm", "Newt", "Oscar", "Peter","Randy", "Sean", "Toby", "Van", "Willy", "Ricky", "Ray", "Phil", "Zowie", "Noel", "Neil", "Bruce"));
        List<String> list = new ArrayList<String>(nameCat);
        nameId++;
        return list.get(nameId/10)+" "+list.get(nameId-nameId/10);
    }
}
