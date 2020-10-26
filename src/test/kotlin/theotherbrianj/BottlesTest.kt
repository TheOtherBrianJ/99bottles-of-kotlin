package theotherbrianj

import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.*

class BottlesTest {
  @Test
  fun it_is_initializable() {
    assertThat(Bottles()).isInstanceOf(Bottles::class.java)
  }
}
