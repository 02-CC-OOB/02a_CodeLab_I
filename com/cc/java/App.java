package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     

        Konto konto = new Konto();

        int oldMon = konto.getZahl();
        int newMonl = oldMon * 2;

        output("Alter Stand:" + oldMon + " Neuer Stand:" + newMonl);



        Konto konto2 = new Konto();
        
        int newMon2 = konto2.getZahl() * 3;
        output("Alter Stand:" + oldMon + " Neuer Stand:" + newMon2);



        Konto konto3 = new Konto();

        int newMon3 = konto3.getZahl() * 10;
        output("Alter Stand:" + oldMon + " Neuer Stand:" + newMon3); 

    }

       


    public static void output(String outputStr) {
        System.out.println(outputStr);
    }


 
}


