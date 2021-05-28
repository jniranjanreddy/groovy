#!/usr/bin/env groovy
//example 1
def foo = 42
    assert foo == 42

//example-2
//def (a, b, c) = [10, 20, 'foo']
//assert a == 10 && b == 20 && c == 'foo' 

//example-3
def (int i, String j) = [10, 'foo']
assert i == 10 && j == 'foo'

//example-4
def nums = [1, 3, 5]
def a, b, c
(a, b, c) = nums
assert a == 1 && b == 3 && c == 5