(ns clojure-smssync.server
  (:use compojure.core)
  (:require [compojure.route :as route]
            [cheshire.core :as json]
            [clojure.tools.logging :as log]
            [clj-time.format :as timef]
            [clj-time.coerce :as timec]
            )
  )

(defn handle-sms [request]
  (prn request)
  (let [{:keys [body]} request
        {:keys [from message message_id sent_to secret device_id sent_timestamp]} body
        sent_timestamp (timec/from-long (Long/parseLong sent_timestamp))
        ]
    (log/infof
     "Received SMS from %s at %s:\n%s\n\n"
     from
     (-> (:rfc822 timef/formatters)
         (timef/unparse sent_timestamp))
     message)
    {:payload {:success true :error nil}}
    )
  )

(defroutes all-routes
  (POST "/" params (handle-sms params))
  (route/not-found "Page not found"))
