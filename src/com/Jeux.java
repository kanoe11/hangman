package com;

import java.util.Scanner;

public class Jeux {
    private int countTry = 0;
    private  boolean gameover = true;
    private String mot;
    private StringBuilder hiddenWord;
    
    public Jeux() {
    	// init
    	this.mot = PenduUtils.getRandomWord();
    	this.countTry = this.mot.length();
    	this.hiddenWord  = new StringBuilder(mot);
    	
    	 for (int i = 0; i < mot.length(); i++) {
                 hiddenWord.setCharAt(i, '_');
             } 
         }


    public int essai( String random, String lettre) {

        for (int i = 0; i < random.length(); i++) {
            if ( lettre.charAt(0) == random.charAt(i)) {
                return this.countTry;
            } 
        }
        //
        return this.countTry -1;
    }

    public void partie(){
        Scanner sc = new Scanner(System.in);
        String userinput = "";
        
       while( this.countTry != 0  && this.hiddenWord.toString().indexOf('_')>0){
            System.out.println("veuillez tapez une lettre");
            userinput = sc.nextLine();
            String underscore = PenduUtils.underscoreWord(userinput , this.mot, this.hiddenWord); 
            this.countTry = essai(mot ,  userinput);
            System.out.println(underscore + " Il vous reste "+this.countTry + " essais");
            if (this.countTry == 0) {
            	System.out.println("partie perdue");
            	break;
            }
        }
    }
}
