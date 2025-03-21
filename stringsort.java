import java.util.*;

class stringsort {
    public static void main(String[] args) {
       
        List<String> stringList = new ArrayList<>();
        stringList.add("Banana");
        stringList.add("Apple");
        stringList.add("Cherry");
        stringList.add("Date");

       
        System.out.println("Before Sorting: " + stringList);

        
        Collections.sort(stringList);


        System.out.println("After Sorting: " + stringList);
    }
}

