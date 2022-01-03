import java.util
import javax.swing
import javax.swing.Painter

//Zad1
class Square(private val a: Int){
  require(a>0, "message : a is negative")

  def width: Int = a
  def area: Int= a*a
}

class Rectangle(private val a: Int, private val b: Int) extends Square(a){
  require(a>0 && b>0, "message : a is negative")

  def height: Int = b

  override def area: Int = a*b
}


var sq = Square(10)
sq.area
sq.width

var rec = new Rectangle(10,20)
rec.area
rec.width
rec.height



//Zad2
class EmptyName extends Exception
class EmptySurname extends Exception
class AgeUnderE extends Exception

trait Painter:
  def paint() = println("Painting...")

trait Electrician:
  def fixElectricity() = println("Fixing electricity...")

trait Plumber:
  def plumbing() = println("Plumbing...")

class Handyman(val name: String, val surname: String, private var ag: Int) {

  require(name != "", throw new EmptyName)
  require(surname != "", throw new EmptySurname)
  require(ag > 18, throw new AgeUnderE)

  def age: Int = ag
  def age_=(newAge: Int) ={
    require(newAge >= 18, throw new AgeUnderE)
    ag = newAge
  }

  override def toString = s"[$name, $surname, $ag]"

}



class Office(private var handymanList: List[Handyman]=List()){

  def register(newPerson: Handyman): Unit = handymanList= newPerson::handymanList

  def listPlumbers: List[Handyman]= handymanList.filter(_.isInstanceOf[Plumber])

  def listElectricians: List[Handyman]= handymanList.filter(_.isInstanceOf[Electrician])

  def listPainters: List[Handyman]= handymanList.filter(_.isInstanceOf[Painter])

}

var h1 = new Handyman("Kamil","Krawiec",20) with Painter with Plumber
var h2 = new Handyman("Jan","Bla",22) with Painter with Electrician
//var h3 = Handyman("","",19)
var h3 = new Handyman("Gaz","Jaza",21) with Plumber with Electrician

var office = new Office()
office.register(h1)
office.register(h2)
office.register(h3)

office.listPlumbers
office.listElectricians
office.listPainters

