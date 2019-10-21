package com.spartaglobal.collectionexamples;

import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueues {
    private Queue<String> stringQueue = new LinkedList<>();

    public ExampleQueues() {
        stringQueue.add("one");
        stringQueue.add("two");
        stringQueue.add("three");
        stringQueue.add("four");
    }

    public void queueRunner(){
        System.out.println(stringQueue.peek());
        System.out.println(stringQueue.poll());
        System.out.println(stringQueue.remove());

        for(String itemInQueue : stringQueue){
            System.out.println(itemInQueue);
        }
    }
}

