#!/usr/bin/env groovy
def filePath = readFile "test001"                   
                  def lines = filePath.readLines() 
                  for (line in lines)   
                    sh "echo $line"
