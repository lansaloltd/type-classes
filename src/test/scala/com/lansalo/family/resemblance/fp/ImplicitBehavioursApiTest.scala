package com.lansalo.family.resemblance.fp

import com.lansalo.family.resemblance.fp.model.{Kakapo, Parrot, Penguin}
import org.scalatest.{FreeSpec, Matchers}

class ImplicitBehavioursApiTest extends FreeSpec with Matchers {

  import BirdsBehavioursTestFixture._
  import com.lansalo.family.resemblance.fp.api.ImplicitBehavioursApi._
  import com.lansalo.family.resemblance.fp.Instances._

  "A Penguin" - {
    "can swim" in {
      penguin.swim
    }
    "but it can't fly" in {
      // penguin.fly -> compilation error
    }
  }

  "A Parrot" - {
    "can fly" in {
      parrot.fly
    }
    "can talk" in {
      parrot.talk
    }
    "but it can't swim" in {
      // parrot.swim -> compilation error
    }
  }

  "A Kakapo" - {
    "is still a parrot" in {
      kakapo.isInstanceOf[Parrot] shouldBe true
    }
    "can talk" in {
      kakapo.talk
    }
    "but unfortunately it can't fly" in {
      // kakapo.fly -> compilation error
    }

  }

}

object BirdsBehavioursTestFixture {
  val parrot = new Parrot("George")
  val penguin = new Penguin("Pingu")
  val kakapo = new Kakapo("Rufus")
}
