package com.lansalo.family.resemblance.fp.api

import com.lansalo.family.resemblance.fp.behavior.{Fly, Swim, Talk}

object ImplicitBehavioursApi {

  implicit class FlyOps[A](val value: A) extends AnyVal {
    def fly(implicit flyInstance: Fly[A]): Unit = flyInstance.fly(value)
  }

  implicit class TalkOps[A](val value: A) extends AnyVal {
    def talk(implicit talkInstance: Talk[A]): Unit = talkInstance.talk(value)
  }

  implicit class SwimOps[A](val value: A) extends AnyVal {
    def swim(implicit swimInstance: Swim[A]): Unit = swimInstance.swim(value)
  }

}
