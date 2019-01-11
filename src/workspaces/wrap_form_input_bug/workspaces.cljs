(ns wrap-form-input-bug.workspaces
  (:require
    [nubank.workspaces.core :as ws]
    [wrap-form-input-bug.demo-ws]))

(defonce init (ws/mount))
