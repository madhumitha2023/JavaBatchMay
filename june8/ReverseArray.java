package june8;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        System.out.println("Printing array in Reverse order: ");
        for(int i=arr.length-1; i>=0;i--)
        {
            System.out.println(arr[i]);
        }
        int size = arr.length;
        System.out.println("Reversed Array is: ");
        for(int i=0; i<size/2;i++)
        {
            int temp;
            temp=arr[i];
            arr[i]=arr[size-1-i];
            arr[size-1-i]=temp;
        }
        for(int element : arr)
        {
            System.out.println(element);
        }
    }
}
