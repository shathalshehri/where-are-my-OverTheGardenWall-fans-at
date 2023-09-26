package udemy.kotlindev.myquizapp

import java.util.ArrayList

object Constants {
    // TODO  Create a constant variables which we required in the result screen
    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
val questionList= ArrayList<Question>()

 //1
        val que1 = Question(
1,"What is the bluebird's name?",
            R.drawable.bb,
            "Bellatrix", "Bellatrice",
            "Beatrice", "Beatrix",
            3

        )
        questionList.add(que1)
//2
        val que2 = Question(
            2,"What is the Woodsman harvesting from the trees?",
            R.drawable.woodsman,
            "Twigs", "Oil",
            "Sap", "Syrup",
            2

        )
        questionList.add(que2)
//3
        val que3 = Question(
            3,"How do Edelwood trees grow in the unknown ?",
            R.drawable.edelwood,
            "From the souls of lost travelers ", "The woodsman plants seeds",
            "The Beast uses the oil to grow them", "From candy",
            1

        )
        questionList.add(que3)
//4
        val que4 = Question(
            4,"How did Wirt and Greg get to the Unknown?",
            R.drawable.ic_greg_wirt,
            "After getting lost in the woods", "After rolling down a hill into a river",
            "Chanting around a gravestone on Halloween", "On a ferryboat filled with frogs",
            2

        )
        questionList.add(que4)
//5
        val que5 = Question(
            5,"In the Dark Lantern tavern, what does the old man mistake Wirt for before bursting into song?",
            R.drawable.five,
            "The Tailor", "The Highway Man",
            "The Young Lover", "The Patissier",
            3

        )
        questionList.add(que5)
 //6
        val que6 = Question(
            6,
            "Adelaide of the Forest, the Good Woman of the Wood is actually:"
            , R.drawable.adelaide,
            "Beatrice's mother", "A witch who hates her windows open",
            "A turtle", "The Beast",
            2

        )
        questionList.add(que6)
 //7
        val que7 = Question(
            7,"Who created the miniseries for Cartoon Network?",
            R.drawable.cn,
            "Pendelton Ward", "Alex Hirsch",
            "Daniel Chong", "Patrick McHale",
            4


            )
        questionList.add(que7)
 //8
        val que8 = Question(
            8,"Auntie Whispers does what to little children who wander into her house",
            R.drawable.antie_whispers,
            "Eats them","Kicks them out",
            "Enslaves them", "Turns them into Edelwood trees",
            2


            )
        questionList.add(que8)
//9
        val que9 = Question(
            9,
          "What is The Beast's body made of?",
            R.drawable.beast,
            "His victim's faces", "Edelwood",
            "Oil","Straw",
            1


            )
        questionList.add(que9)
//10
        val que10 = Question(
            10,"The whole story takes place in:",
            R.drawable.question_ten,
            "A dream", "Haloween",
            "A forest", "The Unknown",
            1


            )
        questionList.add(que10)

        return questionList

    }

}