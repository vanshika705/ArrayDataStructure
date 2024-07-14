// rearranging array elements by sign
public class Rearrange 
{
    public static void main(String[] args) 
    {
        int arr[]= {3,1,-4,2,-2,-3};
        int temp;
        int i;
        for( i=1; i<arr.length; i++)
        {
            if(arr[i] < 0 && arr[i-1]<0){
                temp =arr[i];
                arr[i] = arr[i-1];
                arr[i - 1] = temp;
            }
            
        }
        for( i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
