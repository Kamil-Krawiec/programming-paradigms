
let rec find = function xs -> function a-> 
    match xs with
    |h::t when h=a -> true
    |[] -> false
    |h::t -> find t a 
;;

let find123 = find [1;2;3];;
let findabcd = find ['a';'b';'c'];;
let findEmpty= find [];;

find123 1;;
find123 10;;
findabcd 'a';;
findEmpty 'a';;


let rec split3Tail xs=
    let rec split3TailHelper(xs1,xs2,xs3,xs,licznik)=
        match xs with
        | []    -> (xs1,xs2,xs3)
        | h::t  when licznik mod 3 =0-> split3TailHelper(h::xs1,xs2,xs3,t,licznik+1)
        | h::t  when licznik mod 3 =1-> split3TailHelper(xs1,h::xs2,xs3,t,licznik+1)
        | h::t  when licznik mod 3 =2-> split3TailHelper(xs1,xs2,h::xs3,t,licznik+1)

    in 
    split3TailHelper([],[],[],xs,0);;

split3Tail([]);;
split3Tail([1;2;3;4;5;6]);;
split3Tail([1;2;3;4;5;6;7;8]);;
