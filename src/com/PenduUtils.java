package com;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public final class PenduUtils {

    public static String getRandomWord(){
      List<String> mots = new ArrayList<String>();
      mots.add("bonjour");
      mots.add("aurevoir");
      mots.add("hello");
      
      return mots.get(new Random().nextInt(mots.size()));
    }


    public static String underscoreWord(String lettre, String random, StringBuilder hidden) {
        StringBuilder resultat = new StringBuilder(random);
       

        for (int i = 0; i < random.length(); i++) {
            if (random.charAt(i) == lettre.charAt(0)) {
            	hidden.setCharAt(i, lettre.charAt(0));
            } 
        }
        return hidden.toString();
    }
}
