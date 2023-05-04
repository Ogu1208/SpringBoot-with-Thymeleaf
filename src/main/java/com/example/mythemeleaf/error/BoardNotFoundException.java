package com.example.mythemeleaf.error;

class BoardNotFoundException extends RuntimeException {

    BoardNotFoundException(Long id) {
        super("Could not find employee " + id);
    }
}