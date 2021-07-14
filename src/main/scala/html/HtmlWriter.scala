package html

trait HtmlWriter[A] {
  def write(in: A): String
}

object HtmlWriter {
  def apply[A](implicit writer: HtmlWriter[A]): HtmlWriter[A] = writer
}
object HtmlImplicit {
  implicit class HtmlOps[T](data: T) {
    def toHtml(implicit writer: HtmlWriter[T]): String = writer.write(data)
  }
}
