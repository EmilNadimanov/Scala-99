import org.specs2.mutable.Specification

class ProblemTest19 extends Specification {
  "Rotation gotta be good" in {
    val testCase1 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val res1 = List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'a', 'b', 'c')
    val testCase2 = List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
    val res2 = List('j', 'k', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i')
    val testCase3 = List('a', 'b', 'c')
    val res3: List[Char] = testCase3

    "the only case" in {
      Problem19.rotate(3, testCase1) mustEqual res1
      Problem19.rotate(-2, testCase2) mustEqual res2
      Problem19.rotate(0, testCase3) mustEqual res3
    }
  }
}
