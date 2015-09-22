(ns spurs.material.slider)

(defn slider
  []
  (fn
    [& {:keys [model min max step tabindex disabled? on-change]
        :or {model 0
             min 0
             max 100
             step 1
             disabled false
             tabindex 0}}]
    [:input {:class "mdl-slider mdl-js-slider"
             :type "range"
             :min min
             :max max
             :value model
             :step step
             :tabindex tabindex
             :disabled disabled?}]))
