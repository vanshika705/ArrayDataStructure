// to print 2d array elements in column order 
public class ColumnOrder 
{
    public static void main(String[] args) 
    {
        int[][]arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
            {
                System.out.println(arr[j][i]);
            }
        }
    }
}

