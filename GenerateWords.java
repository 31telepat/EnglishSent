package com.company;

public class GenerateWords {
        String[] verb = {"love", "wait", "prefer", "collect", "expect", "demand", "decide", "live", "work", "think", "add", "agree", "arrive", "believe", "hate", "leave"};
        String[] pronoun = {"I", "you", "we", "they", "she", "he", "it" };

        String verbGenerate (){
                String verbRandom = verb[(int)(Math.random()*verb.length)];
                return verbRandom;
        }

        String pronounGenerate(){
                String pronounRandom = pronoun[(int)(Math.random()*pronoun.length)];
                return pronounRandom;
        }


}
