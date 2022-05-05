package davethomascodekata.karatechop;

import java.util.Arrays;

public class KarateChop {

    public int chop(int item,int[] data ) {
        Arrays.sort(data);
        int start = 0;
        int end = data.length-1;
        int mid = Integer.valueOf((end - start)/2);
        while (start != end) {
            if(item == data[mid]) {
                return  mid;
            }
            if (item<=data[mid]) {
                end = mid;
            }
            if (item>= data[mid]) {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        KarateChop chop = new KarateChop();
        chop.chop(1,new int[] {1,2,5,3,6,9,7});

    }
}
