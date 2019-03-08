package com;

import java.util.Random;

public class Mots {
   public String[] mots = {"douche" , "fragment" , "album" , "jardin" , "partition"};
   String word;


   public String randonWords(){
       int rnd = new Random().nextInt(mots.length);
       String random = (mots[rnd]);
       return random;

   }

   public String underscoreword(String userinput, String random){
       StringBuilder resultat = new StringBuilder(random);
       char underscore =  '_';

       for (int i = 0 ; i < random.length(); i++ ) {
           if (random.charAt(i) == userinput.charAt(0)){
               resultat.setCharAt(i,userinput.charAt(0));
           } else{
               resultat.setCharAt(i, underscore);
           }
       }

      return resultat.toString();
   }

}
