package com.example.unicodejpaopgave1.config;


import com.example.unicodejpaopgave1.model.Unicode;
import com.example.unicodejpaopgave1.repository.UnicodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Component
public class InitData implements CommandLineRunner {



    @Autowired
    UnicodeRepository unicodeRepository;



    @Override
    public void run(String... args) throws Exception {


        for (char ch = 'A'; ch <= 'Z'; ch++) {
            Unicode unicodeUpper = new Unicode();
            unicodeUpper.setUnicode((int) ch);
            unicodeUpper.setBogstav(ch);
            unicodeRepository.save(unicodeUpper);
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            Unicode unicodeLower = new Unicode();
            unicodeLower.setUnicode((int) ch);
            unicodeLower.setBogstav(ch);
            unicodeRepository.save(unicodeLower);
        }


//        Unicode unicode = new Unicode();
//        unicode.setUnicode(97);
//        unicode.setBogstav('a');
//        unicode.setName("Dette er et a");
//        unicode.setDescription("Mit ynglings bogstav");
//        unicodeRepository.save(unicode);
//
//        unicode.setUnicode(98);
//        unicode.setBogstav('b');
//        unicodeRepository.save(unicode);






        }



}
