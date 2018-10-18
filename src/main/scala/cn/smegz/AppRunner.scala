package cn.smegz

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

object AppRunner extends App {
  SpringApplication.run(classOf[AppRunner])
}

@EnableEurekaServer
@SpringBootApplication
class AppRunner
