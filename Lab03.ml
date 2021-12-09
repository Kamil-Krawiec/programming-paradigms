(*  REKURENCJA OGONOWA
let nComp f n = fun x->
    if n<=0 then []
    else 
        let rec helper elem acc n=
            match n with 
                1-> acc
                |_ ->helper (f elem) ((f elem)::acc) (n-1)
        in helper x [x] n
        ;;

let x = nComp sin (-4) 3.14;;
let x = nComp (fun x->x*x) 3 3;; *)

(* Zadanie 1 *)
let nCompp f n = fun x->
    if n<=0 then []
    else 
        let rec helper elem n=
            match n with 
                0-> []
                |_ ->elem::(helper (f elem) (n-1))
        in helper x n
        ;;

let xs = nCompp sin (-4) 3.14;;
let xs = nCompp (fun x->x*x) 4 3;;
let xs = nCompp (fun x->x^"A") 4 "s";;

(* Zadanie 2 *)

let area (a,b)(f)(n) =

    let rec sieve from_n  = if from_n <= n then from_n::sieve(from_n+1) else [] in (* funkcja tworzaca tablice [1,2...n] odpowiadajaca indeksom prostokatow *)
    let delta = (b-.a)/. float(n)  (*roznica oznaczona jako delta *)
    in List.fold_left (+.) 0. (List.map (fun x -> f(a +. delta *. float(x)) *. delta) (sieve 1)) 
    (* List fold left sumuje wszystkie pola prostokatow ze zmapowanej tablicy [1,2...n]  *)
    (* f(a +. delta *. float(x)) *. delta) to nic innego jak liczenie pola tego prostokata dla zadanego x z tablicy [1,2...n]*)

let f (x:float): float= x*.x;;

area (0.,1.)(f)(300);;
area (1.0, 4.0) f (2000);;
area (0.,3.14) sin (300);;
area (3.14,0.) sin (300);;


(* #use "Lab03.ml";; *)