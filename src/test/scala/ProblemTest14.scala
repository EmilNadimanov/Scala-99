import org.specs2.mutable.Specification

class ProblemTest14 extends Specification {
  val list: List[Char] = List('a', 'b', 'c', 'c', 'd')
  val result: List[Char] =
    List('a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'd', 'd')

  "duplication must work as expected" in {
    Problem14.duplicate(list) mustEqual result
  }
}
