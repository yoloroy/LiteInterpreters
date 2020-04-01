package LiteInterpreters

interface Interpreter {
    fun run()

    fun runDebug(): Iterable<DebugInfo>

    fun output(message: String)
}
