#!/usr/bin/env groovy
class GroovyTut {
   static void main(String[] arga){
     def name = "groovy"
      //println("My Name is: " + name[0..2])
      //def age = '''20 25 30'''
      //println(++age)
      //println("age++ = " + (age++));
      //println("++age = " + (++age))
      //println("My name is: " +  name.toUpperCase())
      //println("My name is: " +  name.toLowerCase())
      //println("My name is: " +  name.length())
      println(name.toList()) // to make list
      println(name.replaceAll('groovy', 'python'))
      println("Groovy <=> groovy")
      printf("A %s string \n", name) //printf
      
      
   }

}