package com.lansalo.family.resemblance.fp

import com.lansalo.family.resemblance.fp.behavior.{Fly, Swim}
import com.lansalo.family.resemblance.fp.model.{Parrot, Penguin}

object ExplicitInstances {

  object parrotBehaviour extends Fly[Parrot] {
    override def fly(parrot: Parrot): Unit = {
      println(s"I'm a parrot and I can fly. My name is ${parrot.name}")
    }
  }

  val penguinBehaviour: Swim[Penguin] = (penguin: Penguin) => {
    println(s"I'm a penguin and I can swim. My name is ${penguin.name}")
  }

}
