(* #use "Lab05.ml";; *)

type 'a llist = LNil | LCons of 'a * 'a llist Lazy.t;;


let rec toLazyList = function
 [] -> LNil
 | x :: xs -> LCons(x, lazy (toLazyList xs))
;;

let rec ltake = function
 (0, _) -> []
 | (_, LNil) -> []
 | (n, LCons(x, lazy xs)) -> x :: ltake(n-1, xs)
;; 


(* Zadanie 1 *)

type 'a ticket = Rew of 'a ticket | Ticket of 'a;;
type 'b sup = Open of 'b |Sup of (unit -> 'b ticket);;
type  'a table = Table of 'a sup list;;

let s = Sup(fun ()-> Ticket(10));;
let d = Sup(fun ()-> Ticket(11));;
let p = Sup(fun ()-> Rew(Ticket(121)));;

let t =Table([s;d;p]);;

let buyTicket xs nr =
    match (xs,nr) with
    (Sup(f)::t,0)-> Open(f())::t
    |(h::t,_)-> h::buyTicket t (nr-1);;

(* type 'a table = Table of 'a ticket list;; *)

(* let t = Table(Reward(10,false),Reward("Komputer",false),Ticket) *)










(* let rec buyTicket table n = 
    match (table,n) with
     *)