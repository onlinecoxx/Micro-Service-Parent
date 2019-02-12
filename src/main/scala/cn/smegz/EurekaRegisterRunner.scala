package cn.smegz

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

object EurekaRegisterRunner extends App {
  SpringApplication.run(classOf[EurekaRegisterRunner])
}

@EnableEurekaServer
@SpringBootApplication
class EurekaRegisterRunner
