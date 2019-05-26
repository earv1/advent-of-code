(ns part2.core
  (:require [clojure.string :as str]))
(use '[clojure.string :only (join split)])

(defn findFirstRepitition
  "Find first repetition"
  [listWithAdditions]
  (loop [x 0]
    (def listForDuplicateCheck (subvec listWithAdditions 0 x))
     ;;(println listForDuplicateCheck)
    (println (nth listWithAdditions x))
    (if (distinct? (sort listForDuplicateCheck))
      (recur (+ x 1))
      (last listForDuplicateCheck))
    ))

(defn createSumValues
  "Find Repitition Index"
  [list]
  (loop [x 0
         listSumValues []]
    (def currentSum (reduce + (into [] (subvec list 0 x))))
    (if (< x (count list))
    (recur (+ x 1)
           (into [](conj listSumValues currentSum)))
    (into [] listSumValues))))

(defn getAdventInput
  "I get the input from input.txt which is filled with advent of code input"
  []
  (mapv read-string (into [](str/split-lines(slurp "input.txt")))))

(defn foo
  "I don't do a whole lot."
  []
  ;(println (createSumValues (getAdventInput)))
  (findFirstRepitition (createSumValues (getAdventInput))))
