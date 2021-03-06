(defproject doo-with-deps "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.7.0"]
                 [org.clojure/clojurescript "1.7.122"]]

  :plugins [[lein-cljsbuild "1.1.0"]
	    [lein-doo "0.1.6-SNAPSHOT"]
            [lein-figwheel "0.4.1"]]

  :source-paths ["src"]

  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]

  :cljsbuild {
    :builds [{:id "test"
              :source-paths ["src"]
              :compiler {:main doo-with-deps.core
                         :output-to "out/testable.js"
                         :source-map-timestamp true
                         :foreign-libs [{:file "resources/vendor/jquery.js"
                                         :provides ["jquery.core"]}]}}]})
