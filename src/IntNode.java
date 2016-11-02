/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class IntNode {
    // integer it is storing
    private int num;
    
    // next node link
    private IntNode next;
    
    // previous node
    private IntNode prev;
    
    public IntNode(int num){
        this.num = num;
        this.next = null;
        this.prev = null;
    }
    
    public IntNode next(){
        return this.next;
    }
    
    public IntNode prev(){
        return this.prev;
    }
    
    public void setNext(IntNode n){
        this.next = n;
    }
    
    public void setPrev(IntNode n){
        this.prev = n;
    }
    
    public int getNum(){
        return this.num;
    }
}
