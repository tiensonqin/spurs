(ns spurs.material.cards)

(defn card
  []
  (fn
    [& {:keys [title supporting-text action-text share?]}]
    [:div {:class "mdl-card mdl-shadow--2dp"}
     (when title
       [:div {:class "mdl-card__title"}
        [:h2 {:class "mdl-card__title-text"}
         title]])
     (when supporting-text
       [:div {:class "mdl-card__supporting-text"}
        supporting-text])
     (when action-text
       [:div {:class "mdl-card__actions mdl-card--border"}
        [:a {:class "mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect"}
         action-text]])

     (when share? [:div {:class "mdl-card__menu"}
                   [:button {:class "mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect"}
                    [:i {:class "material-icons"}
                     "share"]]])]))
