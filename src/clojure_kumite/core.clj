(ns clojure-kumite.core
  (:require [clojure.math :as math])
  (:gen-class))


(def player1 {
              :name "Juan"
              :kill 5
              :assist 12
              :streak 4
              })
(def player2 {
              :name "maria"
              :kill 11
              :assist 7
              :streak 5
              })

; Score is calculated as follows:
; Kills are worth 100 points
; assists are worth 50 points
; Streaks are worth 2 ^ n, where n is the number of kills in the streak

(defn score
  "Calculates the score of a player based on kills, assists, and streaks.")

(defn highscore
  "Given a list of players, return a list of player names, in descending order based on score."
  [players] ;TODO
  )


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
