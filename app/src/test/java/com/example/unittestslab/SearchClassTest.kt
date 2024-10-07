package com.example.unittestslab

import org.junit.Test
import java.lang.AssertionError

class SearchClassTest {

    private val searchClass = SearchClass()
    @Test
    fun getSearchUrl_isNullable() {
        val nullResult = searchClass.getSearchUrl(null)

        if (nullResult == null){
            print("Success\n")
        }
        else{
            throw AssertionError("Result was not null")
        }
    }

    @Test
    fun getSearchUrl_isCorrect() {
        val result = searchClass.getSearchUrl("toaster")

        if (result != null){
            print("Success\n")
        }
        else{
            throw AssertionError("Result was null")
        }
    }

    @Test
    fun getSearchUrl_hasQuery(){

        val searchPhrase = "toaster"
        val correctQuery = "https://www.google.com/seacrh?q=${searchPhrase}/"

        val result = searchClass.getSearchUrl(searchPhrase)

        if (result == correctQuery){
            print("Success\n")
        }
        else{
            throw AssertionError("Result doesn't contains input phrase")
        }
    }
}