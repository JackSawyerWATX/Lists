import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    
    // creating an ArrayList that can hold Integer objects
    ArrayList<Integer> list = new ArrayList<>();

    //adding to the queue
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    //removing from the list requires using the index points
    list.remove(0);

    System.out.println(list);
    }
}