package theotherbrianj

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test

class BottlesTest {
  private val unit = Bottles()

  @Test
  fun it_is_initializable() {
    assertThat(unit).isInstanceOf(Bottles::class.java)
  }

  @Test
  fun first_verse() {
    val expected = """
      99 bottles of beer on the wall, 99 bottles of beer.
      Take one down and pass it around, 98 bottles of beer on the wall

    """.trimIndent()
    assertThat(unit.verse(99)).isEqualTo(expected)
  }

  @Test
  fun another_verse() {
    val expected = """
      3 bottles of beer on the wall, 3 bottles of beer.
      Take one down and pass it around, 2 bottles of beer on the wall

    """.trimIndent()
    assertThat(unit.verse(3)).isEqualTo(expected)
  }

  @Test
  fun verse_2() {
    val expected = """
      2 bottles of beer on the wall, 2 bottles of beer.
      Take one down and pass it around, 1 bottle of beer on the wall

    """.trimIndent()
    assertThat(unit.verse(2)).isEqualTo(expected)
  }

  @Test
  fun verse_1() {
    val expected = """
      1 bottle of beer on the wall, 1 bottle of beer.
      Take it down and pass it around, no more bottles of beer on the wall

    """.trimIndent()
    assertThat(unit.verse(1)).isEqualTo(expected)
  }

  @Test
  fun verse_0() {
    val expected = """
      No more bottles of beer on the wall, no more bottles of beer.
      Go to the store and buy some more, 99 bottles of beer on the wall

    """.trimIndent()
    assertThat(unit.verse(0)).isEqualTo(expected)
  }
}
