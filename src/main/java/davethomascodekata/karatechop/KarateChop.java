package davethomascodekata.karatechop;

import java.util.Arrays;

public class KarateChop {

    public int chop(int item,int[] data ) {
        if (data.length==0) {
            return -1;
        }

        Arrays.sort(data);
        int start = 0;
        int end = data.length-1;
        int mid = Integer.valueOf((end - start)/2);
        while (start <= end) {

            if(item == data[mid]) {
                return  mid;
            }
            else if (start==end) {
                return -1;
            }
            if (item<=data[mid]) {
                end = mid;
            }
            if (item>= data[mid]) {
                start = mid+1;
            }
            mid = Integer.valueOf((end + start)/2);
        }
        return -1;
    }

    public static void main(String[] args) {
        KarateChop chop = new KarateChop();
        System.out.println(chop.chop(1,new int[] {1,2,5,3,6,9,7}));

    }
}
