import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString {
    public static void main(String[] args) {
    int []arr=new int[]{3,1,5,2,9,0,6};
      ///  System.out.println(Arrays.toString(sort(arr)));

        System.out.println(Arrays.toString(bubblesor(arr)));
        int arr2[]=bubblesor(arr);
        System.out.println(binarySearch(9,arr2));
    }

    public static int[] sort(int[]arr)
    {
        int len=arr.length;
        int mid=len/2;
        if(len<2) return arr;
        int []arr1= Arrays.copyOfRange(arr,0,mid);
        int []arr2=Arrays.copyOfRange(arr,mid,len);
        return merge(sort(arr1),sort(arr2));
    }
    public static int[] merge(int[]arr1, int[] arr2)
    {
        int len=arr1.length+ arr2.length;
        int[] globalArr=new int[len ];
        int a=0,b=0;
        for (int i = 0; i < len; i++) {
            if(a< arr1.length && b<arr2.length)
            {
                if(arr1[a]>arr2[b])
                    globalArr[i]=arr1[a++];
                else
                    globalArr[i]=arr2[b++];
            }
            else {
                if(a< arr1.length) {

                    globalArr[i] = arr1[a++];
                }
                if(b<arr2.length) globalArr[i]=arr2[b++];
            }

        }
        return globalArr;
    }

    public static int[] bubblesor(int[] arr)
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j=i; j < arr.length ; j++) {
                if(arr[i]>arr[j])
                {
                    int temp;
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;


                }

            }
        }
        return arr;

    }
public static int binarySearch(int key, int[]arr)
{
    int low=0;
    int high= arr.length-1;

    while(low<=high)
    {
        int mid=(low+high)/2;
        if(key==arr[mid]) return mid;
        if(key<arr[mid])
        {
            high=mid-1;
        }
        else
        {
            low=mid+1;
        }
    }
    return -1;
}

}