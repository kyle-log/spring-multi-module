package com.cocomo.context.circuitbreaker

interface CircuitBreaker {
    fun <T> run(name: String, block: () -> T): Result<T>
}