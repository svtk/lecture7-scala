import collection.mutable.ArrayBuffer

object ScalaVariance extends App {

  def foo(ints: Array[Int]) {
//    val anys: Array[Any] = ints
  }

  def bar(ints: List[Int]) {
    val anys: List[Any] = ints
  }

  def testMutable(anys: ArrayBuffer[Any],
                  ints: ArrayBuffer[Int]) {
    anys ++= ints
  }
  
  def baz(c: Iterable[_]) {
  }
}
