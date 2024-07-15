// to insert element at particular position in array



public class Insert 
{
    public static void main(String[] args) // 5 6     2 4 
    {
        int [] arr={0,1,2,3,4};
        int []position ={2,4} ;
        int []element ={5,6};
        int index ;
        
        for(int i=0; i<position.length; i++)
        {
            index = position[i]-1;           
            for( i=arr.length-1; i >index ; i--)
                {
                    arr[i] = arr[i-1];
                }
                arr[index] = element[i];
        }
        
        
        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        
    }
}

