import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import BinarySearch.NOT_FOUND

@RunWith(JUnit4::class)
class BinarySearchTest {
    @Test
    fun binarySearchTest() {
        val firstArr = intArrayOf(20, 30, 60, 100, 120)
        assert(binarySearch(firstArr, -1) == NOT_FOUND)
        assert(binarySearch(firstArr, 20) == 0)
        assert(binarySearch(firstArr, 30) == 1)
        assert(binarySearch(firstArr, 60) == 2)
        assert(binarySearch(firstArr, 100) == 3)
        assert(binarySearch(firstArr, 120) == 4)
        assert(binarySearch(firstArr, 35) == NOT_FOUND)
        assert(binarySearch(firstArr, 101) == NOT_FOUND)
        assert(binarySearch(firstArr, 1250) == NOT_FOUND)
    }
}