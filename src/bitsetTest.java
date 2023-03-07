import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class bitsetTest {

    @Test
    public void unification() {
        bitset b1 = new bitset(4);
        bitset bNew = new bitset(9);
        bitset actual = b1.unification(bNew);
        ArrayList<Integer> numbers = new ArrayList<>(13);
        int[] list = {0, 1, 2, 3, 0, 1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < 13; i++) {
            numbers.add(list[i]);
        }
        int length = 13;
        assertEquals(length, actual.getLen());
        assertEquals(numbers, actual.getMas());
    }

    @Test
    public void intersection() {
        bitset b1 = new bitset(4);
        bitset bNew = new bitset(9);
        bitset actual = b1.intersection(bNew);
        ArrayList<Integer> numbers = new ArrayList<>(4);
        int[] list = {0, 1, 2, 3};
        for (int i = 0; i < 4; i++) {
            numbers.add(list[i]);
        }
        int length = 4;
        assertEquals(length, actual.getLen());
        assertEquals(numbers, actual.getMas());
    }

    @Test
    public void addingElement() {
        bitset b1 = new bitset(4);
        bitset actual = b1.addingElement(4);
        ArrayList<Integer> numbers = new ArrayList<>(5);
        int[] list = {0, 1, 2, 3, 4};
        for (int i = 0; i < 5; i++) {
            numbers.add(list[i]);
        }
        int length = 5;
        assertEquals(length, actual.getLen());
        assertEquals(numbers, actual.getMas());
    }

    @Test
    public void addingArray() {
        bitset b1 = new bitset(4);
        int[] array = {4, 5, 6, 7, 8};
        ArrayList<Integer> numbers = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            numbers.add(array[i]);
        }
        int[] expected = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> expect = new ArrayList<>(9);
        for (int j = 0; j < 9; j++) {
            expect.add(expected[j]);
        }
        bitset actual = b1.addingArray(numbers);
        int length = 9;
        assertEquals(length, actual.getLen());
        assertEquals(expect, actual.getMas());
    }

    @Test
    public void belonging() {
        bitset bNew = new bitset(6);
        int element = 5;
        String actual = "Element 5 belongs to the bitset b2";
        String expected = bNew.belonging(bNew, element);
        assertEquals(expected, actual);
    }
}