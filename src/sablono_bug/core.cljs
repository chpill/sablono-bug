(ns sablono-bug.core
  (:require [sablono.core :as sablono]))

(defn my-react-component
  "Dummy function that returns a react component"
  []
  (sablono/html [:span "plop"]))

(def a
  "Here, inlining works just fine"
  (sablono/html [:div
                 {}
                 ^:inline (my-react-component)]))

(def b
  "Here it does not work"
  (sablono/html [:div
                 ^:inline (my-react-component)]))
