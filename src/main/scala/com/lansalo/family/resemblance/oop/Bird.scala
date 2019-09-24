package com.lansalo.family.resemblance.oop

sealed trait Bird {
  def fly: Unit
}

class Parrot(name: String) extends Bird {
  override def fly: Unit = println(s"I'm a parrot and I can fly. My name is $name")
}

class Penguin(name: String) extends Bird {
  override def fly: Unit = ??? // throw new UnsupportedOperationException("Sorry, can't fly")
}
