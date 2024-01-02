package inlineclasses

@JvmInline
value class Score(val value: Int) {
    init {
        require(!(value < 0 || value > 100))
    }
}

class Exam {
    fun score(studentName: String, studentScore: Score) {
        // ...
    }

    fun amendScore(studentId: Int, newStudentScore: Score) {
        // ...
    }
}