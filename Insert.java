// to insert element at particular position in array
public class Insert 
{
    public static void main(String[] args) 
    {
        int [] arr={0,1,2,3,4};
        // 5 6     2 4 
        for(int i=1; i<arr.length; i++)
        {
            arr[i] = arr[i-1];
        }
        arr[1] = 5; 
        arr[3] = 6;

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }
}

