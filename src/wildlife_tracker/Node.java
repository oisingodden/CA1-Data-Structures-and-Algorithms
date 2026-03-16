/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wildlife_tracker;

/**
 *
 * @author oisinclarke
 */
public class Node {
    
    private WildLifeSighting data;
    private Node next;
    
    public Node (WildLifeSighting data) {
        
        this.data = data;
        this.next = null;
    }

    public WildLifeSighting getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(WildLifeSighting data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
