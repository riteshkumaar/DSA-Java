// Sort the arrays of 0s and 1s
import java.util.Arrays;
public class prob1 {
    public static void main(String[] args) {
        int[] arr = { 0 ,1 , 1, 0, 1 , 0, 0, 1};
        sortIt(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortIt(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(i<=j)
        {
            if(arr[i]==0)
                i++;
            else if(arr[j]==1)
                j--;
            else if(arr[i]==1 && arr[j]==0)
            {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
    }
}
