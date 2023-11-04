package com.cocomo.worker

import com.cocomo.batch.service.order.OrderConfiguration
import com.cocomo.batch.service.pay.PayConfiguration
import com.cocomo.batch.service.platform.PlatformConfiguration
import org.springframework.boot.Banner
import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import kotlin.system.exitProcess

@SpringBootApplication
class AppWorkerApplication

fun main(args: Array<String>) {
    try {
        SpringApplicationBuilder()
            .sources(ParentConfiguration::class.java).run {
                web(WebApplicationType.NONE)
                bannerMode(Banner.Mode.OFF)
            }
            .child(PlatformConfiguration::class.java).run {
                web(WebApplicationType.NONE)
                bannerMode(Banner.Mode.OFF)
            }
            .sibling(OrderConfiguration::class.java).run {
                web(WebApplicationType.NONE)
                bannerMode(Banner.Mode.OFF)
            }
            .sibling(PayConfiguration::class.java).run {
                web(WebApplicationType.NONE)
                bannerMode(Banner.Mode.OFF)
            }
            .sibling(AppWorkerApplication::class.java).run {
                web(WebApplicationType.SERVLET)
                bannerMode(Banner.Mode.OFF)
            }
            .run(*args)
    } catch (e: Exception) {
        exitProcess(-1)
    }
}

