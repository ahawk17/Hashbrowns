import java.util.HashSet; //have to import the HashSet code
import java.util.Iterator;

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

        //You can iterate through elements by making the hashset into an array:
        Object[] ball = num.toArray(); //this new array is an object
        System.out.println(ball); //prints jibberish because that is where the array is in memory
        System.out.println(ball[0]); //the first element can be any of the numbers because Hashsets have no order

        //Real iterator time
        Iterator<Integer> it = ball.iterator(); //this method allows us to iterate through the hashset, it return an
        // iterator object so we created one called "it".
        

    }
}
