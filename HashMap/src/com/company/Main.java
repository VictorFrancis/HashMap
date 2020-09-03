package com.company;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //HashMap are like dictionary with Key,Value
        HashMap newMap = new HashMap();
        newMap.put("Victor",24);
        newMap.put("Fred",28);
        newMap.put("Mom",45);
        newMap.put("Dad",50);
        newMap.put("Neighbour",70);
        newMap.remove("Neighbour");

        System.out.println(newMap.entrySet()); //Displays all the entries in the HashMap
        System.out.println(newMap.get("Victor"));

        //A special type of iterator

        //Here it holds all the mappings above and be able to iterate
        Iterator ity = newMap.entrySet().iterator();

        while(ity.hasNext()){
            //Here we are making Map type of entry called pair which holds all the entries in ity
            //(Map.Entry) which converts directly to Map.Entry types
            Map.Entry pair = (Map.Entry) ity.next();
            System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());
        }

        //Type specific HashMap
        HashMap<Integer,String> reg = new HashMap<>();
        reg.put(1610026,"Victor");
        reg.put(1710266,"Peter");
        reg.put(1612678,"Ragib");

        System.out.println(reg.entrySet());
        System.out.println(reg.get(1610026));

    }
}
