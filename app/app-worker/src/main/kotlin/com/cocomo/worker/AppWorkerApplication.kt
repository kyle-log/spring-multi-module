package com.cocomo.worker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AppWorkerApplication

fun main(args: Array<String>) {
    runApplication<AppWorkerApplication>(*args)
}
