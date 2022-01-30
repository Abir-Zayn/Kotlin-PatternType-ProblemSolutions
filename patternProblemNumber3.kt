package patternTypes

fun main(args: Array<String>) {

    /*
     1 2 3 4 5
       1 2 3 4
         1 2 3
           1 2
             1
     */
    var space=" "

    var num=0
    var row=5

    for(i in 5 downTo 1){
        num=i
        for(j in 1..i){
            print(space)
            print(" $num ")
            num--
        }
        --num
        println()
    }

}