(ns ^:figwheel-always spurs.components.material
  (:require [spurs.db :refer [app-state]]
            [spurs.material.core :refer [button badge card slider checkbox
                                         radio]]))

;; material ui test
(defn material []
  [:div
   [:h1 "Material Design Lite"]
   [:div
    [:section
     [:h3 "Button"]
     [:nav {:class "section-content"}
      ;; button
      [button]

      [button :label "label-button"]

      [button :label "label-disabled-button"
       :class "mdl-button mdl-js-button mdl-button--raised"
       :disabled? true]]]

    [:section
     [:h3 "Badge"]
     [:nav {:class "section-content"}
      [badge]

      [badge :data 2]

      [badge :data "♥"]]]

    [:section
     [:h3 "Cards"]
     [:nav {:class "section-content"}
      [card
       :title "Welcome"
       :supporting-text "Lorem ipsum dolor sit amet, consectetur adipiscing elit.Mauris sagittis pellentesque lacus eleifend lacinia..."
       :action-text "Get Started"
       :share? true]]]

    [:section
     [:h3 "Slider"]
     [:nav {:class "section-content"}
      [:p {:style {:width "300px"}}
       [slider]]

      [:p {:style {:width "300px"}}
       [slider :model 25]]]]

    [:section
     [:h3 "Checkbox"]
     [:nav {:class "section-content"}
      [checkbox
       :id "favorites-1"
       :label "Spurs"
       :checked? true]
      [checkbox
       :id "favorites-2"
       :label "Sun"
       :checked? true]
      [checkbox
       :id "favorites-3"
       :label "Lakers"
       :checked? true]]]

    [:section
     [:h3 "Radio"]
     [:nav {:class "section-content"}
      [radio
       :name "gender"
       :value "female"
       :id "female"
       :label "female"]
      [radio
       :name "gender"
       :value "male"
       :id "male"
       :label "male"]
      ]]
    ]])
