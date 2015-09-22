(ns spurs.component.about
  (:require [spurs.db :refer [app-state]]))

(defn about []
  [:div [:h1 "About Page"]
   [:a {:href "#/"} "home page"]])
