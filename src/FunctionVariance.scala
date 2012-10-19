object FunctionVariance extends App {
  type A = String => Any
  type B = Any => String

//  def testAIsSubtypeOfB(a: A) = a: B
  def testBIsSubtypeOfA(b: B) = b: A



  def testA(a: String => Any) {
    val any: Any = a("")
  }

  def testB(b: Any => String) {
    val str: String = b(1)
  }

  testA((str: String) => 2)
  testA((a: Any) => "")

  testB((str: Any) => "")
//  testB((str: String) => 2)
}
