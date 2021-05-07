#!/usr/bin/env groovy
def VARIABLE = [1, 2, 3, 4, 5 ]

//(3..1).each {
VARIABLE.each {
    println "Number ${it}"
}
