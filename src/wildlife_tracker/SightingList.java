/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wildlife_tracker;

/**
 *
 * @author oisinclarke
 */
public class SightingList {
    
    private Node head;
    private int size;
    
    public SightingList() {
        head = null;
        size = 0;
    }
    
    public WildLifeSighting get(int index){ 
        if (index < 0 || index >= size) {
            return null;
        }
        
        Node current = head;
        for (int i = 0; i < index; i++){
            current = current.getNext();
        }
        return current.getData();
    }
    
    public WildLifeSighting remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        WildLifeSighting removeData;
        
        if (index == 0) {
            removeData = head.getData();
            head = head.getNext();
        }else{
            Node current = head;
            for (int i = 0; i < index - 1; i++){
                current = current.getNext();
            }
            removeData = current.getNext().getData();
            current.setNext(current.getNext().getNext());
        }
        
        size --;
        
        return removeData;
    }
    
    public void add(WildLifeSighting sighting) {
        Node newNode = new Node(sighting);
        
        if (head == null){
            head = newNode;
        }else{
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
        
        size++;
    }
    
    public String getAllSightings() {
        String result = "";
        Node current = head;
        int index = 0;       
        while (current != null){
            result = result + index + current.getData().getSummary();
            current = current.getNext();
            index++;
        }
        return result;
    }
    
    public int size(){
        return size;
    }
    
    public boolean isEmpty(){
        return size == 0;
    }
    
}
