public class MaxMin 
{
    public static void main(String[] args)
    {
        int []arr = {34,78,21,97,42,0,45,2};
        int max = arr[0];
        int min = arr[0];
        
        // to fine maximun element 
        for(int i=1; i<arr.length; i++)
        {
            if (max < arr[i])
            {
                max = arr[i];
            }
        }
        System.out.println("Maximum element in array is: "+max);

        // to fine minimun element  
        for(int i=1; i<arr.length; i++)
        {
            if (min > arr[i])
            {
                min = arr[i];
            }
        }
        System.out.println("Maximum element in array is: "+min);
    }
}
