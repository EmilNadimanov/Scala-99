import org.specs2.mutable._

import java.util.NoSuchElementException

class ProblemTest2 extends Specification {
  val empty: List[Int] = List[Int]()
  val oneElement: List[String] = List[String]("Hey")
  val manyElements: List[String] = List[String]("Hey", "Ho", "Let's go")

  "Last index extraction should work correctly if " in {
    "builtin is used" in {
      Problem2.penultimateOne(empty) must throwA[NoSuchElementException]
      Problem2.penultimateOne(oneElement) must throwA[NoSuchElementException]
      Problem2.penultimateOne(manyElements) mustEqual "Ho"
    }

    "recursion is used" in {
      Problem2.penultimateRec(empty) must throwA[NoSuchElementException]
      Problem2.penultimateRec(oneElement) must throwA[NoSuchElementException]
      Problem2.penultimateRec(manyElements) mustEqual "Ho"
    }
  }
}
