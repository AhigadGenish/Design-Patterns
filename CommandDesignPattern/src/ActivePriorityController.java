import java.util.*;
import java.util.PriorityQueue;

import java.util.concurrent.PriorityBlockingQueue;

public class ActivePriorityController {

    PriorityBlockingQueue<Pair<Command,Integer>> priorityQueue;
    Thread thread;
    volatile boolean stop = false;
    public ActivePriorityController(){
        createPriorityQueue();
        startTasksInNewThread();
    }

    private void startTasksInNewThread() {

        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                while(stop == false){
                    Pair<Command,Integer> cur = null;
                    try {
                        cur = priorityQueue.take();
                        cur.first.execute();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        });

        thread.start();
    }

    private void createPriorityQueue() {
        this.priorityQueue = new PriorityBlockingQueue<Pair<Command, Integer>>(100, new Comparator<Pair<Command, Integer>>() {
            @Override
            public int compare(Pair<Command, Integer> o1, Pair<Command, Integer> o2) {
                return o1.second - o2.second;
            }
        });
    }

    public void addCommand(Command anyCommand, int priority) {

        this.priorityQueue.add(new Pair<Command,Integer>(anyCommand, priority));
    }

    public void close(){

        this.priorityQueue.add(new Pair<>(new Command() {
            @Override
            public void execute() {
                stop = true;
            }
        }, Integer.MAX_VALUE));
    }
}
