(ns fact-test.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (def possible-multipliers 
    (for [x (range 2 13) y (range 2 13)] (vector x y)))

  (def random-multipliers (shuffle possible-multipliers))
(println random-multipliers)

(defn pose-question
  [multiplier multiplicand]
  (str multiplier " x " multiplicand " =\n"))

(println (map #(apply pose-question %) random-multipliers))
)

