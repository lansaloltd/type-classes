package com.lansalo.family.resemblance.fp

import com.lansalo.family.resemblance.fp.model.{Kakapo, Parrot, Penguin}
import org.scalatest.{FreeSpec, Matchers}

class ExplicitBehavioursApiTest extends FreeSpec with Matchers {

  import ExplicitBehavioursApiTestFixture._
  import com.lansalo.family.resemblance.fp.api.ExplicitBehavioursApi._
  import com.lansalo.family.resemblance.fp.Instances._

  "A Penguin" - {
    "can swim" in {
      swimOps(penguin)
    }
    "but it can't fly" in {
      // flyOps(penguin) -> compilation error
    }
    "and can't talk" in {
      // talkOps(penguin) -> compilation error
    }
  }

  "A Parrot" - {
    "can fly" in {
      flyOps(parrot)
    }
    "and can talk" in {
      talkOps(parrot)
    }
    "but it can't swim" in {
      // swimOps(parrot) -> compilation error
    }
  }

  "A Kakapo" - {
    "is still a parrot" in {
      kakapo.isInstanceOf[Parrot] shouldBe true
    }
    "and can talk" in {
      talkOps(kakapo)
    }
    "but unfortunately it can't fly" in {
      // flyOps(kakapo) -> compilation error
    }

  }

}

object ExplicitBehavioursApiTestFixture {
  val parrot = new Parrot("George")
  val penguin = new Penguin("Pingu")
  val kakapo = new Kakapo("Rufus")
}

