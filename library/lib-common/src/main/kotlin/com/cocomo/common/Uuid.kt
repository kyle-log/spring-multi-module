package com.cocomo.common

@JvmInline
value class Uuid(val value: String) {

    companion object {
        fun generate(): Uuid {
            return Uuid(java.util.UUID.randomUUID().toString())
        }
    }
}