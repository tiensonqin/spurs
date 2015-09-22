(ns spurs.material.toggles)

(defn checkbox
  []
  (fn
    [& {:keys [id checked? label]
        :or {checked? false}}]
    [:label {:class "mdl-checkbox mdl-js-checkbox mdl-js-ripple-effect"
             :for id}
     [:input {:type "checkbox"
              :id id
              :class "mdl-checkbox__input"
              :checked checked?}]
     [:span {:class "mdl-checkbox__label"}
      label]]))

(defn radio
  []
  (fn
    [& {:keys [name value id checked? label]
        :or {checked? false}}]
    [:label {:class "mdl-radio mdl-js-radio mdl-js-ripple-effect"
             :for id}
     [:input {:type "radio"
              :id id
              :class "mdl-radio__button"
              :name name
              :value value
              :checked checked?}]
     [:span {:class "mdl-radio__label"}
      label]]))
