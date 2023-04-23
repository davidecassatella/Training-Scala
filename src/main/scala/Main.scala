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
    println(capital("Italia"))
  }



}