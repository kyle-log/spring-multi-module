package com.cocomo.common

@JvmInline
value class Uuid(val value: String = java.util.UUID.randomUUID().toString())
