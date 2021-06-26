import org.specs2.mutable._

import java.util.NoSuchElementException

class ProblemTest1 extends Specification {
  val empty: List[Int] = List[Int]()
  val oneElement: List[String] = List[String]("Hey")
  val manyElements: List[String] = List[String]("Hey", "Ho", "Let's go")

  "Last index extraction should work correctly if " in {
    "builtin wrapper is used" in {
      Problem1.lastBuiltin(empty) must throwA[NoSuchElementException]
      Problem1.lastBuiltin(oneElement) mustEqual "Hey"
      Problem1.lastBuiltin(manyElements) mustEqual "Let's go"
    }

    "recursion that depends on list length is used" in {
      Problem1.lastRecursive(empty) must beNone
      Problem1.lastRecursive(oneElement).get mustEqual "Hey"
      Problem1.lastRecursive(manyElements).get mustEqual "Let's go"
    }

    "recursion that depends on cons operator" in {
      Problem1.lastRecursiveCons(empty) must beNone
      Problem1.lastRecursiveCons(oneElement).get must be equalTo "Hey"
      Problem1.lastRecursiveCons(manyElements).get must be equalTo "Let's go"
    }
  }
}
