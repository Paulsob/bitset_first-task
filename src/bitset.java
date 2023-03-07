import java.util.ArrayList;
import java.util.Objects;

public class bitset {
    private int length;
    //создание массива длины length

    private final ArrayList<Integer> numbers = new ArrayList<>(length);

    public bitset(int len) {
        // реализация инициализации этого массива и заполнение данными
        this.length = len;
        for (int i = 0; i < len; i++) {
            this.numbers.add(i);
        }
    }

    public ArrayList<Integer> getMas(){
        return this.numbers;
    }

    public Integer getLen(){
        return length;
    }
    public void printing() {
        System.out.println(this.numbers);
        System.out.println(this.length);
    }

    public bitset unification(bitset bNew) {
        // реализация объединения двух множеств
        bitset b3 = new bitset(0);
        b3.numbers.addAll(this.numbers);
        b3.numbers.addAll(bNew.numbers);
        b3.length = this.length + bNew.length;
        return b3;
    }

    public bitset intersection(bitset bNew) {
        // реализация пересечения двух множеств
        int count = 0;
        bitset b3 = new bitset(0);
        for (int i = 0; i < this.length; ++i) {
            for (int j = 0; j < bNew.length; ++j) {
                if (Objects.equals(this.numbers.get(i), bNew.numbers.get(j))) {
                    count++;
                    b3.numbers.add(this.numbers.get(i));
                }
            }
        }
        b3.length = count;
        return b3;
    }

    public bitset addingElement(int element) {
        // реализация добавления заданного элемента
        bitset b3 = new bitset(0);
        b3.numbers.addAll(this.numbers);
        b3.numbers.add(element);
        b3.length = this.length + 1;
        return b3;
    }

    public bitset addingArray(ArrayList<Integer> arrayList) {
        // реализация добавления заданного массива элементов
        bitset b3 = new bitset(0);
        b3.numbers.addAll(this.numbers);
        b3.numbers.addAll(arrayList);
        b3.length = this.length + arrayList.size();
        return b3;
    }

    public String belonging(bitset bNew, int element) {
        // реализация проверки принадлежности элемента массиву
        if (bNew.numbers.contains(element))
            return "Element " + element + " belongs to the bitset b2";
        return "Element " + element + " does not belongs to the bitset b2";
    }
// убрал static в main'е
    public void main(String[] args) {
        bitset b1 = new bitset(4);
        bitset b2 = new bitset(9);
        bitset b3 = new bitset(0);
        ArrayList<Integer> arrayList = new ArrayList<>();
        b3 = b1.unification(b2);
        b3.printing();
        b3 = b1.intersection(b2);
        b3.printing();
        b3 = b1.addingElement(4);
        b3.printing();
        b3 = b1.addingArray(arrayList);
        b3.printing();
        String str = b1.belonging(b2, 22);
        System.out.println(str);
    }
}
