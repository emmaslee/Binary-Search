
/**
 * Write a description of class BinarySearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BinarySearch

{
   public static int binarySearch(int[] arr, int key, int start, int end) {
        if (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == key) {
                return mid;
            }

           
            if (arr[mid] < key) {
                return binarySearch(arr, key, mid + 1, end);
            }
            
            else {
                return binarySearch(arr, key, start, mid - 1);
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(sortedArray,4, 1,10));
    }
}
