import java.util.HashSet; //have to import the HashSet code
import java.util.Iterator; //have to import the iterator code

public class Hashbrowns {
    public static void main(String[] args ){
        //Regular array to compare differences
        int[] a = {3,5,1};
        System.out.println(a[1]);

        //String hashset example, breakfast foods
        HashSet<String> breaky = new HashSet<String>(); //creating a hashset
        breaky.add("Bacon");
        breaky.add("Eggs");
        breaky.add("Pancakes");
        breaky.add("Toast");

        System.out.println(breaky);

       breaky.remove("Eggs");

       System.out.println(breaky.size());
       System.out.println(breaky.contains("Bacon"));


       //Testing iterator using an integer hashset
        HashSet<Integer> num = new HashSet<Integer>();
        num.add(17);
        num.add(8);
        num.add(22);
        num.add(45);

        //Real iterator time
        Iterator<Integer> it = num.iterator(); //this method allows us to iterate through the hashset, it return an
        // iterator object so we created one called "it".
        while (it.hasNext()) { //while it still has values
            System.out.println(it.next());
        }

    }
}


