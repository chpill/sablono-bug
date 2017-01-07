(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'sablono-bug.core
   :output-to "out/sablono_bug.js"
   :output-dir "out"})
