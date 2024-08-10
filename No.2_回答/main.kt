fun main() {
    // 標準入力の受け取り
    val inputs = readLine()!!.map { it }

    // 初期値
    var result = mutableListOf<Char>('B', 'W')
    var turn: Char? = null

    // 標準入力された値分ループ
    for (input in inputs) {
        // ターンの切り替え
        turn = if (turn == null || turn == 'W') {
            'B'
        } else {
            'W'
        }

        // 値を追加
        if (input == 'L') {
            result.add(0, turn)
        } else {
            result.add(turn)
        }

        // 間にある要素の置き換え
        val firstIndex = result.indexOf(turn)
        val lastIndex = result.lastIndexOf(turn)

        result.forEachIndexed { index, _ ->
            // 間のindexの要素をその時のターンの値に置き換え
            if (index in firstIndex..lastIndex) {
                result[index] = turn
            }
        }
    }

    // 結果のカウント・出力
    val countMap = result.groupingBy { it }.eachCount()
    println("${countMap['B'] ?: 0} ${countMap['W'] ?: 0}")
}