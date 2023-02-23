import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class FooBarQixTest {
    @Test
    fun `compute return FooFoo if given 3`() {
        val result = compute("3")
        result shouldBe "FooFoo"
    }

    @Test
    fun `compute return FooFooFoo if given input is divisible by 3`() {
        val result = compute("33")
        result shouldBe "FooFooFoo"
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
    fun `compute return Qix if given input is divisible only by 7`() {
        val result = compute("14")
        result shouldBe "Qix"
    }

    @Test
    fun `compute return FooBar if given input is divisible by 3 and 5`() {
        val result = compute("60")
        result shouldBe "FooBar"
    }

    @Test
    fun `compute return FooBarQixBar if given input is divisible by 3, 5 and 7 and contains 5`() {
        val result = compute("105")
        result shouldBe "FooBarQixBar"
    }

    @Test
    fun `compute return FooQix if given input is divisible by 3 and 7`() {
        val result = compute("21")
        result shouldBe "FooQix"
    }

    @Test
    fun `compute return BarQix if given input is divisible by 5 and 7`() {
        val result = compute("140")
        result shouldBe "BarQix"
    }

    @Test
    fun `compute return FooFoo if given input is divisible by 3 and contains 3`() {
        val result = compute("3")
        result shouldBe "FooFoo"
    }

    @ParameterizedTest(name = "compute return {1} if given {0}")
    @MethodSource("computeReturnExpected")
    fun `compute return expected`(input: String, expected: String) {
        compute(input) shouldBe expected
    }

    companion object{
        @JvmStatic
        fun computeReturnExpected() = listOf(
            Arguments.of("1", "1"),
            Arguments.of("2", "2"),
            Arguments.of("3", "FooFoo"),
            Arguments.of("4", "4"),
            Arguments.of("5", "BarBar"),
            Arguments.of("6", "Foo"),
            Arguments.of("7", "QixQix"),
            Arguments.of("8", "8"),
            Arguments.of("9", "Foo"),
            Arguments.of("10", "Bar"),
            Arguments.of("13", "Foo"),
            Arguments.of("15", "FooBarBar"),
            Arguments.of("21", "FooQix"),
            Arguments.of("33", "FooFooFoo"),
            Arguments.of("51", "FooBar"),
            Arguments.of("53", "BarFoo"),
        )
    }

}