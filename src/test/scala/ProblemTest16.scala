import org.specs2.mutable.Specification

class ProblemTest16 extends Specification {
  val toTest = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
  val result = List('a', 'b', 'd', 'e', 'g', 'h', 'j', 'k')

  "drop function must work fine" in {
    Problem16.drop(3, toTest) mustEqual result
  }
}
