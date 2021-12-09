
def find[A](xs:List[A])(a:A): Boolean=
    xs match
      case h::t if h==a => true
      case Nil => false
      case h::t => find(t)(a)


val find123 = find(List(1,2,3))
val findabc = find(List('a','b','c'))

find123(1)
find123(10)
findabc('a')

def split3Tail[A](xs: List[A]): (List[A],List[A],List[A])=
  def split3TailHelper[A](xs1: List[A] ,xs2: List[A],xs3: List[A],xs: List[A],licznik: Int): (List[A],List[A],List[A])=
    xs match {
     case Nil    => (xs1,xs2,xs3)
     case h::t  if (licznik%3 ==0) => split3TailHelper(h::xs1,xs2,xs3,t,licznik+1)
     case h::t  if (licznik%3 ==1) => split3TailHelper(xs1,h::xs2,xs3,t,licznik+1)
     case h::t  if (licznik%3 ==2) => split3TailHelper(xs1,xs2,h::xs3,t,licznik+1)
  }
  split3TailHelper(Nil,Nil,Nil,xs,0);;

split3Tail(List(1,2,3,4,5,6))
split3Tail(List())
split3Tail(List(1,2,3,4,5,6,7,8))
