package com.lansalo.family.resemblance.fp.api

import com.lansalo.family.resemblance.fp.behavior.{Fly, Swim}

object ExplicitBehavioursApi {

  def flyOps[A](a: A)(implicit instance: Fly[A]): Unit = instance.fly(a)

  def swimOps[A](a: A)(implicit instance: Swim[A]): Unit = instance.swim(a)

}
