abstract class Bool {
  def ifThenElse[T](t: => T, e: => T): T

  def &&(x: => Bool): Bool = ifThenElse(x, False)
  def ||(x: => Bool): Bool = ifThenElse(True, x)
  def unary_!(): Bool = ifThenElse(False, True)

  def ==(x: Bool): Bool = ifThenElse(x, !x)
  def !=(x: Bool): Bool = ifThenElse(!x, x)
}

object True extends Bool {
  def ifThenElse[T](t: => T, e: => T) = t
  override def toString = "True"
}

object False extends Bool {
  def ifThenElse[T](t: => T, e: => T) = e
  override def toString = "False"
}

object TestBool extends App {
  println(True && False)
  println(True || False)
  println(!True)
  println(!False)
  println(True == False)
  println(True != False)
}
