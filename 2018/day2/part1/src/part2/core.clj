(ns part2.core
  (:require [clojure.string :as str]))
(use '[clojure.string :only (join split)])

(defn getAdventInput
  "I get the input from input.txt which is filled with advent of code input"
  []
  (mapv read-string (into [](str/split-lines(slurp "input.txt")))))


(defn countDoubles
  "Count duplicate letters in a word"
  [stringToCheck]
  (println "amazing")
  )
(defn foo
  "I don't do a whole lot."
  []
  ;(println (createSumValues (getAdventInput)))
  (countDoubles "cvzucihajytomrdkgstfqplqwn"))
