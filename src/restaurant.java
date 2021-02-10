import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class restaurant {
    public static void main(String[] args){
        Double sum = 0.0;
        Hashtable<Double, Integer> count = new Hashtable<>();
        ArrayList<Double> arrayList = new ArrayList<>(Arrays.asList(1.2,2.2,2.1,2.2,3.1,4.5,5.5,1.1));
        for(int i=0;i<arrayList.size();i++){
            sum+= arrayList.get(i);
            if(count.containsKey(arrayList.get(i))){
                System.out.print(count);
            }else {
                count.put(arrayList.get(i), 1);
            }
        }
        System.out.print("Average ratings = "+ sum/ arrayList.size());
        System.out.print(count);


    }
}
