package com.lansalo.family.resemblance.fp

import com.lansalo.family.resemblance.fp.behavior.{Fly, Swim, Talk}
import com.lansalo.family.resemblance.fp.model.{Kakapo, Parrot, Penguin}

object ExplicitInstances {

  val parrotFly: Fly[Parrot] = (parrot: Parrot) => {
    println(s"I'm a parrot and I can fly. My name is ${parrot.name}")
  }

  val parrotTalk: Talk[Parrot] = (parrot: Parrot) => {
    println(s"I'm a parrot and I can talk. My name is ${parrot.name}")
  }

  val kakapoTalk: Talk[Kakapo] = (kakapo: Kakapo) => {
    println(s"I'm a kakapo and I can talk. My name is ${kakapo.name}")
  }

  val penguinBehaviour: Swim[Penguin] = (penguin: Penguin) => {
    println(s"I'm a penguin and I can swim. My name is ${penguin.name}")
  }

}
