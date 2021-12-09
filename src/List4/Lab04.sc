//Zadanie 1

sealed trait BT[+A]
case object Empty extends BT[Nothing]
case class Node[+A](elem: A, left: BT[A],midle: BT[A], right: BT[A]) extends BT[A]

def mapTree3[A,B](f: A=>B)(bt: BT[A]): BT[B]=
  bt match
    case Empty=>Empty
    case Node(elem,n1,n2,n3)=>Node(f(elem),mapTree3(f)(n1),mapTree3(f)(n2),mapTree3(f)(n3))

val test = Node(10, Node(1, Empty, Empty, Empty), Node(11, Empty, Empty, Empty), Node(12, Empty, Empty, Empty))

val sqr=(x:Int)=> x*x
mapTree3(sqr)(test)

//Zadanie 2

sealed trait Words[char,String]
  case class Word[char,String](first: char, rest: String)

sealed trait TypeOfSentence
  case object Affirmative extends TypeOfSentence
  case object Question extends TypeOfSentence
  case object Exclamation extends TypeOfSentence

sealed trait Sentences[Words,TypeOfSentence,List[Words]]
  case class Sentence[Words,TypeOfSentence,List[Words]](beg: Words, rest: List[Words],end:TypeOfSentence)

sealed trait Texts[Sentences,List[Sentences]]
  case class Text[Sentences,List[Sentences]](beg: Sentences, rest:List[Sentences])


val w = Word("w","yraz")