package june8;

import java.util.Scanner;

public class ArrayMax {
    public static int maxElement(int[] arr, int len)
    {
        int max = arr[0];
       for(int i=0;i<len;i++)
       {
          if(arr[i] > max)
          {
              max = arr[i];
          }

       }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);

        int len = arr.length;
        for(int i=0; i<len;i++)
        {
            System.out.println("Enter an element to an Array: ");
            arr[i] = scan.nextInt();
        }

      int max = maxElement(arr,len);

        System.out.println("Max element: "+ max);
    }
}
