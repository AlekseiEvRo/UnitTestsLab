package com.example.unittestslab

import org.junit.Test
import java.lang.AssertionError

class SearchClassTest {

    private val searchClass = SearchClass()
    @Test
    fun getSearchUrl_isCorrect() {
        val nullResult = searchClass.getSearchUrl(null)

        if (nullResult == null){
            print("Success\n")
        }
        else{
            throw AssertionError("Result was not null")
        }
    }
}