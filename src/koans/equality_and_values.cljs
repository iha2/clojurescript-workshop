(ns koans.values)

(= _ true)

;; quality is simply another variadic function
(= (+ 3 4) 7 (+ _ 5))

;; = is the same as == in javascript
(= _ (= 2 2.0))

;; But it does not have the loose equality of javascript
(= _ (= "2" 2.0))

;; nil is null and undefined
(= (= true nil) _)

;; however, nil is not truthy
(= (= false nil) _)



;; --- Strings, Keywords, Symbols" --- ;;

;; However they are not the same thing
(= _ (= "hello" :hello 'hello))

;;  Make a keyword with your keyboard
(= _ (keyword "hello"))

;; Symbolism is all around us
(= _ (symbol "hello"))

;; What could be equivalent to nothing? (like a real language)
(= _ nil)

"When things cannot be equal, they must be different"
(not= :fill-in-the-blank :aaa)








