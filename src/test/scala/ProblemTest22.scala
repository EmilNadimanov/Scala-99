import org.specs2.mutable.Specification

class ProblemTest22 extends Specification {
  val testList = List(1, 2, 3, 4)

  "removal must work fine when " in {
    "builtins are used" in {
      Problem22.range(1, 4) must be equalTo testList
      Problem22.range(1, -1) must throwA[Exception]
    }
    "tailrec is used" in {
      Problem22.rangeTailRec(1, 4) must be equalTo testList
      Problem22.rangeTailRec(1, -1) must throwA[Exception]

    }
  }

}
