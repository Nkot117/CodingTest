import java.lang.Math

const val MAX_DICE_VALUE = 6.0

fun main() {
    val input = readLine()!!.toDouble()
    val retult = Math.ceil(input / MAX_DICE_VALUE).toInt()
    println(retult)
}