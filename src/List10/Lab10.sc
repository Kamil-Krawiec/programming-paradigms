class Person(val name:String ="Kamil"):

end Person

class Worker(val work: String="none",name:String) extends Person(name):

end Worker



var arr: Array[Int] = Array(1,2)
var arr1: Array[Int] = Array(3,5)

var arr2: Array[Any] = Array(1,2,"Tree")

//arr2 = arr  blad
arr = arr1; //Inwariantnosc



var workerArr: Array[Worker] = Array(new Worker("H","Kamil"),new Worker("H","Kamil"))
//var peopleArr: Array[Person] = workersArr nie przejdzie pomimo ze jest to podtyp



var workerList: List[Worker] = List(new Worker("H","Kamil"),new Worker("H","Kamil"))
var peopleList: List[Person] = workerList //jest dobrze bo kowariantna


