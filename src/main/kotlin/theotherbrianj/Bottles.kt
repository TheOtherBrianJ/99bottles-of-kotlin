package theotherbrianj

class Bottles {
  fun verse(num: Int) = when (num) {
    0 -> """
      No more bottles of beer on the wall, no more bottles of beer.
      Go to the store and buy some more, 99 bottles of beer on the wall

    """.trimIndent()
    1 -> """
      1 bottle of beer on the wall, 1 bottle of beer.
      Take it down and pass it around, no more bottles of beer on the wall

    """.trimIndent()
    2 -> """
      $num bottles of beer on the wall, $num bottles of beer.
      Take one down and pass it around, ${num - 1} bottle of beer on the wall

    """.trimIndent()
    else -> """
      $num bottles of beer on the wall, $num bottles of beer.
      Take one down and pass it around, ${num - 1} bottles of beer on the wall

    """.trimIndent()
  }

  fun verses(starting: Int, ending: Int) = starting.downTo(ending).joinToString("\n") { verse(it) }
}
