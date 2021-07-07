import org.specs2.mutable.Specification

class ProblemTest20 extends Specification {
  val test1 = List('a', 'b', 'c', 'd')
  val res1: (List[Char], Char) = (List('a', 'c', 'd'), 'b')

  "removal must work fine when " in {
    "builtins are used" in {
      Problem20.removeAt(1, test1) mustEqual res1
      Problem20.removeAt(-1, test1) must throwA[Exception]
      Problem20.removeAt(5, test1) must throwA[Exception]
    }
    "tailrec is used" in {
      Problem20.removeAtTailrec(1, test1) mustEqual res1
      Problem20.removeAtTailrec(-1, test1) must throwA[Exception]
      Problem20.removeAtTailrec(5, test1) must throwA[Exception]
    }
  }
}
