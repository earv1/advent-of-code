(ns part2.core)
(use '[clojure.string :only (join split)])

(defn findRepititionIndex
  "Find Repitition Index"
  [list]
  (loop [x 0
         uniqueValues []]
    (when (< x (count list))
      (println uniqueValues)
      (println (some list uniqueValues))
      (recur (+ x 1) (into [] (distinct (conj uniqueValues (nth list x))))))))

(defn foo
  "I don't do a whole lot."
  []
  (findRepititionIndex [1 2 3 5 6 7 1 2 1]))
