public class BinarySearch {

    public static final int NOT_FOUND = -1;

    public static void main(String... args) {

    }

    public static int binarySearch(int[] nums, int num) {
        return binarySearch(nums, 0, nums.length - 1, num);
    }

    public static int binarySearch(int[] nums, int startIndex, int endIndex, int num) {
        if (startIndex > endIndex)
            return NOT_FOUND;
        int middle = (startIndex + endIndex) / 2;
        if (nums[middle] == num)
            return middle;
        if (nums[startIndex] == num)
            return startIndex;
        if (nums[endIndex] == num)
            return endIndex;
        if (nums[middle] > num)
            return binarySearch(nums, startIndex, middle - 1, num);
        return binarySearch(nums, middle + 1, endIndex, num);
    }
}
