package davethomascodekata.karatechop;

import java.util.Arrays;

public class KarateChop1 {

    //recursive approach
    public int chop(int item,int[] data ) {
        if (data.length==0) {
            return -1;
        }

        Arrays.sort(data);
        int start = 0;
        int end = data.length-1;

        return search(start,end,item,data);

    }

    public int search(int start,int end,int item,int [] data) {
        int mid = Integer.valueOf((end + start)/2);
        if (start>end) {
            return -1;
        }
        if(item == data[mid]) {
            return  mid;
        }
        if (item<=data[mid]) {
            end = mid-1;
        }
        if (item>= data[mid]) {
            start = mid+1;
        }

        return  search(start,end,item,data);
    }
}
