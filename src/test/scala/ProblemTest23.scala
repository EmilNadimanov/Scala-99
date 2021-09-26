import org.specs2.mutable.Specification

class ProblemTest23 extends Specification {
  val noneTaken = List(1, 2, 3)
  "code gotta work when " in {
    "tailrec is used" in {
      Problem23.randomSelect(0, List(1, 2, 3)) must be equalTo Nil
      Problem23
        .randomSelect(3, List(1, 2, 3))
        .toSet[Int] must be equalTo Set[Int](1, 2, 3)
      Problem23
        .randomSelect(2, List(1, 2, 3))
        .toSet[Int] subsetOf Set[Int](1, 2, 3) must beTrue
    }
  }
}
