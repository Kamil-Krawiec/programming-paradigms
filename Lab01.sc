
//Zadanie 1
def mirror4[A,B,C,D](xs:(A,B,C,D)): (B,A,D,C)=
  (xs._2,xs._1,xs._4,xs._3)
//Testy zadanie 1
mirror4(1,2,3,4)
mirror4('1','2','3','4')
mirror4(1,2.5,'a',"Ala")


//Zadanie 2
//Program przyjmuje argument a i zamienia go na b w liscie xs
def substitute[A](a:A,b:A,xs:List[A]): List[A] =
  if xs == Nil then Nil
  else (if xs.head == a then b else xs.head)::substitute(a,b,xs.tail)

//Testy zadanie2
substitute(1,2,List(1,2,3,4,1))
substitute(1,2,List())
substitute('A','x',List('A','l','a'))


//Zadanie 3
def remove[A](xs: List[A],i:Int): List[A]=
  if xs== Nil then Nil
  else if i<0 then xs
  else if i==0 then remove(xs.tail,i-1)
  else xs.head::remove(xs.tail,i-1)
//Testy zadanie 3
remove(List(1,2,3), 10)
remove(List(1,2,3), 2)
remove(List('a','b','c'),0)
remove(List('u','j','e','m','n','a'),-1)
remove(Nil,2)