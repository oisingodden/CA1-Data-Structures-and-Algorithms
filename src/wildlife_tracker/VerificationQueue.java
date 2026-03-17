/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wildlife_tracker;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author oisinclarke
 */
public class VerificationQueue {
    
    private Queue<Integer> queue;
    
    public VerificationQueue() {
        queue = new LinkedList<>();
    }
    
    public void offer(Integer index){
        queue.offer(index);
    }
    
    public Integer peek(){
        return queue.peek();
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public int size(){
        return queue.size();
    }
    
    public Integer poll(){
        return queue.poll();
    }
}
