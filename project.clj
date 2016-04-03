(defproject clojure-smssync "0.1.0-SNAPSHOT"
  :description "Endpoint for http://smssync.ushahidi.com/ in clojure"
  :url "https://github.com/profmaad/clojure-smssync"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.logging "0.3.1"]
                 [cheshire "5.5.0"]
                 [compojure "1.5.0"]
                 [ring/ring-jetty-adapter "1.4.0"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-defaults "0.2.0"]
                 [clj-time "0.11.0"]
                 ]
  :main ^:skip-aot clojure-smssync.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
