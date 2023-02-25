import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;

public class bitset {

    public static void main(String[] args) {

        BitSet b1 = new BitSet(4);
        BitSet b2 = new BitSet(4);
        BitSet b3 = new BitSet();
        BitSet b4 = new BitSet();

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        b1.set(0, true);
        b1.set(1, true);
        b1.set(2, true);
        b1.set(3, true);

        b2.set(0, true);
        b2.set(1, true);
        b2.set(2, true);
        b2.set(3, true);

//        numbers.add(0);
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);

        System.out.println("B1: " + b1);
        System.out.println("B2: " + b2);

        b1.and(b2);
        System.out.println("B1 and B2: " + b1);

        b1.or(b2);
        System.out.println("B1 or B2: " + b1);

        for (int i = 0; i < 4; i++) {

        }
        System.out.println("i in B1: " + b3);
    }
}