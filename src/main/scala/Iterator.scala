trait Iterator[A] {
  def hasNext: Boolean
  def next(): A
}
trait RichIterator extends Iterator[Int] {
  def foreach(f: Any => Unit): Unit = while (hasNext) f(next())
}

class IntIterator(to: Int) extends Iterator[Int] {
  private var current = 2
  override def hasNext: Boolean = current < to
  override def next(): Int = {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }

}

class IntRichIterator extends IntIterator(10) with RichIterator
