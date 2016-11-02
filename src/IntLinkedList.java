/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class IntLinkedList {
    // number of things in list
    private int numThings;
    
    // start of the list
    private IntNode head;
    
    /**
     * Constructor for a empty linked list
     */
    public IntLinkedList(){
        this.numThings = 0;
        this.head = null;
    }
    
    /**
     * Returns the size of the list
     * @return the number of items in the list
     */
    public int size(){
        return this.numThings;
    }
    
    /**
     * Checks if the list is empty
     * @return true if there is nothing in the list
     */
    public boolean isEmpty(){
        return this.numThings == 0;
    }
    
    /**
     * Add the number to the list
     * @param num the number to add to the list
     */
    public void add(int num){
        // create the node for the number
        IntNode n = new IntNode(num);
        
        // insert the node at the beginning
        // this is the first item to add
        if(this.numThings == 0){
            // the start of the list is now n
            head = n;
            this.numThings++;
        } else{
            // set the new node's next pointer
            n.setNext(head);
            // set the head items previous
            head.setPrev(n);
            // set the new start of the list
            head = n;
            this.numThings++;
        }
    }
    
    /**
     * Gets an item from a specific position
     * @param pos the position of the item
     * @return the item at the position
     */
    public int get(int pos){
        // throw an error if position doesn't exist
        if(pos >= this.numThings){
            throw new IndexOutOfBoundsException();
        }
        
        IntNode node = head;
        // walk the nodes
        for(int i = 0; i < pos; i++){
            node = node.next();
        }
        // give them the number!
        return node.getNum();
    }
    
    public static void main(String[] args) {
        IntLinkedList myList = new IntLinkedList();
        
        // add some numbers
        myList.add(7);
        myList.add(2);
        myList.add(-2);
        myList.add(50);
        
        // print the list
        for(int i = 0; i < myList.size(); i ++){
            System.out.println(myList.get(i));
        }
    }
}
