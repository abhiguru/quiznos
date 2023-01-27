package `in`.tutorial.quiznos

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_Q : String = "total_questions"
    const val CORRECT_ANS : String = "correct_ans"
    fun getQuestions():ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong too ?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Russia",
            "China",
            "Pakistan",
            1
        )
        questionsList.add(que1)
        val que2 = Question(
            2,
            "What country does this flag belong too ?",
            R.drawable.ic_flag_of_australia,
            "Australia",
            "Russia",
            "China",
            "Pakistan",
            1
        )
        questionsList.add(que2)
        val que3 = Question(
            3,
            "What country does this flag belong too ?",
            R.drawable.ic_flag_of_belgium,
            "Belgium",
            "Russia",
            "China",
            "Pakistan",
            1
        )
        questionsList.add(que3)
        val que4 = Question(
            4,
            "What country does this flag belong too ?",
            R.drawable.ic_flag_of_brazil,
            "Brazil",
            "Russia",
            "China",
            "Pakistan",
            1
        )
        questionsList.add(que4)
        val que5 = Question(
            5,
            "What country does this flag belong too ?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "Russia",
            "China",
            "Pakistan",
            1
        )
        questionsList.add(que5)
        val que6 = Question(
            6,
            "What country does this flag belong too ?",
            R.drawable.ic_flag_of_fiji,
            "Fiji",
            "Russia",
            "China",
            "Pakistan",
            1
        )
        questionsList.add(que6)
        val que7 = Question(
            7,
            "What country does this flag belong too ?",
            R.drawable.ic_flag_of_germany,
            "Germany",
            "Russia",
            "China",
            "Pakistan",
            1
        )
        questionsList.add(que7)
        val que8 = Question(
            8,
            "What country does this flag belong too ?",
            R.drawable.ic_flag_of_india,
            "India",
            "Russia",
            "China",
            "Pakistan",
            1
        )
        questionsList.add(que8)
        val que9 = Question(
            9,
            "What country does this flag belong too ?",
            R.drawable.ic_flag_of_kuwait,
            "kuwait",
            "Russia",
            "China",
            "Pakistan",
            1
        )
        questionsList.add(que9  )
        return questionsList
    }
}