package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharData {

    private List<String> nameList = new ArrayList<>();
    private Map<String,Integer> scoreMap = new HashMap<>();
    private Map<String,Integer> modifierMap = new HashMap<>();

    public void addCharacter() throws IOException {
        try(BufferedReader brr = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Input name");
            String name = brr.readLine();
            nameList.add(name);
            System.out.println("Input score");
            scoreMap.put(name, Integer.parseInt(brr.readLine()));
            System.out.println("Input modifier");
            modifierMap.put(name, Integer.parseInt(brr.readLine()));
            System.out.println(nameList);
            int i = scoreMap.get(nameList.get(0))+modifierMap.get(nameList.get(0));
            System.out.println(i);
        }

    }

    public List<String> getNameList() {
        return nameList;
    }

    public Map<String, Integer> getScoreMap() {
        return scoreMap;
    }

    public Map<String, Integer> getModifierMap() {
        return modifierMap;
    }
}
