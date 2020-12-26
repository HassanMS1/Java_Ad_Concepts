import java.util.HashSet;

public class Hashes {


    public static void main(String[] args) {
        // A set does not allow duplicates , remember discreet mathmatics .
        // hashset is that

        HashSet <Integer> numbers = new HashSet <>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        System.out.println(numbers.size());

    }


}
