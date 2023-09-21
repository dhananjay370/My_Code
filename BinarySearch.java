public class BinarySearch {
    public static int binarysearch(int arr[], int size, int key) {
        int start = 0;
        int end = size - 1;
        int mid = start + (end - start) / 2;
        while (start <= end) {
            if (arr[mid] == key) {
                return mid;
            }
            if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            mid = start + (end - start) / 2;
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int index = binarysearch(arr, arr.length, 2);
        System.out.println(index);
    }
}