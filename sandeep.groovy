#!/usr/bin/env groovy

def myList[] = new File("/etc/hosts").eachLine { line ->
//println(line)
}

