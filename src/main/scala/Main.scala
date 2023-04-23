package training

object ScalaBook {
  def main(args: Array[String]): Unit = {

    /*
       ASSOCIATIVE MAP
       Questo programma imposta una mappa dai paesi alle loro capitali,
       modifica la mappa aggiungendo una nuova associazione ("Giappone" -> "Tokyo")
       e stampa la capitale associata al paese Italia.
    */

    var capital = Map("Italia" -> "Roma", "Germania" -> "Berlino")
    capital += ("Giappone" -> "Tokio")
    //println(capital("Italia"))
  }

  // DEFINE SOME FUNCTIONS
  // - def -> Definire una funzione
  // - Nome della funzione in minuscolo
  // - Lista di parametri nella (parentesi)
  // - Type risultante dalla funzione :
  // - Body della funzione in {parentesi graffe}

  def max(x: Int, y: Int): Int = {
    if (x >= y) x
    else y
  }
  // Call max
  println("The max value between "+ 5 + " and " + 9 + " is " + max(5,9))
  def min(x: Int, y: Int): Int = if (x <= y) x else y
  // Call min
  println("The min value between "+ 8 + " and " + 3 + " is " + min(8,3))

  def sum(x: Int, y: Int) = x + y
  // Call sum
  println("The sum of "+ 2 + " and " + 5 + " is " +sum(2,5))

  def dif (x: Int, y: Int): Int = {
    x - y
  }
  println("The difference between "+ 9 + " and " + 5 + " is " + dif(9,5))


}