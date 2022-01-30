package patternTypes

fun main() {

    /*
 1  2  3  4  5
 1  2  3  4
 1  2  3
 1  2
 1
    */


    var row=5
    var temp=0

    for(i in 1..row) {
        temp = 1
        for (j in row downTo i) {
            print(" $temp ")
            ++temp
        }
        println()
    }
}