(ns ^:figwheel-always spurs.material.buttons)

(defn button
  []
  (fn
    [& {:keys [label tooltip tooltip-position class on-click disabled? style attr]
        :or {label "button"
             class "mdl-button mdl-js-button mdl-button--raised mdl-js-ripple-effect mdl-button--accent"}}]
    (let [opts {:class class}
          opts (if disabled? (assoc opts :disabled true) opts)]
      [:button {:class class}
      label])))
