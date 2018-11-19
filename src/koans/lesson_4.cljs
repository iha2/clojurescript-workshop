(ns koans.lesson_4)

;; In previous lessons, we've basically been working calling functions implicitly
;; Now we will call them explicitly.

;; STORING VARIABLES

;; creating variables is done using 'def'. Enter a name for your variable
(:__ :__ {:a 1 :b 2})


;; Run an anonymous function
(#(+ %1 %2) 3 4)

;; you can store a function with def
(def my-function #(+ %:__ %:__))

;; thankfully clojurescript comes with a macro for storing functions called 'defn'
(defn new-function [x y] (+ x y))


;; Recursion: Loop & Recur

;; This is an example of a simple for loop using the loop and recur
;; For loop
(defn for-loop [function count]
  (loop [iterator count]
    (if (= iterator 0)
      nil
      (do
        (function)
        (recur (dec iterator))))))

;; impliment a map higher order function. Use the functions 'first', 'rest' and 'empty?'
  
(defn !map [lamda-expression map-collection]
  (loop [collection map-collection
         result '()]
    (if (:__ collection)
      :__
      (recur :__ :__)
      )))

;; impliment a filter higher order function. Use the functions 'first', 'rest' and 'empty?'

(defn !filter [lambda-expression map-collection]
  (loop [collection map-collection
         result '()]
    (let [lambda-result :__]
      (cond (:__ collection) result
            lambda-result (recur :__ :__)
            :else (recur :__ :__)))
    ))


;; implement reduce using  the loop and recur, along with any other functions used in the previous exercises.