#!/usr/bin/env nbb
;; nbb --classpath "src:test:../connector/src" run-tests.cljs
(require '[clojure.test :as t] 'google-drive.connector-test)

(let [{:keys [fail error]} (t/run-tests 'google-drive.connector-test)]
  (js/process.exit (if (pos? (+ fail error)) 1 0)))
