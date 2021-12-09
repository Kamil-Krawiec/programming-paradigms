
(* #use "Lab04MOD.ml";; *)
(* Zadanie 1 *)
type 'a bt = Empty | Node of 'a * 'a bt * 'a bt * 'a bt;;

let rec mapTree3= fun f -> fun bt->
    match bt with
    |Empty-> Empty 
    |Node(elem,n1,n2,n3)-> Node(f elem,mapTree3 f n1,mapTree3 f n2, mapTree3 f n3)

let test = Node(10, Node(1, Empty, Empty, Empty), Node(11, Empty, Empty, Empty), Node(12, Empty, Empty, Empty));;
let testv2 = Node("Jestem", Node("W", Empty, Empty, Empty), Node("Drzewie", Empty, Empty, Empty), Node("Binarnym", Empty, Empty, Empty));;

mapTree3(fun x->x*x)(test);;
mapTree3(fun x->String.length x)(testv2);;


(* Zadanie 2 *)

type file = File of string;;

type catalog = Catalog of string*file list*catalog list;;

type disc = Disc of char*catalog list*file list;;

let f1 = File("File.txt")
let f2 = File("File1.txt")
let f3 = File("File2.txt")
let f4 = File("Kamil.txt")

let f5 = File("JestemWDysku.txt")


let catalog = Catalog("Wspolne Pliki",[f1;f2;f3],[])

let catalogv2 = Catalog("Wspolne Pliki",[f1;f4],[catalog])

let c = Disc('C',[catalog;catalogv2],[f5;f4])

(* 
let rec searchFile disc file = 
    let rec searchFiles files=
        match files with
        []->[]
        |File(name)::t -> if name = file then [name] else searchFiles t
    in
    let rec searchCatalog cat= 
        match cat with 
        []->[]
        |Catalog(name,file_list,catalog_list)::t->if name = file then [name] else searchCatalog(catalog_list)::searchFiles(file_list)::searchCatalog t

    in 
    match disc with
        Disc(name,catalog_list,file_list)-> [name]::searchCatalog(catalog_list)::searchFiles(file_list)
        |_->[] *)


