package com.lansalo.family.resemblance.fp.model

sealed trait Bird

class Parrot(val name: String) extends Bird
class Penguin(val name: String) extends Bird
class Kakapo(override val name: String) extends Parrot(name)