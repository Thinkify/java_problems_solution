import java.util.Arrays;
import java.util.LinkedList;

public class linkedListAdditionBuiltIn {
    public static void main(String[] args){
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(9,8,7,6,5,4,3,2,1));
        LinkedList<Integer> list3 = new LinkedList<>();
        for(int i=0;i<list1.size();i++) {
            list3.add(list1.get(i)+list2.get(i));
        }
        System.out.print(list3);
    }
}
