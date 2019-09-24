package com.lansalo.family.resemblance.fp

import com.lansalo.family.resemblance.fp.api.MoreExplicitBehavioursApi
import com.lansalo.family.resemblance.fp.model.{Kakapo, Parrot, Penguin}
import org.scalatest.{FreeSpec, Matchers}

class MoreExplicitBehavioursApiTest extends FreeSpec with Matchers {

  import MoreExplicitBehavioursApiTestFixture._
  import com.lansalo.family.resemblance.fp.api.MoreExplicitBehavioursApi._
  import com.lansalo.family.resemblance.fp.ExplicitInstances._

  "A Penguin" - {
    "can swim" in {
      swimOps(penguin)(penguinBehaviour)
    }
    "but it can't fly" in {
      // flyOps(penguin)(?) -> compilation error
    }
  }

  "A Parrot" - {
    "can fly" in {
      flyOps(parrot)(parrotFly)
    }
    "can talk" in {
      talkOps(parrot)(parrotTalk)
    }
    "but it can't swim" in {
      // swimOps(parrot)(?) -> compilation error
    }
  }

  "A Kakapo" - {
    "is still a parrot" in {
      kakapo.isInstanceOf[Parrot] shouldBe true
    }
    "and can talk" in {
      talkOps(kakapo)(kakapoTalk)
    }
    "but unfortunately it can't fly" in {
      // flyOps(kakapo)(?) -> compilation error
    }

  }

}

object MoreExplicitBehavioursApiTestFixture {
  val parrot = new Parrot("George")
  val penguin = new Penguin("Pingu")
  val kakapo = new Kakapo("Rufus")
}


