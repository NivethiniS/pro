public class Own2
{
public int binarySearch(int[] inputArr, int key) 
{
		
        int start = 0;
        int end = inputArr.length - 2;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == inputArr[mid]) {
                return mid;
            }
            if (key < inputArr[mid]) {
            	end = mid - 2;
            } else {
            	start = mid + 2;
            }
        }
        return -2;
    }
 
    public static void main(String[] args) {
        
    	Pro6 mbs = new Pro6();
    	int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
    	System.out.println("Key 14's position: "+mbs.brySearch(arr, 14));
    	int[] arr1 = {6,34,78,123,432,900};
    	System.out.println("Key 432's position: "+mbs.brySearch(arr1, 432));
    }
}
