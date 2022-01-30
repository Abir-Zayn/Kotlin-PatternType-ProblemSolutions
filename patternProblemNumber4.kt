package patternTypes

fun main() {
    /*
 5  6  7  8  9
 4  5  6  7
 3  4  5
 2  3
 1
     */

    var row=5
    var temp1=0
    var temp2=0

    for (i in row downTo 1){
        temp1=i
        temp2=i
        for(j in 1..i){
            print(" $temp2 ")
            ++temp2
        }
        --temp1
        println()
    }

}