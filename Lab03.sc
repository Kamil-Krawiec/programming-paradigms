//Zadanie 1

def nComp[A](f: A => A)(n: Int)(x: A): List[A] =
  if n <= 0 then Nil
  else
    def helper(elem: A, n: Int): List[A] =
      if n == 0 then Nil
      else elem :: helper(f(elem), n - 1)

    helper(x, n)

nComp((a: Int) => a * a)(5)(3)
nComp((a: Int) => a * a)(0)(3)
nComp((a: String) => a + "A")(5)("s")

//Zadanie 2
def area(a: Double, b: Double)(f: Double => Double)(n: Int): Double =
  val xs = List.range(1, n)
  val delta = (b - a) / n
  val xs_rec_area = xs map (x => f(a + delta * x) * delta)
  (xs_rec_area foldLeft (0.0)) ((acc, x) => acc + x)

area(1.0, 4.0)(x => x * x)(2000)
area(0.0, 1.0)(x => x * x)(1000)
area(3.0, 1.0)(x => x * x)(1000)