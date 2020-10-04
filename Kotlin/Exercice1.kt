





fun main() {

    lateinit var answer: String
    val question: String = "What is your name ?"
    
    println(question)
    answer = readLine()!!
    
    println("Your name is $answer")
}
