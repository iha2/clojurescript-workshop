(ns main.core
  (:require ["spectacle" :as spectacle :refer [Deck Slide Text]]
            [main.theme :as t :refer [theme]]
            [main.introduction_slides :as intro :refer [introduction]]
            [main.lessons :as lessons :refer [lesson-slides]]))

(defn generate-deck [& args]
  ;; rotating logo currenly won't work with this way of calling the functions.
  ;; Fix later
  [:> Deck {:theme theme :transitionDuration 500} (doall (map-indexed #(%2 %1) args))])

(def presentation (apply generate-deck (concat introduction lesson-slides)))
