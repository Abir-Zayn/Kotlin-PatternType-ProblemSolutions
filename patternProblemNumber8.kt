package patternTypes

fun main() {

    /*
     1
     2 3
     3 4 5
     4 5 6 7
     5 6 7 8 9
     */

    var row=5
    var temp=0

    for(i in 1..row){
        temp=i
        for (j in 1..i){
            print(" $temp")
            temp++
        }
        println()
    }

}