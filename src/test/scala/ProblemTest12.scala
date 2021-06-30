import org.specs2.mutable.Specification

class ProblemTest12 extends Specification {
  val encoded = List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
  val decoded =
    List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')

  "decoding must be just good" in {
    Problem12.decode(encoded) mustEqual decoded
  }
}
