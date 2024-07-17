// to insert element at particular position in array
// import java.util.Arrays;

// public class Insert {

//     public static void main(String[] args) {
//         int[] arr = {0, 1, 2, 3, 4};
//         int[] elements = {5, 6};
//         int[] positions = {2, 4};

//         // Adjust positions to 0-based
//         for (int i = 0; i < positions.length; i++) {
//             positions[i]--;  // Convert 1-based index to 0-based
//         }

//         // Insert elements into arr at specified positions
//         for (int i = 0; i < elements.length; i++) {
//             int element = elements[i];
//             int position = positions[i];

//             // Shift elements to the right to make space
//             System.arraycopy(arr, position, arr, position + 1, arr.length - position - 1);

//             // Insert element at the specified position
//             arr[position] = element;
//         }

//         // Print the resulting array
//         System.out.println("Modified Array: " + Arrays.toString(arr));
//     }
// }


