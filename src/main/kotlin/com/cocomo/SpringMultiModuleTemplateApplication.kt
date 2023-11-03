package com.cocomo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringMultiModuleTemplateApplication

fun main(args: Array<String>) {
    runApplication<SpringMultiModuleTemplateApplication>(*args)
}
