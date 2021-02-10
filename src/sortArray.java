import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sortArray {
    public static void main(String[] args){
       Double list[] = {3.1,1.2,3.3,4.2,5.0,3.1,4.4};
        int i,j;
        double key;
        for (i = 1; i < list.length; i++)
        {
            key = list[i];
            j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];

                j = j - 1;
            }
            list[j + 1] = key;
        }
        Double first = list[0];
        for(int l = 0; l < list.length-1; l++){
                list[l] = list[l+1];
            }
        list[list.length-1] = first;

        for(int m=0;m<list.length;m++)
        System.out.print(list[m]+"\t");

    }





}
