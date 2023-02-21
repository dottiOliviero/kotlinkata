fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
}


fun compute(input: String):String {
    return computePrivate(input)
/*input.map { computePrivate(it.toString()) }.reduce {a,b -> a+b}*/
}

private fun computePrivate(input: String):String{
    val i = input.toInt()
    return when {
        i%3 == 0 -> {
            "Foo"
        }
        i%5 == 0 -> {
            "Bar"
        }
        else -> {
            input
        }
    }
}