package training

object Liste {

  def main(args: Array[String]): Unit = {
    // LISTE

    // Crea una lista
    val creaLista = List("Crea", "una", "lista", "immutabile")

    // Concatenazione ::: di una lista
    val unoDue = List("uno", "due")
    val treQuattro = List("tre", "quattro")
    val unoDueTreQuattro = List(unoDue ::: treQuattro) // List("uno", "due", "tre", "quattro")
      println("1- " + unoDue + " and " + treQuattro + " were not mutated. Thus, " + unoDueTreQuattro + " is a new list.")

    // Cons :: antepone un nuovo elemento all'inizio di una lista esistente e restituisce una nuova lista
    val zeroUnoDue = List(0 :: unoDue)
      println("2- Crea una lista anteponendo un elemento: " + unoDue)

    // Cons :: con Nil può essere utilizzato per creare una list senza specificare che è di tipo List
    val consList = "cons" :: "list" :: Nil
      println("3- Crea una lista con cons: " + consList)


    val operazioniSulleListe = List(1, 2, 3, 4, 5, 6, 7, 8, 9, "dieci")
      println("4- Convertire in stringa una lista: "+ operazioniSulleListe.toString())                                                             // .toString()
      println("5- Lunghezza della lista: "+ operazioniSulleListe.length)                                                                           // .length
      println("6- Conta il numero degli elementi che hanno una certa lunghezza: " + operazioniSulleListe.count(s => s.toString.length == 4))       // .count
      println("7- Verifica se nella lista esiste l'elemento indicato: "+ operazioniSulleListe.exists(s => s == 1))                                 // .exists
      println("8- Restituisce l'elemento all'indice 0 della lista: " + operazioniSulleListe(0))                                                    // (0)
      println("9- Restituisce il primo elemento della lista: " + operazioniSulleListe.head)                                                        // .head
      println("10- Restituisce l'ultimo elemento della lista: " + operazioniSulleListe.last)                                                       // .last
      println("11- Restituisce la coda della lista: " + operazioniSulleListe.tail)                                                                 // .tail
      println("12- Restituisce tutti gli elementi della lista tranne l'ultimo: " + operazioniSulleListe.init)                                      // .init
      println("13- Restituisce una list aggiungendo il carattere 1 a ogni elemento della lista " + operazioniSulleListe.map(s => s + "1" ))        // .map
      println("14- Controlla se una lista termina con uno specifico valore: "+ operazioniSulleListe.forall(s => s.toString.endsWith("a")))         // .forall .endsWith("")
      println("15- Controlla se una lista è vuota: "+ operazioniSulleListe.isEmpty)                                                                // .isEmpty
      println("16- Restituisce una list flattata convertendo gli elementi in una lista di caratteri " + operazioniSulleListe.flatMap(_.toString))  // .flatMap
      println("<- 17- Stampa tutti gli elementi di una lista: " + operazioniSulleListe.foreach(s => print(s + ",")))                               // .foreach                     NOTA: Ultima virgola
      println("18- Crea una stringa con gli elementi della lista separati da comma: " + operazioniSulleListe.mkString(","))                        // .mkString("")
      println("19- Restituisce una lista filtrata not: " + (operazioniSulleListe.filterNot(s => s.toString.length == 4)))                          // .filterNot
      println("20- Restituisce una lista filtrata: " + (operazioniSulleListe.filter(s => s.toString.length == 4)))                                 // .filter
      println("21- Restituisce una lista contenente tutti gli elementi della lista in ordine inverso: " + operazioniSulleListe.reverse)            // .reverse
      println("22- Restituisce una lista sortata" + operazioniSulleListe.reverse.sortWith( (s, t)  => s.toString.charAt(0) < t.toString.charAt(0)))// .sortWith
      println("23- Restituisce la size della lista: " + operazioniSulleListe.size)                                                                 // .size
      println("24- Verifica se la lista contiene un elemento: " + operazioniSulleListe.contains("dieci"))                                          // .contains
      println("25- Partiziona la lista in base a parametri parsati: " + operazioniSulleListe.map(_.toString).partition(_.length == 1))             // .partition
      println("26- Restituisce il range degli indici della lista: " + operazioniSulleListe.indices)                                                // .indices
      println("27- Fold right della lista aggiungendo un carattere a destra: " + operazioniSulleListe.foldRight("!")(_+_))                         // .foldRight   Ex1
      println("28- " + operazioniSulleListe.foldRight(List[String]()){(x, operazioniSulleListe) => ("<"+ x +">") :: operazioniSulleListe})         // .foldRight   Ex2
      println("29- Concatena tutti gli elementi della lista" + operazioniSulleListe.map(_.toString).reduceRight(_+_))                              // .reduceRight Ex1
      println("30- Riduce a destra tutti gli elementi della lista: " + List(1,2,3,4 ,5, 6, 7, 8, 9).reduceRight(_-_))                              // .reduceRight Ex2
      println("31- Fold left della lista aggiungendo un carattere a sinistra: " + operazioniSulleListe.foldLeft("!")(_+_))                         // .foldLeft
      println("32- Riduce a sinistra tutti gli elementi della lista: " + List(1,2,3,4 ,5, 6, 7, 8, 9).reduceLeft(_+_))                             // .reduceLeft
      println("33- Raggruppa in liste gli elementi di una lista: " + operazioniSulleListe.grouped(5))                                              // .grouped
      println("34- Slide della lista: " + operazioniSulleListe.sliding(5))                                                                         // .slide
      println("35- Droppa i primi elementi della lista e per ognuno esegue un operazione: ")                                                       // .drop .foreach              NOTA: dropRight droppa gli ultimi
    operazioniSulleListe.drop(2).foreach(println)






  }
}
