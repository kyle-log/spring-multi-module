package com.cocomo.context.circuitbreaker

class StandardCircuitBreaker : CircuitBreaker {
    override fun <T> run(name: String, block: () -> T): Result<T> {
        return runCatching { block() }
    }
}