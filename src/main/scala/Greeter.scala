trait Greeter {
  def greet(name: String): Unit = println("Hello, " + name + "!")
}

class DefautGreeter extends Greeter

class CustomerizabeGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}
