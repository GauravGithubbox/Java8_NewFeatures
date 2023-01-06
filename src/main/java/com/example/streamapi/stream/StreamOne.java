package com.example.streamapi.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamOne {
    public static void main(String[] args) {
        List<String> streamList = new ArrayList<>();
        streamList.add("Stream");
        streamList.add("is");
        streamList.add("a");
        streamList.add("major");
        streamList.add("factor");
        streamList.add("in");
        streamList.add("java");
        streamList.add("and");
        streamList.add("java8");
        streamList.add("jaaaa");
        System.out.println("List of string"+streamList);

        //1-filter out string whose start with j
        System.out.println("---------------Stream----------------------");
        streamList
                .stream()
                .filter((s)->s.startsWith("j"))
                .forEach(System.out::println);

        //2-    filter out string whose start with j in sort form
        System.out.println("---------------Stream with sort----------------------");
        streamList
                .stream()
                .sorted()
                .filter(s -> s.startsWith("j"))
                .forEach(System.out::println);

        //3- using map convert all string to uppar case
        System.out.println("---------------Stream with Map----------------------");
        streamList
                .stream()
                .map(m->m.toUpperCase())
                .forEach(System.out::print);

        //4 - find a string that is start with j letter
        System.out.println("---------------Stream with Match----------------------");
        boolean stringStartWithA = streamList
                .stream()
                .anyMatch(s->s.startsWith("j"));
        System.out.println("String Start with A "+stringStartWithA);

        //5- Count String whose start with j
        System.out.println("---------------Stream with Count----------------------");
        long countStringStartWithJ = streamList
                .stream()
                .filter(s->s.startsWith("j"))
                .count();
        System.out.println("Number of String whose start with j ="+countStringStartWithJ);

        // reduce string
        System.out.println("---------------Stream with reduce----------------------");
        Optional<String> reduced =
                streamList
                        .stream()
                        .reduce((s1, s2) -> s1 + "#" + s2);

        reduced.ifPresent(System.out::println);
    }

}
