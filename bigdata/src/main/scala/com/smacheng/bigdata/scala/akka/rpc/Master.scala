package com.smacheng.bigdata.scala.akka.rpc

import akka.actor.{ Actor, ActorSystem, Props }
import com.typesafe.config.ConfigFactory

/**
 * Created by smacheng on 2017-06-29.
 */
class Master extends Actor {

  println("constructor invoked")

  override def preStart(): Unit = {
    println("preStart invoked")
  }

  override def receive: Receive = {
    case "connect" => {
      println("a client connected")
      sender ! "reply"
    }

    case "hello" => {
      println("hello")
    }
  }
}

object Master {
  def main(args: Array[String]): Unit = {

    val host = args(0)
    val port = args(1).toInt

    val configStr =
      s"""
        |akka.actor.provider = "akka.remote.RemoteActorRefProvider"
        |akka.remote.netty.tcp.hostname = "$host"
        |akka.remote.netty.tcp.port = "$port"
        """.stripMargin
    val config = ConfigFactory.parseString(configStr)
    val actorSystem = ActorSystem("MasterSystem", config)

    val master = actorSystem.actorOf(Props[Master], "Master")

    master ! "hello"

    actorSystem.awaitTermination()

  }
}
