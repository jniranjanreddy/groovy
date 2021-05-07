#!/usr/bin/env groovy
//import hudson.AbortException
def dep_yaml = readYaml file: "deployment.yaml"
                   println( dep_yaml )

