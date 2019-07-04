//Write a program to find the number of counts in the following String. Store the output in
//        Map<String,Integer> as key value pair.
//        Input : String str = “one one -one___two,,three,one @three*one?two”;
//        Output : {"one":5 , "two":2, "three" :2}

package com.stackroute;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountStringSaveKeyValuePAIR {

    public String checkFrequency(String input) {

        if (input == null) {
            return null;
        }

        List<String> stringList = Arrays.asList(input.split("[\\W_]+")); //splitting string by special characters


        Map<String, Integer> map = new HashMap<>(); //collection usage for mapping key value pair

        for (String each : stringList) { //loop for counting each word and storing against it via mapping

            if (map.containsKey(each)) {
                map.replace(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }

        }


        return map.toString();
    }


}
