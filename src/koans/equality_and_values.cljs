(ns koans.values)

(= true true)

;; quality is simply another variadic function
(= (+ 3 4) 7 (+ _ 5))

;; = is === in javascript
(= false (= 2 2.0))

;; == is a looser equality ( it means the same in js)
(= true (== 2.0 2))

;; nil is null and undefined
(= true nil)

;; however, nil is not truthy
(= false nil)



;; --- Strings, Keywords, Symbols" --- ;;

;; However they are not the same thing
(= _ (= "hello" :hello 'hello))

;;  Make a keyword with your keyboard
(= :hello (keyword "hello"))

;; Symbolism is all around us
(= 'hello (symbol "hello"))

;; What could be equivalent to nothing?"
(= nil nil)

"When things cannot be equal, they must be different"
(not= :fill-in-the-blank :aaa)








