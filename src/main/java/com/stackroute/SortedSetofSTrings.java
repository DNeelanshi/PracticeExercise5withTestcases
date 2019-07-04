

//6. Write a program to implement set interface which sorts the given randomly ordered names in
//
//        ascending order. Convert the sorted set in to an array list
//        Input : Harry Olive Alice Bluto Eugene
//        Output :
//        Sorted Set : Alice Bluto Eugene Harry Olive
//        Array list from Set : Alice Bluto Eugene Harry Olive

package com.stackroute;
import java.util.*;

public class SortedSetofSTrings {

    //    method is used to implement set interface which sorts the given randomly ordered names in
//        ascending order

    public String sortArrayListUsingSortedSet(String string){

        if (string==null)
        {
            return null;
        }
        SortedSet<String> sortedSet = new TreeSet<>(Arrays.asList(string.split(" ")));

        return new ArrayList<String>(sortedSet).toString();
    }

}