package com.cc.java;

public class App {
    
    public static void main(String[] args) {
     

        Konto konto = new Konto();

        int stand = konto.getZahl();
        int neuZahl = stand * 2;

        output("Alter Stand:" + stand + " Neuer Stand:" + neuZahl);



        Konto konto2 = new Konto();
        
        int neuZahl2 = konto2.getZahl() * 3;

        output("Alter Stand:" + stand + " Neuer Stand:" + neuZahl2);



        Konto konto3 = new Konto();

        int neuZahl3 = konto3.getZahl() * 10;
        output("Alter Stand:" + stand + " Neuer Stand:" + neuZahl3); 

    }

       


    public static void output(String outputStr) {
        System.out.println(outputStr);
    }


 
}


