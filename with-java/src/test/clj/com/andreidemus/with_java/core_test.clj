(ns com.andreidemus.with-java.core-test
  (:require [clojure.test :refer :all]
            [com.andreidemus.with-java.core :refer :all])
  (:import (com.andreidemus.with_java.some Some)))

(deftest a-test
  (testing "Testing java code"
    (is (= 5 (Some/method)))))
