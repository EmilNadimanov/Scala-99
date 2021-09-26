import org.specs2.mutable.Specification

import scala.collection.immutable

class ProblemTest24 extends Specification {

  "code gotta work when " in {
    "previous methods are used" in {
      val res: Set[Int] = Problem24.lotto(3, 40).toSet
      print(res)
      (res subsetOf (0 to 40).toSet must beTrue) and (res.size must be equalTo 3)
    }
    "except exceptions" in {
      Problem24.lotto(113, 40) must throwA[Exception]
    }
  }
}
