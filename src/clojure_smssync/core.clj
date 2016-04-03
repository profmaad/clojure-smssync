(ns clojure-smssync.core
  (:require [clojure-smssync.server :as server]
            [compojure.handler :as handler]
            [ring.middleware.json :refer [wrap-json-response wrap-json-body]]
            [ring.middleware.defaults :as defaults])
  (:use ring.adapter.jetty))

(defn -main [& args]
  (-> server/all-routes
      (defaults/wrap-defaults defaults/api-defaults)
      (wrap-json-body {:keywords? true})
      (wrap-json-response {:pretty true})
      (run-jetty {:port 3000})
      )
  )
