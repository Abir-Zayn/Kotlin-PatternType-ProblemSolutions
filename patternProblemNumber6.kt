package patternTypes

fun main() {

    /*
        question
         2
         3 4
         4 5 6
         5 6 7 8
         6 7 8 9 10
     */

    var row=5
    var temp=0

    for( i in 1..row){
        temp=i
        for(j in 1..i){
            temp++
            print(" "+temp)
        }

        println()
    }

}