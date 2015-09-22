(ns ^:figwheel-always spurs.component.home
  (:require [spurs.db :refer [app-state]]))

(defn home []
  [:div [:h1 "Home Page"]
   [:div (:text @app-state) "FIXME"]
   [:a {:href "#/about"} "about page"]
   [:a {:href "#/material"} "material ui test"]
   ])
