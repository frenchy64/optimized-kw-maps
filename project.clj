(defproject com.ambrosebs.fast-attr "0.1.0-SNAPSHOT"
  :description "Exploration in Hash Array Mapped Tries."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha13"]
                 [criterium "0.4.4"]
                 [potemkin "0.4.3"]
                 [rhizome "0.2.7"]
                 [collection-check "0.1.6"]
                 [org.clojure/test.check "0.9.0"]
                 ]
  :source-paths ["src/clj"]
  :java-source-paths ["src/java"])
