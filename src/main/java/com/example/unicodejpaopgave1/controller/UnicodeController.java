package com.example.unicodejpaopgave1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UnicodeController {

    @GetMapping("/unicode/{i}")
    public String unicodeToChar(@PathVariable int i) {
        char c = (char) i;
        return "unicode = " + i + " char = " + c;
    }

    @GetMapping("/char/{c}")
    public String chartoUnicode(@PathVariable char c) {
        int i = (int) c;
        return "char = " + c + " unicode = " + i;
    }


}
