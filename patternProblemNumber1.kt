package patternTypes

fun main() {
    var value=5
    var row=5
    var temp1=0
    var temp2=0

    for(i in 6 downTo 2){
        temp2=i
        temp1=i
        for( j in 2..i){
            print(" $temp2 ")
            ++temp2
            if(temp2==11){
                break
            }
        }
        --temp1
        println()
    }
}