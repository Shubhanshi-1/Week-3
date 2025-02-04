package BinarySearch.FirstAndLastOccurence;

public class FirstAndLastOccurrences {

    //Method to find First occurrence of a target
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;  // Continue searching on the left side for the first occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    //Method to find last occurrence of a target
    public static int findLastOccurrences(int array[],int target){
        int first=0;
        int last=0;
        int result=-1;
     int left=0;
     int right =array.length-1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                result = mid;
                left = mid + 1;  // Continue searching on the right side for the last occurrence
            } else if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
    }



