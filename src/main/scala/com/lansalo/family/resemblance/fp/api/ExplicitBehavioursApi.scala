package com.lansalo.family.resemblance.fp.api

import com.lansalo.family.resemblance.fp.behavior.{Fly, Swim, Talk}

object ExplicitBehavioursApi {

  def flyOps[A](a: A)(implicit instance: Fly[A]): Unit = instance.fly(a)

  def talkOps[A](a: A)(implicit instance: Talk[A]): Unit = instance.talk(a)

  def swimOps[A](a: A)(implicit instance: Swim[A]): Unit = instance.swim(a)

}
