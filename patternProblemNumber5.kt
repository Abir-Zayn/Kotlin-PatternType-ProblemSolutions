package patternTypes

fun main() {

/* Question:
 1
 1  2
 1  2  3
 1  2  3  4
 1  2  3  4  5

 */

    println("Enter the Number: ")
    var x= readLine()!!.toInt()

    println("For the number $x the pattern will be")

    for(i in 1..x){
        for( j in 1..i){
            print(" $j ")
        }
        println( )
    }

}