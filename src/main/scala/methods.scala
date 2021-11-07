class BasicMethods() {
  def sum(a: Int, b: Int): Int = a + b

  def PrintBasicType = {
    println("Hello, World!")

    val x = 10
    x > 10 match {
      case true  => println("True")
      case false => println("false")
    }

    val list = List(1, 2, 3, 4)
    for (a <- list) println(a)

    for (a <- 0 to 10) println(a)

    val fruits = List("apple", "banana", "lime", "orange")

    val fruitLengths = for {
      f <- fruits
      if f.length > 4
    } yield f.length

    println(fruitLengths)

    var p = new Person("Julia", "Kern")
    println(p.firstName)
  }

  //CaseClass
  def caseCassPrint = {
    val point = Point(12, 45)
    val anotherPoint = Point(12, 45)
    val yetAnotherPoint = Point(2, 2)

    if (point == anotherPoint) {
      println(s"$point and $anotherPoint are the same.")
    } else {
      println(s"$point and $anotherPoint are different.")
    } // Point(1,2) and Point(1,2) are the same.

    if (point == yetAnotherPoint) {
      println(s"$point and $yetAnotherPoint are the same.")
    } else {
      println(s"$point and $yetAnotherPoint are different.")
    } // Point(1,2) and Point(2,2) are different.

  }

  //Objects
  def ObjectsPrint() {
    val newId: Int = IdFactory.create()
    println(newId) //1
    val newerId = IdFactory.create()
    println(newerId) //2
  }

  //Traits
  def TraitsPrint() {
    val greet = new DefautGreeter()
    greet.greet("Tiantian Zhao")

    val customerizabeGreeter = new CustomerizabeGreeter("Welcome ", " School");
    customerizabeGreeter.greet("Tiantian Zhao")
  }

  //Type casting
  def valueTypeCasting() {

    val a: Byte = 2
    val b: Short = a
    val c: Int = b
    val d: Long = c
    val e: Float = d
    val f: Double = e

    println(f)

    val x: Long = 987654321
    val y: Float = x
    val face: Char = '@'
    val number: Int = face

    println(s"$x,$y,$face,$number")

  }

  def privateMemberPrint() {
    val point = new Point1
    point.x = 99
    point.y = 101

  }

  def tuplesPtint() {
    val ingredient = ("Sugar", 25)
    println(ingredient._1) // Sugar
    println(ingredient._2) // 25}

    val (name, quantity) = ingredient
    println(name) // Sugar
    println(quantity) // 25

    val planets =
      List(
        ("Mercury", 57.9),
        ("Venus", 108.2),
        ("Earth", 149.6),
        ("Mars", 227.9),
        ("Jupiter", 778.3)
      )
    planets.foreach {
      case ("Earth", distance) =>
        println(s"Our planet is $distance million kilometers from the sun")
      case _ =>
    }

    val numPairs = List((2, 5), (3, -7), (20, 56))
    for ((a, b) <- numPairs) {
      println(a * b)
    }
  }

  def mixinxPrint() {
    val richIntIterator = new IntRichIterator
    richIntIterator.foreach(println)
  }

}
