(* Zadanie 1 *)
let mirror4(a,b,c,d) = (b,a,d,c);;
(* Testy zadanie 1 *)
mirror4(1,2,3,4);;
mirror4('1','2','3','4');;
mirror4(1,2.5,'a',"ALA");;


(* Zadanie 2 *)
(* Program przyjmuje argument a i zamienia go na b w liscie xs *)
let rec substitute(a,b,xs)=
    if xs =[] then []
    else (if List.hd xs = a then b else List.hd xs )::substitute(a,b,List.tl xs);;

(* testy zadanie 2 *)
substitute(1,260330,[1;2;3;4;1]);;
substitute('a','l',['a';'l';'a']);;
substitute('A',' ',['a';'l';'a']);;
substitute('A','x',['A';'l';'a']);;

(* Zadanie 3 *)
let rec remove(xs,i)=
    if xs=[] then []
    else if i<0 then xs                             (* Jeśli pozycja jest poza zakresem, należy zwrócić oryginalną listę.*)
    else if i=0 then remove(List.tl xs, i-1)        (* Pominiecie elementu w laczeniu*)
    else List.hd xs::remove(List.tl xs,i-1);;       (* Dekrementacja o 1 licznika i dokladanie elementow do listy dopoki i nie bedzie rowne 0*)

(* Testy zadanie 3 *)
remove([1;2;3],1);;
remove([1;2;3],10);;
remove(['a';'b';'c';'d'],3);;
remove(['a';'b';'c';'d'],-3);;
















