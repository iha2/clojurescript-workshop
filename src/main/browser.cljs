(ns main.browser
  (:require ["spectacle" :as spectacle :refer [Deck Slide Text]]
            [reagent.core :as r :refer [adapt-react-class]]
            [main.theme :as t :refer [theme]]
            [main.cljs_logo :as logo :refer [cljs-logo animate-logo]]))

(defn presentation []
  [:> Deck {:theme theme :transitionDuration 500}
   [:> Slide
    [:> Text {:textColor "white"} "Clojurescript For Beginners"]
    (cljs-logo)]])

;; APP
(defn app [] (presentation))

(defn start []
  (r/render [app]
            (.getElementById js/document "app")))

(defn ^:export init []
  (js/console.log "init")
  (animate-logo)
  (start))
