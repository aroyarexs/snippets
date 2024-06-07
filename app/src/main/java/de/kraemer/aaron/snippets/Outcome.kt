package de.kraemer.aaron.snippets

/**
 * A generic representation of states primary used as a result capsule.
 */
sealed class Outcome<out T, out S> {
    /**
     * Usually represents the initial state. Nothing has been triggered yet.
     */
    data object Idle : Outcome<Nothing, Nothing>()
    data object Loading : Outcome<Nothing, Nothing>()
    class Positive<T>(val data: T) : Outcome<T, Nothing>()
    class Negative<S>(val data: S) : Outcome<Nothing, S>()
}