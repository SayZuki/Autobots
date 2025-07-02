package com.autobots.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {

        List<List<String>> nestedList = List.of(
          List.of("A", "B"),
          List.of("C", "D"),
          List.of("E")
        );


        List<String> nonNestedList = new ArrayList<>();
        for (List<String> list : nestedList){
            nonNestedList.addAll(list);
        }

        System.out.println(nonNestedList);
        List<String> nonNestedListWithSrteam = nestedList.stream()
                .flatMap(List ::stream).collect(Collectors.toList());
        System.out.println();


    }

}
