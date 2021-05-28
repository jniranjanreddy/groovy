#!/usr/bin/env groovy
try {
    def a = 'Hello'   // this will generate an exception
    assert a == 'Hell'     // asserting that this point should never be reached
} catch ( e ) {
    assert e in NumberFormatException
}