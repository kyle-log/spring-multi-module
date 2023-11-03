package com.cocomo.batch

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppBatchApplication

fun main(args: Array<String>) {
    runApplication<AppBatchApplication>(*args)
}
