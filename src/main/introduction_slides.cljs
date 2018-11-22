(ns main.introduction_slides
  (:require
   [reagent.core :as r :refer [adapt-react-class]]
   [main.cljs_logo :as logo :refer [cljs-logo rotate-logo]]
   [cljs.core.async :refer [<! timeout]]
   ["spectacle" :as spectacle :refer [Slide Text Appear List ListItem Image]])
  (:require-macros [cljs.core.async :refer [go]]))

(defn slide-one [key]
  ^{:key key}
  [:> Slide
   [:> Text {:textColor "white"} "Clojurescript For Beginners"]
   (rotate-logo)])

(defn slide-two [key]
  ^{:key key}
  [:> Slide
   [:> Text {:textColor "white"} "Why ClojureScript?"]
   [:> List
    [:> Appear [:> ListItem "Functional Language"]]
    [:> Appear [:> ListItem "Dynamically Typed"]]
    [:> Appear [:> ListItem "Homoiconic (Code is Data)"]]]])

(defn slide-three [key]
  ^{:key key}
  [:> Slide
   [:> Text {:textColor "white"} "Setting Up Your VS Code Environment"]
   [:> List
    [:> Appear
     [:> ListItem
      {:textSize "1.9rem"} "Install Calva for Visual Studio Code"]]
    [:> Appear
     [:> ListItem
      {:textSize "1.9rem"} "Install Bracket Pair Colorizer"]]]])

(defn slide-four [key]
  ^{:key key}
  [:> Slide
   [:> Text {:textColor "white"} "Setting Up Your Environment"]
   [:> List
    [:> Appear
     [:> ListItem {:textSize "1.9rem"}
      "Pick a terminal that is easy to access"]]
    [:> Appear
     [:> ListItem {:textSize "1.9rem"}
      "yarn global add shadow-cljs"]]
    [:> Appear
     [:> ListItem {:textSize "1.9rem"}
      "Run " [:span {:style {:color "red"}} "git clone https://github.com/iha2/clojurescript-workshop"]]]]])

(defn slide-five [key]
  ^{:key key}
  [:> Slide
   [:> Text {:textColor "white"} "Starting Up Your REPL"]
   [:> List
    [:> Appear
     [:> ListItem {:textSize "1.9rem"} "Enter " [:span {:style {:color "red"}} "shadow-cljs cljs-repl app"]]]
    [:> Appear
     [:> ListItem {:textSize "1.9rem"} "A successfully load should look like this"]]
    [:> Appear
     [:> ListItem {:textColor "red" :textSize "1.9rem"} "cljs.user=>"]]]])

(def introduction [slide-one
                   slide-two
                   slide-three
                   slide-four
                   slide-five])