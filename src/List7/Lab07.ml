(* #use "Lab07.ml";; *)

module type MEMORY=
sig 
    type  t = {length : int;mutable memory : int option array }
    exception GetNoneException of string
    exception IndexOutOfBoundsException of string
    val init: int -> t
    val get : int -> t -> int
    val set : int -> int -> t -> unit
    val dump : t -> int option array
end;;

module ArrayMemory: MEMORY=
struct
    type  t = {length : int ; mutable memory : int option array }

    exception GetNoneException of string

    exception IndexOutOfBoundsException of string

    let init size  = {length=size ; memory = Array.make size None}

    let get index mem = if index<0 || index> mem.length then raise(IndexOutOfBoundsException("IndexOutOfBoundsException "))
                    else 
                        match mem.memory.(index) with
                        Some e -> e
                        |None -> raise(GetNoneException "None")

    let set index elem mem = if index>=0 && index< mem.length then mem.memory.(index)<- Some(elem)

    let dump mem = mem.memory
end;;



let s = ArrayMemory.init(10);;
ArrayMemory.set 3 10 s ;;
ArrayMemory.dump s;;

module RAMMachine = 
struct
    type instruction = 
    Load of int*int 
    | Add of int*int*int 
    | Sub of int*int*int

    type t = {memo: ArrayMemory ; mutable instList: instruction list}

    let init size instrList = {memo = ArrayMemory.init 10; instList = instrList}

    let step machine =
        match instList with
        Load(index,elem)::t -> machine.memo.set index elem machine.memo; machine.instList<-t;
        |Add(index,elem1,elem2)::t-> machine.memo.set index (elem1+elem2) machine.memo; machine.instList<-t;
        |Sub(index,elem1,elem2)::t-> machine.memo.set index (elem1-elem2) machine.memo; machine.instList<-t;

end;;