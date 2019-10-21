package com.spartaglobal.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExampleMaps {
    private Map<Integer, String> studentsInClass = new HashMap<>();

    public ExampleMaps(){
        studentsInClass.put(1, "Steve");
        studentsInClass.put(2, "Bobby");
        studentsInClass.put(3, "Emily");
    }

    public String returnValue(int keyNum){
        return studentsInClass.get(keyNum);
    }

    public void loopThroughMap(){
        Collection<String> values = studentsInClass.values();

        for (String data : values){
            System.out.println(data);
        }

        System.out.println(studentsInClass.keySet());
    }
}

