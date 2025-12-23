package com.tka.controller;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.tka.Players.Players;
import com.tka.Services.IPLServices;

public class IPLController {

    public static void main(String[] args) {

        IPLServices ip = new IPLServices();

        
        List<Players> miPlayers = ip.getPlayers("mi");
        List<Players> countryPlayers = ip.getPlyersByCountry("South Africa");
        List<Players> mostRuns = ip.getPlyersByHighestRuns(5000);

       
        Set<Players> hashSet = new HashSet<>();
        hashSet.addAll(miPlayers);

        System.out.println("HashSet MI players: ");
        for (Players p : hashSet) {
            System.out.println(p.getName() + " : " + p.getCname());
        }

       
        Set<Players> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(countryPlayers);

        System.out.println("\nLinkedHashSet Country players : ");
        for (Players p : linkedHashSet) {
            System.out.println(p.getName() + " : " + p.getCname());
        }
        System.out.println("\nPlayers runs greater than 5000: ");
       for(Players p:mostRuns) {
    	   System.out.println(p.getName()+" : "+p.getTname()+" : "+p.getRuns());
       }
        
    }
}
