fun titleToNumber(columnTitle: String): Int {
    var result = 0

    for (ch in columnTitle) {
        // shift previous letters one place left (base 26), add this letter's value A=1..Z=26
        result = result * 26 + (ch - 'A' + 1)
    }
    return result
}

fun main() {
    println(titleToNumber("A"))   // 1
    println(titleToNumber("AB"))  // 28
    println(titleToNumber("ZY"))  // 701
}
