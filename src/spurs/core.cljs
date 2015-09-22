(ns ^:figwheel-always spurs.core
  (:require-macros [secretary.core :refer [defroute]])
  (:import goog.History)
  (:require [reagent.core :as reagent]
            [spurs.db :refer [app-state]]
            [secretary.core :as secretary]
            [goog.events :as events]
            [goog.history.EventType :as EventType]
            [spurs.component.home :refer [home]]
            [spurs.component.about :refer [about]]
            [spurs.component.material :refer [material]]
            [cljsjs.material]))

(enable-console-print!)

;; routing
(defn hook-browser-navigation! []
  (doto (History.)
    (events/listen
     EventType/NAVIGATE
     (fn [event]
       (secretary/dispatch! (.-token event))))
    (.setEnabled true)))

(defn app-routes []
  (secretary/set-config! :prefix "#")

  (defroute "/" []
    (swap! app-state assoc :page :home))

  (defroute "/about" []
    (swap! app-state assoc :page :about))

  (defroute "/material" []
    (swap! app-state assoc :page :material))

  (hook-browser-navigation!))

;; views

(defmulti page #(:page @app-state))
(defmethod page :home [] [home])
(defmethod page :about [] [about])
(defmethod page :material [] [material])
(defmethod page :default [] [:div ])

;; initialize app
(defn ^:export main []
  (app-routes)
  (hook-browser-navigation!)
  (reagent/render [page]
                  (.getElementById js/document "app")))
