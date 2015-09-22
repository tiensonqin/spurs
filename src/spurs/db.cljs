(ns spurs.db
  (:require [reagent.core :refer [atom]]))

(defonce app-state (atom {:text "Hello, what is your name? "
                          :page :nil}))
