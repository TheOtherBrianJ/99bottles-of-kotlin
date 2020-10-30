package theotherbrianj

class Bottles {
  fun verse(num: Int) =  if (2 == num) """
    $num bottles of beer on the wall, $num bottles of beer.
    Take one down and pass it around, ${num - 1} bottle of beer on the wall

  """.trimIndent()
  else """
    $num bottles of beer on the wall, $num bottles of beer.
    Take one down and pass it around, ${num - 1} bottles of beer on the wall

  """.trimIndent()

}
