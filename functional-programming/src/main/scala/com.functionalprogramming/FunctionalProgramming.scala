object FunctionalProgramming {

  def main(args: Array[String]): Unit = {

    // INTRODUZIONE
    def addI(x: Int, i: Int): Int = {
      var sum: Int = 0
      sum = x + i
      return sum
    }
    println(addI(9,1))

    // EXPRESSION ORIENTED PROGRAMMING (EOP)
    // Espressioni NON statements
    // Gli STATEMENT eseguono il codice ma non ritornano nessun valore:
    // shoppingCart.checkOut()   // Gli STATEMENT creano SIDE EFFECT
    // Le ESPRESSIONI ritornano sempre un valore:
    // val shoppingCart = checkOut(items)

    val x = 10
    val y = 20
    val check = if (x > y) "true" else "false"
    println(check)

    // LITERAL FUNCTIONS (Anonymous Function)
    println((x: Int, y: Int) => x * y)

    // FUNCTIONS AS VARIABLES AND PARAMETERS
    val multiply = (x: Int, y: Int) => x * y
    println(multiply(5,2))

    val z = multiply(5,2)
    println(z)

    // SCALA CLOSURES è una Funzione che prende un parametro dall'esterno ma interno all'oggetto
    val b = 8
    val doIt = (a: Int) => a + b
    println(doIt(10))

    // PARTIALLY APPLIED FUNCTION
    val doSomething = (x :Int, y: Int) => x * y
    val timesTen = doSomething(10, _: Int)
    println(timesTen(5))

    // CURRYING FUNCTIONS (Chain of function with one parameter)
    def multiplyXY(x: Int) = (y: Int) => x * y
    println(multiplyXY(5)(5))

    // FUNCTION COMPOSITION
    val subTotal = (amt: Int) => {
      val cost: Double = .5
      cost * amt
    }
    val calcTax = (sub: Double) => {
      val tax = 1.1
      sub * tax
    }
    val total = (calcTax compose subTotal)(12) // esegue prima subTotal poi calcTax
    println(total)

    // oppure:
    //val total = (calcTax andThen subTotal) (12)  // esegue prima calcTax poi subTotal

    // RECURSION
    def factorial(z: Int): Int =
      if (z <= 1) 1
      else z * factorial(z - 1)

    println(factorial(5))

    /* Recursion:
     * 5 * factorial(5 -1)
     * 4 * factorial(4 -1) = 20
     * 3 * factorial(3 -1) = 60
     * 2 * factorial(2 -1) = 120
     * 1 - factorial done, return
     */

    // CALL BY NAME vs CALL BY VALUE
    def showTime() = {
      System.nanoTime()
    }
    def doItNow1(time: Long) = {
      println("Time: ")
      println(time)
      println("Time now: ")
      time
    }

    def doItNow2(time: => Long) = {
      println("Time: ")
      println(time)
      println("Time now: ")
      time
    }
    println(doItNow1(showTime()))
    println(doItNow2(showTime()))
  }
}
