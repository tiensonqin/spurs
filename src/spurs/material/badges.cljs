(ns ^:figwheel-always spurs.material.badges)

(defn badge
  []
  (fn
    [& {:keys [label data tooltip tooltip-position class on-click disabled? style attr]
        :or {label "account_box"
             class "material-icons mdl-badge"
             data 1}}]
    [:span {:class class
            :data-badge data}
     label]))
