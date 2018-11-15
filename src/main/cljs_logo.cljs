(ns main.cljs_logo
  (:require ["spectacle" :as spectacle :refer [Deck Slide Text Image]]
            [cljs.core.async :refer [<! timeout]]
            [reagent.core :as r :refer [adapt-react-class]])
  (:require-macros [cljs.core.async :refer [go]]))

(def logo-angle-state (r/atom 0))

(defn start-rotation []
  (letfn [(rotate-loop [time]
            (swap! logo-angle-state inc)
            (go
              (<! (timeout 30))
              (.requestAnimationFrame js/window rotate-loop)))]
    (.requestAnimationFrame js/window (fn [time] (rotate-loop time)))))

(defn rotatable-logo [angle]
  (let [image-style
        {:transform (str "rotate(" angle "deg)")
         :margin "auto"}]
    [:div {:style image-style}
     [:> Image {:src "https://raw.githubusercontent.com/cljs/logo/master/cljs-white.png"
                :height "10%"
                :width "10%"}]]))

(def cljs-logo (rotatable-logo @logo-angle-state))

(defn animate-logo [] 
  (start-rotation))
