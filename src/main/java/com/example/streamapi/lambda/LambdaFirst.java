package com.example.streamapi.lambda;

//Let's start with a simple example of how to sort a list of strings in prior versions of Java:


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaFirst {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        System.out.println("sample list "+names);
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }

        });
        System.out.println("Sorting data using old method "+names);
        names.sort((a,b)->a.compareTo(b));
        System.out.println("Sorting data using lambda function "+names);

        names.sort(Collections.reverseOrder());
        System.out.println(""+names);
    }
}