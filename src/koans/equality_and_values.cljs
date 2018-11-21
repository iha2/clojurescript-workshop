(ns koans.values)

(= :__ true)

;; quality is simply another variadic function
(= (+ 3 4) 7 (+ :__ 5))

;; = is the same as == in javascript
(= :__ (= 2 2.0))

;; But it does not have the loose equality of javascript
(= :__ (= "2" 2.0))

;; nil is null and undefined
(= (= true nil) :__)

;; however, nil is not truthy
(= (= false nil) :__)



;; --- Strings, Keywords, Symbols" --- ;;

;; A String in ClojureScript is a sim;le Javascript String
(type "string")

;; a Keyword is a simple type that are usually used as unique identifiers
(type :keyword)

;; Symobls are types in clojurescript that are interpreted are computable expressions
(type 'symbol)

;; However they are not the same thing
(= :__ (= "hello" :hello 'hello))

;;  Make a keyword with your keyboard
(= :__ (keyword "hello"))

;; Symbolism is all around us
(= :__ (symbol "hello"))

;; What could be equivalent to nothing? (like a real language)
(= :__ nil)

"When things cannot be equal, they must be different"
(not= :fill-in-the-blank :aaa)








