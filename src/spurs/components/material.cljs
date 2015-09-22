(ns ^:figwheel-always spurs.component.material
  (:require [spurs.db :refer [app-state]]))

;; material ui test
(defn material []
  [:div
   [:h1 "Material ui test Page"]
   [:div
    ;; button
    [:button {:class "mdl-button mdl-js-button mdl-button--fab mdl-button--colored"}
     [:i.material-icons "add"]]

    [:button {:class "mdl-button mdl-js-button mdl-button--primary"} "Button"]

    ;; badge
    [:span {:class "material-icons mdl-badge"
            :data-badge 1}
     "account_box"]
    ]

   [:a {:href "#/"} "home page"]
   [:br ]
   [:a {:href "#/about"} "about page"]])
