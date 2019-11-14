(ns hello-world.core
  (:require [instaparse.core :as insta])
  (:gen-class))

(def as-and-bs
  (insta/parser
    "S = AB*
     AB = A B
     A = 'a'+
     B = 'b'+"))

(defn -main [& _args]
  (println (as-and-bs "aaaaabbbaaaabb")))
