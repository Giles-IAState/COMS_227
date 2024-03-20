package lab8;

public class IntListTest {

    public static void main(String[] args) {

//        IntList list = new IntList();
//
//        list.add(5);
//        list.add(4);
//        list.add(3);
//        System.out.println(list);
//        System.out.println("Size: " + list.size());
//        System.out.println("Min: " + list.getMinimum());
//        System.out.println("Max: " + list.getMaximum());

        IntListSorted newList = new IntListSorted();

        newList.add(4);
        newList.add(5);
        newList.add(7);
        newList.add(16);
        newList.add(3);
        newList.add(6);
        System.out.println(newList);
        System.out.println("Size: " + newList.size());
        System.out.println("Min: " + newList.getMinimum());
        System.out.println("Max: " + newList.getMaximum());
        System.out.println("Median: " + newList.getMedian());
    }
}
