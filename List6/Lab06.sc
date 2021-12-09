//Zad2 b


def pascalTrapezoidI(n: Int): Array[Int]=
  var begin = 2
  var prevArray = Array(1,1,1)
  var nextArray= Array(1,1,1)
  var counter = 2
  var arrayLen = prevArray.length

  while begin-2<n do

    counter=2

    nextArray = new Array[Int](2*begin+1)
    arrayLen = prevArray.length

    nextArray(0)= 1
    nextArray(1)= 1

    while counter<arrayLen do
      nextArray(counter)=prevArray(counter)+prevArray(counter-1)+prevArray(counter-2)
      counter+=1

    nextArray(2*begin)=1
    nextArray(2*begin-1)=1

    begin+=1

    prevArray=nextArray
  nextArray

pascalTrapezoidI(0)
pascalTrapezoidI(1)
pascalTrapezoidI(2)
pascalTrapezoidI(3)
pascalTrapezoidI(4)
pascalTrapezoidI(11)



