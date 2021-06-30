import org.specs2.mutable.Specification

class ProblemTest15 extends Specification {
  val list: List[Char] = List('a', 'b', 'c', 'c', 'd')
  val result: List[Char] =
    List('a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd',
      'd')

  "duplication must work as expected" in {
    Problem15.duplicateN(3, list) mustEqual result
  }
}
