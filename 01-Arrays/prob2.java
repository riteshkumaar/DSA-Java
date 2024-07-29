// Move all -ve numbers to beginning and positive numbers to end with constant space
import java.util.Arrays;
public class prob2 {
    public static void main(String[] args) {
        int[] arr = { -1 ,1 , 3, 7, -9 , 8, -6, 11};
        sortIt(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortIt(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(i<=j)
        {
            if(arr[i]<0)
                i++;
            else if(arr[j]>=0)
                j--;
            else if(arr[i]>=0 && arr[j]<0)
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
