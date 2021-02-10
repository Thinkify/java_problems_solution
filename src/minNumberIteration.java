import java.util.*;

public class minNumberIteration {

    public static Integer[] removezeroes(Integer[] a){
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
        list.removeAll(Arrays.asList(Integer.valueOf(0)));
        a = list.toArray(new Integer[list.size()]);
        return a;
    }

    public static void main(String[] args){
        HashMap<Integer, Integer> count= new HashMap<>();
        Integer array[] = {1,3,2,6,8,2,3,4,5,1};
        Integer temp[] = new Integer[array.length];
        int minNumber = Collections.min(Arrays.asList(array));

        for(int i=0;i<array.length;i++){
            if(count.containsKey(array[i])){
                count.put(count.get(array[i]),count.get(array[i])+1);
            }else
                count.put(array[i],1);
        }
        System.out.println(count);
        while(array.length>0) {
            for (int i = 0;i < array.length; i++) {
                if(array[i]-minNumber>=0){
                    array[i] -= minNumber;
                }
                array = removezeroes(array);
            }
            System.out.println(Arrays.toString(array));
        }
    }


}
