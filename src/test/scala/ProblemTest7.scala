import org.specs2.mutable.Specification

class ProblemTest7 extends Specification {
  "flatten should work fine" in {
    Problem7
      .flatten(List(List(1, List(2)), List(3), 4)) mustEqual List(1, 2, 3, 4)
  }
}
