(defproject with-java "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [junit/junit "4.12"]]
  :source-paths ["src" "src/main/clj"]
  :java-source-paths ["src/main/java"] ; <--- here
  :test-paths ["test" "src/test/clj"]
  :resource-paths ["src/main/resource"])
