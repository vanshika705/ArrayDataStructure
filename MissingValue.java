// finding missing number from a given range
public class MissingValue 
{
    public static void main(String[] args) 
    {
        int []arr = {5,2,0,1,3};
        int i;
        int miss=0;

        for(i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                if( i != arr[j])
                {
                    miss=i;
                }   
            }   
        }
        System.out.println("Missing value is : "+ miss);
    }
    
}
