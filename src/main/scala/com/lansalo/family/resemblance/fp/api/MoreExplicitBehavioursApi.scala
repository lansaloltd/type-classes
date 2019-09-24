package com.lansalo.family.resemblance.fp.api

import com.lansalo.family.resemblance.fp.behavior.{Fly, Swim}

object MoreExplicitBehavioursApi {

  def flyOps[A](a: A)(instance: Fly[A]): Unit = instance.fly(a)

  def swimOps[A](a: A)(instance: Swim[A]): Unit = instance.swim(a)

}
