package com.myob.hello

import cats.effect._

object HelloWorld extends IOApp {

  override def run(args: List[String]): IO[ExitCode] = {
    val sayHi = IO(println(s"Hello from scala"))
    for {
      _ <- sayHi
      _ <- sayHi
      _ <- sayHi
      _ <- sayHi
    } yield ExitCode.Success
  }
}


