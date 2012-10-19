object ListExample {

  trait List[+T] {
    def head: T
    def tail: List[T]
    def ++[R >: T](other: List[R]): List[R]
  }

  List("g").++(List(3))

  object Nil extends List[Nothing] {
    def head = throw new NoSuchElementException("Nil.head")
    def tail = throw new NoSuchElementException("Nil.tail")
    def ++[R](other: List[R]) = other
  }

  class NotEmpty[T](
    val head: T,
    val tail: List[T]
) extends List[T] {

    def ++[R >: T](other: List[R]) =
      new NotEmpty[R](head, (tail ++ other))
  }
}
