fun main() {
    // 標準入力の受け取り
    val inputs = readLine()!!.map { it.toString().toInt() }.toMutableList()

    // 初期値
    val result = mutableListOf<Int>()

    // 入力がなくなるまで繰り返す
    while (inputs.isNotEmpty()) {
        var minValue: Int? = null

        // 最小値を取得し、リストの末尾に追加する
        if (result.size == 0) {
            minValue = inputs.filter { it != 0 }.min()
        } else {
            minValue = inputs.min()
        }

        // 削除するために最小値のインデックスを控えておく
        val minIndex = inputs.indexOf(minValue)

        result.add(minValue)

        // 追加済みの最小値を削除する
        inputs.removeAt(minIndex)
    }

    // 結果を結合して出力
    println(result.joinToString(""))
}