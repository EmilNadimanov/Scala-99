import org.specs2.mutable._

import java.util.NoSuchElementException

class ProblemTest3 extends Specification {
  val empty: List[Int] = List[Int]()
  val oneElement: List[String] = List[String]("Hey")
  val manyElements: List[String] = List[String]("Hey", "Ho", "Let's go")

  "Last index extraction should work correctly if " in {
    "builtin is used" in {
      Problem3.findNthByIndex(empty, 0) must throwA[NoSuchElementException]
      Problem3.findNthByIndex(oneElement, 0) mustEqual "Hey"
      Problem3.findNthByIndex(manyElements, 2) mustEqual "Let's go"
      Problem3
        .findNthByIndex(manyElements, 3) must throwA[NoSuchElementException]
    }

    "recursion is used" in {
      Problem3.findNthRecursively(empty, 0) must throwA[NoSuchElementException]
      Problem3.findNthRecursively(oneElement, 0) mustEqual "Hey"
      Problem3.findNthRecursively(manyElements, 2) mustEqual "Let's go"
      Problem3
        .findNthRecursively(manyElements, 3) must throwA[NoSuchElementException]
    }
  }
}
