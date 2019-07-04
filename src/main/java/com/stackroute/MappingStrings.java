package com.stackroute;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MappingStrings {

    public String MappingStrings(Map<String,String> map) {
        String temp;
        if (map == null) {
            return null;
        }

        //Swapping the values for key1 and key2 i.e. val1 and val2. then make val 1 value as " "

        temp = map.get("val1");

        map.put("val1"," ");
        map.put("val2",temp);

        System.out.println(map.toString());
        return map.toString();
    }
}

