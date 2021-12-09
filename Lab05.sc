//Zadanie 2

def skipTakeL[A](xs: LazyList[A]): LazyList[A]=

  def helper(accTail: LazyList[A],counter: Int, COUNTER: Int): LazyList[A]=
    (accTail,counter) match
      case (LazyList(),_)=> LazyList()
      case (h#::t,0)=> h#::helper(t,COUNTER+1,COUNTER+1)
      case (h#::t,_) => helper(t, counter-1,COUNTER)

  xs match
    case h#::t => h#::helper(t,1,1)
    case LazyList()=> LazyList()

skipTakeL(LazyList('a','b','c','d','e')).toList
skipTakeL(LazyList(1,2,3,4,5,6,7,8,9,10,11)).toList
skipTakeL(LazyList.from(1)).take(15).toList