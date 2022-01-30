package patternTypes

fun main(args: Array<String>) {

    /*
    5 5 5 5 5
    4 4 4 4
    3 3 3
    2 2
    1
     */

    var number=5

    for( i in 5 downTo 1){
        for (j in 1..i){
            print(" $number ")
        }
        --number
        println()
    }

}