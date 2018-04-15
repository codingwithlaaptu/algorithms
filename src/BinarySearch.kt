//https://www.geeksforgeeks.org/binary-search/
fun main(args: Array<String>) {

}

fun binarySearch(nums: IntArray, num: Int): Int {
    return binarySearch(nums, 0, nums.size - 1, num)
}

fun binarySearch(nums: IntArray, startIndex: Int, endIndex: Int, num: Int): Int {
    if (startIndex > endIndex)
        return BinarySearch.NOT_FOUND
    val middle = (startIndex + endIndex) / 2
    if (nums[middle] == num)
        return middle
    if (nums[startIndex] == num)
        return startIndex
    if (nums[endIndex] == num)
        return endIndex
    if (nums[middle] > num)
        return binarySearch(nums, startIndex, middle - 1, num)
    return binarySearch(nums, middle + 1, endIndex, num)
}