package patternTypes

fun main() {
    var numerical=1

    /*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5

     */

    for( i in 1..5){
        for(j in 1..i){
            print(" $numerical ")
        }
        ++numerical
        println()
    }






}