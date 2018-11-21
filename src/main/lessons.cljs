(ns main.lessons
  (:require ["spectacle" :as spectacle :refer [Slide Text Appear ListItem List]]
            [reagent.core :as r :refer [adapt-react-class]]))

(defn lesson-1 [key] ^{:key key}
  [:> Slide
   [:> Text  {:textColor "white"} "Equality and Values"]
   [:> List
    [:> Appear [:> ListItem "What does it mean to be equal?"]]
    [:> Appear [:> ListItem "What values exist in Clojurescript?"]]]])

(defn lesson-2 [key] ^{:key key}
  [:> Slide
   [:> Text  {:textColor "white"} "Collections"]
   [:> List
    [:> Appear [:> ListItem "What are the different types of collections?"]]
    [:> Appear [:> ListItem "How do you manipulate collections?"]]]])

(defn lesson-3 [key] ^{:key key}
  [:> Slide
   [:> Text  {:textColor "white"} "Clojurescript Maps"]
   [:> List
    [:> Appear [:> ListItem "What are the equivalent of JavaScript objects?"]]]])

(defn lesson-4 [key] ^{:key key}
  [:> Slide
   [:> Text  {:textColor "white"} "Functions and Recursion"]
   [:> List
    [:> Appear [:> ListItem "What are the basics of executing functions?"]]
    [:> Appear [:> ListItem "How do you work with loops?"]]]])


(def lesson-slides [lesson-1 lesson-2 lesson-3 lesson-4])

