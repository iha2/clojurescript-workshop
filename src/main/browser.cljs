(ns main.browser
  (:require [reagent.core :as r :refer [adapt-react-class]]
            [main.core :as m :refer [presentation]]
            [main.cljs_logo :as logo :refer [start-rotation]]))

(defn app [] presentation)
 
(defn start []
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init []
  (start-rotation)
  (start))
