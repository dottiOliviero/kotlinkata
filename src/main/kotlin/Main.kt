fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}


fun compute(input: String):String {
    var divisibilityString = computeStringWithDivisibility(input)
    val occurrenceString = input.map { mapCharToString(it.toString()) }.reduce { a, b -> a+b}
    if (divisibilityString == input) {
         if(occurrenceString.isEmpty()) {
             return input
         }
        return occurrenceString
    }
    return divisibilityString + occurrenceString
}


private fun mapCharToString(input : String) : String {
    return when (input) {
        "3" -> "Foo"
        "5" -> "Bar"
        "7" -> "Qix"
        else -> ""
    }
}

private fun isDivisibleBy(number: Int, divisor: Int) = number % divisor == 0

private fun computeStringWithDivisibility(input: String):String{
    val i = input.toInt()
    var result = ""
    if (isDivisibleBy(i, 3)) {
        result += "Foo"
    }
    if (isDivisibleBy(i, 5)) {
        result += "Bar"
    }
    if (isDivisibleBy(i, 7)) {
        result += "Qix"
    }
    if (!isDivisibleBy(i, 3) && !isDivisibleBy(i, 5) && !isDivisibleBy(i, 7)) {
        return input
    }
    return result
}