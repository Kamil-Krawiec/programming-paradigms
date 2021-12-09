(* #use "Lab06.ml";;*)
let countOccurrences v elem = 
    let i  = ref(0)
    in
    let r = ref(0)
    in 
    while !r < Array.length v do
        if v.(!r) = elem then i := !i + 1;
        r := !r + 1
    done;
    !i;;

countOccurrences [|1; 2; 3; 1; 4; 5; 3; 7; 1; 11; 2|] 1;;
countOccurrences [|1; 2; 3; 1; 4; 5; 3; 7; 1; 11; 2|] 7;;
countOccurrences [|1; 2; 3; 1; 4; 5; 3; 7; 1; 11; 2|] 0;;
countOccurrences [|'a';'l';'a'|] 'a';;
countOccurrences [||] 'a';;
