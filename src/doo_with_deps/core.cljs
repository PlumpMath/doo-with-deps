(ns doo-with-deps.core
  (:require [cljs.test :refer-macros [deftest is testing]]
            [doo.runner :refer-macros [doo-tests]]
            [jquery.core]))

(enable-console-print!)

(deftest external-deps 
  (testing "When starting the application, jQuery is present"
    (is (exists? js/$))))

(doo-tests 'doo-with-deps.core)
