import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.Test

class BowlingTests {

    @Test
    fun `can calculate a running score`() {
        val bowling = Bowling()
        bowling.addThrow(2)
        bowling.addThrow(7)
        assertEquals(9, bowling.runningScore)
    }

    @Test
    fun `scores greater than 10 are not allowed`() {
        val bowling = Bowling()
        assertThrows(IllegalArgumentException::class.java) {
            bowling.addThrow(11)
        }
    }

    @Test
    fun `scores less than 0 are not allowed`() {
        val bowling = Bowling()
        assertThrows(IllegalArgumentException::class.java) {
            bowling.addThrow(-1)
        }
    }
}