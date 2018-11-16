(ns koans.lesson_3)

;; Clojurescript comes with hash maps as it's basic data structures

;; You can create a with the 'hash-map' function
(= {:a 1 :b 2} (:__ :a 1 :b 2))

;; But a value must be supplied for each key
(= {:a 1} (hash-map :a 1))

;; The size is the number of entries
(= :__ (count {:a 1 :b 2}))

;; You can look up the value for a given key
(= :__ (get {:a 1 :b 2} :b))

;; However Maps can also act like function (since they essentially are right?)
(= :__ ({:a 1 :b 2} :a))

;; Keywords can also act like functions
(= :__ (:a {:a 1 :b 2}))

;; But map keys need not be keywords
(= :__ ({2006 "Torino" 2010 "Vancouver" 2014 "Sochi"} 2010))

;; You may not be able to find an entry for a key
(= :__ ({:a 1 :b 2} :c))

"But you can provide your own default"
(= :__ ({:a 1 :b 2} :c :key-not-found))

;; You can find out if a key is present with 'contains?'
(= :__ (:__ {:a nil :b nil} :b))

;; Maps are immutable, but you can create an new version with 'assoc'
(= {1 "January" 2 :__} (:__ {1 "January"} 2 "February"))

;; You can also create a new version with an entry removed with 'dissoc'
(= :__ (:__ {1 "January" 2 "February"} 2))

;; Often you will need to get the 'keys', but the order is undependable
(:__ {2010 "Vancouver" 2014 "Sochi" 2006 "Torino"})

;; And you can get the 'vals' as well
(:__ {2006 "Torino" 2010 "Vancouver" 2014 "Sochi"})