#!/usr/bin/env groovy

new File("/etc/hosts").eachLine { line ->
//println(line)
}

def greeting = "Goodbye";

def sayGoodbye = {theName ->
println("$greeting $theName")}

sayGoodbye("Derek")


