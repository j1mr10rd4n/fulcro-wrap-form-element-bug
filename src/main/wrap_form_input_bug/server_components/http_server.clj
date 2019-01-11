(ns wrap-form-input-bug.server-components.http-server
  (:require
    [wrap-form-input-bug.server-components.config :refer [config]]
    [wrap-form-input-bug.server-components.middleware :refer [middleware]]
    [mount.core :refer [defstate]]
    [org.httpkit.server :as http-kit]))

(defstate http-server
  :start (http-kit/run-server middleware (:http-kit config))
  :stop (http-server))
