(ns main.introduction_slides
  (:require
   [reagent.core :as r :refer [adapt-react-class]]
   ["spectacle" :as spectacle :refer [Slide Text Appear List ListItem]]
   [main.cljs_logo :as logo :refer [cljs-logo]]))

(defn slide-one [key]
  ^{:key key}
  [:> Slide
   [:> Text {:textColor "white"} "Clojurescript For Beginners"]
   cljs-logo])

(defn slide-two [key]
  ^{:key key}
  [:> Slide
   [:> Text {:textColor "white"} "Setting Up Your Environment"]
   [:> List
    [:> Appear
     [:> ListItem
      [:> Text {:textColor "white"} "Enter"]
      [:> Text {:textColor "red"} "npm install -g shadow-cljs"]
      [:> Text {:textColor "white"} "or"]
      [:> Text {:textColor "red"} "yarn global add shadow-cljs"]]]]])

(defn slide-three [key]
  ^{:key key}
  [:> Slide
   [:> Text {:textColor "white"} "Setting Up Your VS Code Environment"]
   [:> List
    [:> Appear
     [:> ListItem
      {:textColor "white" :textSize "1.9rem"} "Install Calva for Visual Studio Code"]]
    [:> Appear
     [:> ListItem
      {:textColor "white" :textSize "1.9rem"} "Install Bracket Pair Colorizer"]]]])


(defn slide-four [key]
  ^{:key key}
  [:> Slide
   [:> Text {:textColor "white"} "Why ClojureScript?"]
   [:> List
    [:> Appear [:> ListItem "Functional Language"]]
    [:> Appear [:> ListItem "Dynamically Typed"]]
    [:> Appear [:> ListItem "Homo Iconic (Code is Data)"]]]])

(def introduction [slide-one
                   slide-two
                   slide-three
                   slide-four])



