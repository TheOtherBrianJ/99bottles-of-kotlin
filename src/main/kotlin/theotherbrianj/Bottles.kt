package theotherbrianj

class Bottles {
  fun verse(num: Int) = """
      ${quantity(num).capitalize()} ${container(num)} of beer on the wall, ${quantity(num)} ${container(num)} of beer.
      ${action(num)}, ${quantity(successor(num))} ${container(successor(num))} of beer on the wall

    """.trimIndent()

  fun successor(num: Int) = if (num == 0) 99 else num - 1

  fun action(num: Int) =
    if (num == 0) "Go to the store and buy some more" else "Take ${pronoun(num)} down and pass it around"

  fun quantity(num: Int) = if (num == 0) "no more" else "$num"

  fun pronoun(num: Int) = if (num == 1) "it" else "one"

  fun container(num: Int) = if (num == 1) "bottle" else "bottles"

  fun verses(starting: Int, ending: Int) = starting.downTo(ending).joinToString("\n") { verse(it) }

  fun song() = verses(99, 0)
}
