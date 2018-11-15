(ns main.core
  (:require ["spectacle" :as spectacle :refer [Deck Slide Text]]
            [main.theme :as t :refer [theme]]
            [main.introduction_slides :as intro :refer [introduction]]))

(defn generate-deck [& args]
  [:> Deck {:theme theme :transitionDuration 500} (map-indexed (fn [idx arg] (arg idx)) args)])

(def presentation (apply generate-deck introduction))
