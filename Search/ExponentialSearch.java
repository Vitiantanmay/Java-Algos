package Search;

public class ExponentialSearch {
    public static int exponentialSearch(int[] arr, int target) {
        if (arr[0] == target) {
            return 0;
        }
        
        int i = 1;
        while (i < arr.length && arr[i] <= target) {
            i = i * 2;
        }
        
        return binarySearch(arr, target, i / 2, Math.min(i, arr.length - 1));
    }
    
    private static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}