#!/usr/bin/env groovy

new File("/etc/hosts").eachLine { line ->
//println(line)
}

def greeting = "Goodbye"

def sayGoodbye = {theName ->
println("$greeting $theName")}

sayGoodbye("Derek")

Boolean isDevelop = false
Boolean isProduction = false
def branchName = "production"

isDevelop = branchName == 'develop'
isProduction = branchName == 'production'


targetEnvCluster = (isProduction) ? 'production' : 'develop'
println(targetEnvCluster)