package org.example.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        Long similarityScore = 0L;

        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        while ((line=br.readLine())!=null) {
            String[] numbers = line.split("   ");
            int first = Integer.parseInt(numbers[0]);
            int second = Integer.parseInt(numbers[1]);

            list.add(first);
            map.put(second,map.getOrDefault(second,0)+1);
        }

        for(int num : list) {
            similarityScore+=num*map.getOrDefault(num,0);
        }

        System.out.println(similarityScore);

        br.close();
    }
}
