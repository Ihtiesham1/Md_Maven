import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Framework {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(90);
        numbers.add(100);
        numbers.add(200);
        numbers.add(15);
        System.out.println("ArrayList Details=");
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println("Sorted ArrayList=");
        System.out.println(numbers);

        //Create a HashSet to store unique names and display them
        HashSet<String> names = new HashSet<>();
        names.add("Rahul");
        names.add("Mothi");
        names.add("Murali");
        names.add("Saheb"); 
        
        System.out.println("Hashset list details");
        System.out.println(names);

        //Create a HashMap to store student names as keys and their scores as values
        HashMap<String, Integer> studentdetails = new HashMap<>();
        studentdetails.put("Rahul", 85);
        studentdetails.put("Mothi", 92);
        studentdetails.put("Murali", 78);
        studentdetails.put("Saheb", 88);
        
        System.out.println("Hashmap details");
        for (Map.Entry<String, Integer> entry : studentdetails.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
    
}
