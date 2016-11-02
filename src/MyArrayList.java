/*
 * Example of Abstraction
 */

/**
 *
 * @author richj0985
 */
public class MyArrayList {
    
    // to stoe things
    private int[] numbers;
    
    // numb er of things
    private int numThings;
    
    /**
     * Constructor
     */
    public MyArrayList(){
        // create a blank array with 10 spots
        this.numbers = new int[10];
        
        // number of things to 0
        this.numThings = 0;
    }
    
    /**
     * Gets the size of the list
     * @return  the size of the list
     */
    public int size(){
        return this.numThings;
    }
    
    /**
     * Returns if the list is empty
     * @return true if empty
     */
    public boolean isEmpty(){
        return this.numThings == 0;
    }
    
    /**
     * Adds a new number to the list
     * @param num the number to add to the list
     */
    public void add(int num){
        if(this.numThings == this.numbers.length){
            int[] temp = new int[numbers.length * 2];
            // copy the values over
            for(int i = 0; i < this.numThings; i++){
                temp[i] = this.numbers[i];
            }
            // make the numbers array point to temp
            this.numbers = temp;
            
            // insert new value
            this.numbers[this.numThings] = num;
            
            // increase the counter
            this.numThings++;
            
        }else{
            // put number in the array
            this.numbers[this.numThings] = num;
            
            // increase the counter
            this.numThings++;
        }
    }
    
    /**
     * removes a number from the list
     * @param num the number to remove
     */
    public void remove(int num){
        // goes through the array
        for(int i = 0; i < this.numThings; i++){
            // if the number is found
            if(this.numbers[i] == num){
                // shuffle down
                while(i < this.numThings - 1){
                    this.numbers[i] = this.numbers[i + 1];
                    i++;
                }
                // decrease counter
                this.numThings--;
                
                // stop searching
                break;
            }
        }
    }
    
    /**
     * Gets an number from the list
     * @param i position in the list to get
     * @return the number at that position
     */
    public int get(int i){
        // make sure it is an actual item
        if(i >= this.numThings){
            throw new IndexOutOfBoundsException();
        }
        return this.numbers[i];
    }
    
    /**
     * Main method of program
     * @param args 
     */
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(5);
        list.add(2);
        list.add(7);
        list.add(6);
        list.remove(5);
        
        for(int i = 0; i < list.size(); i ++){
            System.out.println(list.get(i));
        }
        
//        ArrayList<Integer> other = new ArrayList<>();
        
    }
}

    
