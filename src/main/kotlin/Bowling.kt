class Bowling {

    private val throws = mutableListOf<Int>()

    fun addThrow(score: Int) {
        require(score in 0..10) { "Scores must be in the range 0..10" }
        throws.add(score)
    }

    val runningScore: Int
        get() = throws.sum()
}