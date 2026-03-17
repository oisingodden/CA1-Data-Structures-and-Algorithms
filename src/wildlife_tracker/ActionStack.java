/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wildlife_tracker;

import java.util.Stack;

/**
 *
 * @author oisinclarke
 */
public class ActionStack {
    
    private Stack<String> stack;
    
    public ActionStack(){
        stack = new Stack<>();
    }
    
    public String pop(){
        if (!stack.isEmpty()){
            return stack.pop();
        }
        return null;
    }
    
    public void push(String action){
        stack.push(action);
    }
    
    
    public String peek(){
        if(!stack.isEmpty()){
            return stack.peek();
        }
        return null;
    }
    
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    
    public int size(){
        return stack.size();
    }
}
