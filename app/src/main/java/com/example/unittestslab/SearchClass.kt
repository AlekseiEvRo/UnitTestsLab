package com.example.unittestslab

class SearchClass {
    fun getSearchUrl(query:String?): String? {

        if (query == null){
            return query
        }

        return "https://www.google.com/seacrh?q=${query}/"
    }
}