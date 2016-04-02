(defproject clojure-smssync "0.1.0-SNAPSHOT"
  :description "Endpoint for http://smssync.ushahidi.com/ in clojure"
  :url "https://github.com/profmaad/clojure-smssync"
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot clojure-smssync.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
