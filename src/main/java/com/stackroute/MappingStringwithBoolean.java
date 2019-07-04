//Write a program where an array of strings is input and output is a Map<String,boolean> where
//        each different string is a key and its value is true if that string appears 2 or more times in the array
//        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
//        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}

package com.stackroute;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappingStringwithBoolean {


    public String mappwithBoolean(String input){

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

        //using above mapped value to check if key-value pair has value >2 or not. if 2 then put true else false

        Map<String,Boolean> booleanMap = new HashMap<>();

        for(String each:map.keySet()){

            if(map.get(each)>=2){

                booleanMap.put(each,true);

            }else {

                booleanMap.put(each,false);
            }
        }
        return booleanMap.toString();

    }
}
