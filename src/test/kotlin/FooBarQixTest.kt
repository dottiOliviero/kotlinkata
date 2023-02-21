import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class FooBarQixTest {
    @Test
    fun `compute return Foo if given 3`() {
        val result = compute("3")
        result shouldBe "Foo"
    }

    @Test
    fun `compute return Foo if given input is divisible by 3`() {
        val result = compute("33")
        result shouldBe "Foo"
    }

    @Test
    fun `compute return input if given input is not divisible by 3 nor 5`() {
        val result = compute("11")
        result shouldBe "11"
    }

    @Test
    fun `compute return Bar if given input is divisible only by 5`() {
        val result = compute("20")
        result shouldBe "Bar"
    }

    @Test
    fun `compute return FooBar if given input is divisible by 3 and 5`() {
        val result = compute("15")
        result shouldBe "FooBar"
    }

}