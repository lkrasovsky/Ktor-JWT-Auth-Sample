package com.example.models.snippets

data class PostSnippet(val snippet: Text) {
    data class Text(val text: String)
}