(ns learn-selenium.core
  (:use [clj-webdriver.taxi])
  #_(:import [org.openqa.selenium.By]
           [org.openqa.selenium.WebDriver]
           [org.openqa.selenium.WebElement]
           [org.openqa.selenium.firefox.FirefoxDriver]
           [org.openqa.selenium.support.ui.ExpectedCondition]
           [org.openqa.selenium.support.ui.WebDriverWait]
           ))

;(new-driver {:browser :firefox})

;(def my-driver (org.openqa.selenium.firefox.FirefoxDriver.))

;(.get my-driver "http://www.sohu.com")

(set-driver! {:browser :firefox} "http://www.sohu.com")


(def x (+ 1 2 3))

(map #(+ 1 %) [1 2 3])


(+ 1 2 3 4 5)

{:x 2
 :y 'b}









