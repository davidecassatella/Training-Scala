import jdk.jshell.spi.ExecutionControl.ClassInstallException

/*
All'interno di una definizione di classe, si inseriscono campi e metodi, che vengono chiamati collettivamente membri.
- I campi, che definisci con val o var, sono variabili che fanno riferimento a oggetti. Contengono lo stato, o i dati, di un oggetto.
- I metodi, che definisci con def, contengono codice eseguibile. Utilizzano i dati dei campi per eseguire il lavoro computazionale dell'oggetto.
*/

class Class_name{
  // methods and fields
}

class Classi{
  var campo1 = 0
  private var campo2 = 0
}

  val oggetto1 = new Classi
  val oggetto2 = new Classi
  oggetto1.campo1 = 1
  oggetto2.campo2 = 1 // Non compila, perché campo2 è private

/*
Poiché campo2 è privato, l'unico modo per accedere a campo2 è scrivere il codice definito all'interno del corpo della classe stessa.
 */

class  ClasseConPrivateVar extends Classi {
  private var campoPrivate = 0

  def add(x: Int): Unit = {     // I metodi con un tipo di risultato Unit, vengono eseguiti per i loro effetti collaterali.
    campoPrivate += x           // Un effetto collaterale è generalmente definito come uno stato mutante in un punto esterno al metodo o l'esecuzione di un'azione di I/O.
  }                             // Nel caso di add, l'effetto collaterale è che la somma viene riassegnata. Un metodo che viene eseguito solo per i suoi effetti collaterali è noto come procedura

  val oggettoConPrivateVar = new ClasseConPrivateVar
  val oggettoExtended = new Classi                        // Creazione oggetto utilizzando l'estensione delle classi
}

class Point1(var x: Int = 0, var y: Int = 0) {
  val origin = new Point1                             // x e y sono entrambi settati a 0
  val point1 = new Point1(1)                          // x è settato a 1 e y di default è settato a 1
  println(point1)                                     // prints (1, 0)
}

class Point2(var x: Int = 0, var y: Int = 0) {
  val origin = new Point1                             // x e y sono entrambi settati a 0
  val point2 = new Point1(y = 2)                      // x è settato di default a 0 e y è settato a 2
  println(point2)                                     // prints (0, 2)
}

class Point3(val x: Int, val y: Int)        // I parametri del costruttore primario con val e var sono pubblici.
  val point3 = new Point3(1, 2)             // Poiché val è immutabile, non è possibile scrivere quanto segue.
  point3.x = 3                              // <-- Non compila, perché x è immutabile


class Point4(x: Int, y: Int)                // I parametri senza val o var sono valori privati, visibili solo all'interno della classe.
  val point4 = new Point4(1, 2)
  point4.x                                  // <-- Non compila, perché x e y sono variabili private e quindi non accessibili al di fuori della classe



/* Un programma Scala che illustra come creare una classe */

// Il nome della classe è Smartphone
class Smartphone{

  // Variabili della classe
  val number = 15
  val company = "Apple"

  // Metodi della classe
  def Display(): Unit = {
    println("Il nome della compagnia è " + company)
    println("Il numero di smartphone è " + number)
  }
}

// Il nome dell'oggetto è Main
object Main{

  // metodo Main
  def main(args: Array[String]) {

    // Class object
    var obj = new Smartphone()
        obj.Display()                 // <- Name of the company : Apple + Total number of Smartphone generation: 16
  }
}

/* Un programma Scala che illustra lì inizializzazione di un oggetto */

class Dog(nome: String, età: Int, razza: String, colore: String){
  println("Mi chiamo: " + nome + " Ho l'età di: " + età)
  println(" Il mio colore è: " + colore + " La mia razza è: "+ razza)
}

object MainDog
{

  // Metodo Main
  def main(args: Array[String]) {

    // Class object
    var cane1 = new Dog("Sam", 6, "Rottweiler", "nero");
  }
}

/* Un programma Scala che illustra lì inizializzazione di un Anonymous object */

class GFG
{
  def display()
  {
    println("Welcome! Anonymous object");
  }
}
object MainAnonymous
{

  // Metodo Main
  def main(args: Array[String])
  {

    // Crea un Anonymous object della classe GFG
    new GFG().display();
  }
}
