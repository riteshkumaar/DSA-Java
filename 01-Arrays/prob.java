// Find next permutations of array : LeetCode 31
import java.util.Arrays;
public class prob5 {
    public static void main(String[] args) {
        int[] arr = { 1,3,5, 1};
        Permutations(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Permutations(int[] arr)
    {
        int pi = -1;
        int n = arr.length;
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                pi = i;
                break;
            }
        }
        int i = 0;
        int j = n - 1;
        if(pi==-1)
            while(i<j)
        {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        i = pi+1;
        j = n-1;
        while(i<j)
        {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        int k = -1 ;
        for(int ii=pi+1;ii<n;ii++)
        {
            if(arr[ii]>arr[pi])
            {
                k = ii;
                break;
            }
        }
        int t = arr[pi];
        arr[pi]= arr[k];
        arr[k] = t;
    }
}
