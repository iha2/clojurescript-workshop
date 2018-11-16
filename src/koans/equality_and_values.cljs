(ns koans.values)

(= true true)

;; quality is simply another variadic function
(= (+ 3 4) 7 (+ 2 5))

;; = is the same as == in javascript
(= true (= 2 2.0))

;; But it does not have the loose equality of javascript
(= false (= "2" 2.0))

;; nil is null and undefined in one beatiful bunch
(= (= true nil) false)

;; however, nil is not truthy
(= (= false nil) false)



;; --- Strings, Keywords, Symbols" --- ;;

;; However they are not the same thing
(= false (= "hello" :hello 'hello))

;;  Make a keyword with your keyboard
(= :hello (keyword "hello"))

;; Symbolism is all around us
(= 'hello (symbol "hello"))

;; What could be equivalent to nothing? (like a real language)
(= nil nil)

;; When things cannot be equal, they must be different
(not= :fill-in-the-blank :aaa)








