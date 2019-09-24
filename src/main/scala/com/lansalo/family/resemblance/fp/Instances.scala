package com.lansalo.family.resemblance.fp

import com.lansalo.family.resemblance.fp.behavior.{Fly, Swim, Talk}
import com.lansalo.family.resemblance.fp.model.{Kakapo, Parrot, Penguin}

object Instances {

  implicit val parrotFly: Fly[Parrot] = new Fly[Parrot] {
    def fly(parrot: Parrot): Unit = {
      println(s"I'm a parrot and I can fly. My name is ${parrot.name}")
    }
  }

  implicit val parrotTalk: Talk[Parrot] = new Talk[Parrot] {
    def talk(parrot: Parrot): Unit = {
      println(s"I'm a parrot and I can talk. My name is ${parrot.name}")
    }
  }

  implicit val kakapoTalk: Talk[Kakapo] = new Talk[Kakapo] {
    def talk(kakapo: Kakapo): Unit = {
      println(s"I'm a kakapo and I can talk. My name is ${kakapo.name}")
    }
  }

  implicit val penguinSwim: Swim[Penguin] = new Swim[Penguin] {
    def swim(penguin: Penguin): Unit = {
      println(s"I'm a penguin and I can swim. My name is ${penguin.name}")
    }
  }

}
