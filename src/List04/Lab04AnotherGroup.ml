
(* #use "Lab04.ml";; *)
(* Zadanie 1 *)

type 'a bt = Empty | Node of 'a * 'a bt * 'a bt * 'a bt;;


let rec mapTree3= fun f -> fun bt->
    match bt with
    |Empty-> Empty 
    |Node(elem,n1,n2,n3)-> Node(f elem,mapTree3 f n1,mapTree3 f n2, mapTree3 f n3)

let test = Node(10,Node(1,Empty,Empty,Empty),Node(11,Empty,Empty,Empty),Node(12,Empty,Empty,Empty));;

mapTree3(fun x->x*x)(test);;


(* Zadanie 2 *)
type word = Word of char * string;;
type typeOfSentence = Affirmative | Question | Exclamation;;
type sentence = Sentence of word * word list * typeOfSentence;;
type text = Text of sentence*sentence list;;



let w = Word('w',"ord");;
let y = Word('p',"roba");;
let r = Word('c',"zy");;
let a = Word('d',"ziala");;
let z = Word('p',"prawidlowo");;

let sen = Sentence(w,[y;r;a;z],Exclamation);;



let wordToString word =
    match word with
    Word(s,e) -> (String.make 1 s)^e;;


let sentenceToString sen =  
    match sen with
        Sentence(Word(f,r),rest,tos) ->(String.make 1(Char.uppercase f) ^ r) ^ 
                                    (List.fold_left (^) "" (List.map wordToString rest))^
                                    (if tos=Exclamation then "!" else if tos=Question then "?" else ".");;
sentenceToString sen;;