(ns babysite.core
  (:require [ring.adapter.jetty :as jetty])
  (:gen-class))

(defn handler
  "a basic handler"
  [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body (:remote-addr req)})

(defn -main
  ""
  [& _]
  (jetty/run-jetty handler {:port 3000 :join? false}))
