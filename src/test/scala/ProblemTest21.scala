import org.specs2.mutable.Specification

class ProblemTest21 extends Specification {
  val test1 = List('a', 'b', 'c', 'd')
  val resAppendIndexFour: List[Char] = List('a', 'b', 'c', 'd', 'e')
  val resAppendIndexZero: List[Char] = List('0', 'a', 'b', 'c', 'd')
  val resAppendIndexTwo: List[Char] = List('a', 'b', '2', 'c', 'd')

  "removal must work fine when " in {
    "builtins are used" in {
      Problem21.insertAt('e', 4, test1) mustEqual resAppendIndexFour
      Problem21.insertAt('0', 0, test1) mustEqual resAppendIndexZero
      Problem21.insertAt('2', 2, test1) mustEqual resAppendIndexTwo
    }
    "tailrec is used" in {
      Problem21.insertAtRecursive('e', 4, test1) mustEqual resAppendIndexFour
      Problem21.insertAtRecursive('0', 0, test1) mustEqual resAppendIndexZero
      Problem21.insertAtRecursive('2', 2, test1) mustEqual resAppendIndexTwo

    }
  }

}
