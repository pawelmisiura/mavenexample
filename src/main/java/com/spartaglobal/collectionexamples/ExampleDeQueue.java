package com.spartaglobal.collectionexamples;

import java.util.Deque;
import java.util.LinkedList;

public class ExampleDeQueue {
    private Deque<String> deque = new LinkedList<>();

    public ExampleDeQueue(){
        deque.add("car1");
        deque.add("car2");
        deque.add("car3");
    }

    public void workingWithOutDeque(){
        for (String car : deque){
            System.out.println(deque);
        }
//        System.out.println(deque.peek());
    }

}
