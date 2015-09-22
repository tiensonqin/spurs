(ns ^:figwheel-always spurs.material.core
  (:require
   [spurs.material.buttons :as buttons]
   [spurs.material.badges :as badges]
   [spurs.material.cards :as cards]
   [spurs.material.slider :as slider]
   [spurs.material.toggles :as toggles]
   ))

(def button (buttons/button))
(def badge (badges/badge))
(def card (cards/card))
(def slider (slider/slider))
(def checkbox (toggles/checkbox))
(def radio (toggles/radio))
