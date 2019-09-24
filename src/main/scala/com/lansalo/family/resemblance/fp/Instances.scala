package com.lansalo.family.resemblance.fp

import com.lansalo.family.resemblance.fp.behavior.{Fly, Swim}
import com.lansalo.family.resemblance.fp.model.{Parrot, Penguin}

object Instances {

  implicit val parrotFly: Fly[Parrot] = new Fly[Parrot] {
    def fly(parrot: Parrot): Unit = {
      println(s"I'm a parrot and I can fly. My name is ${parrot.name}")
    }
  }

  implicit val penguinSwim: Swim[Penguin] = new Swim[Penguin] {
    def swim(penguin: Penguin): Unit = {
      println(s"I'm a penguin and I can swim. My name is ${penguin.name}")
    }
  }

}
