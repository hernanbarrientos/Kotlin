import java.io.File

fun main() {
    var count = 0
    val lineList = mutableListOf<String>()

    File("C:/Users/hernan.e.barrientos/Desktop/Curso_Kotlin_Accenture/Puzzle/Puzzle_01.txt").useLines { lines -> lines.forEach { lineList.add(it) }}
    for (x in 1..lineList.size-1){
        println(lineList.get(x))
        if(lineList.get(x) > lineList.get(x - 1)) {
            count++
        }
    }
    println(count)
}