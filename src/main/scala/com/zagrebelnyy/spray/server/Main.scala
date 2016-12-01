package com.zagrebelnyy.spray.server


import akka.actor.ActorSystem
import spray.routing.SimpleRoutingApp





object Main extends App with SimpleRoutingApp{
  implicit val actorSystem = ActorSystem()

  startServer(interface = "Localhost",port = 8080){
    get{
      path("hello"){
        complete{
          "Welcom to my main)))))))))))))))))"
        }
      }
    }
  }


}
