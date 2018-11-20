(ns main.core
  (:require ["spectacle" :as spectacle :refer [Deck Slide Text]]
            [main.theme :as t :refer [theme]]
            [main.introduction_slides :as intro :refer [introduction]]))

(defn generate-deck [& args]
  (into [:> Deck {:theme theme :transitionDuration 500}]
        args))

(def presentation
  (generate-deck introduction))
