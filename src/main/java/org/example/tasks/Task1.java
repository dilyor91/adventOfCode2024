package org.example.tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.PriorityQueue;

public class Task1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        String line;
        Long totalDistance = 0L;

        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        while ((line = br.readLine())!=null) {

            String[] numbers = line.split("   ");

            pq1.add(Integer.parseInt(numbers[0]));
            pq2.add(Integer.parseInt(numbers[1]));
        }

        while (!pq1.isEmpty()&&!pq2.isEmpty()) {
            int first = pq1.poll();
            int second = pq2.poll();
            totalDistance+=Math.abs(first-second);
        }

        System.out.println(totalDistance);

        br.close();
    }
}
