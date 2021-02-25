package prob1;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class W1D1 {
  // Problem statement
  // Find the largest distance between any two even integers in an integer array.
  public static void main(String[] args){
    List<Integer> list = Arrays.asList(1, 2, 4, 5, 6, 10, 20, 30, 19, 27, 43, 13, 28, 17, 38, 29, 72, 143);
    alg1(list);
    alg2(list);
    alg3(list);
    alg4(list);
  }

  // Algorithm 1.
  // Create a new array consisting of even numbers only. Then use nested loops to solve the problem using
  // the newly created array of even numbers only.
  public static Integer alg1(List<Integer> numbers){
    System.out.println("--------------------------------------");
    System.out.println("Alg1");
    Instant start = Instant.now();
    System.out.println("start: " + start.toString());
    List<Integer> numEvens = new ArrayList<>();
    for(int i = 0; i < numbers.size(); i++){
      Integer number = numbers.get(i);
      if (number%2 == 0) {
        numEvens.add(number);
      }
    }

    int largestDistance = 0;
    for(int i = 0; i < numEvens.size() - 1; i++){
      for(int j = 1; j < numEvens.size(); j++) {
        int distance = numEvens.get(i) - numEvens.get(j);
        if(distance < 0)
          distance *= -1;
        if(largestDistance < distance)
          largestDistance = distance;
      }
    }
    Instant end = Instant.now();
    System.out.println("end: " + end.toString());
    System.out.println("Largest Distance: " + largestDistance);
    System.out.println("Duration: " + Duration.between(start, end).toMillis());
    System.out.println("--------------------------------------");

    return largestDistance;
  }

  // Algorithm 2.
  // Use a nested loop to solve the problem without creating an extra array.
  public static Integer alg2(List<Integer> numbers){
    System.out.println("--------------------------------------");
    System.out.println("Alg2");
    Instant start = Instant.now();
    System.out.println("start: " + start.toString());

    int largestDistance = 0;
    for(int i = 0; i < numbers.size() - 1; i++){
      if (numbers.get(i) % 2 != 0) {
        continue;
      }
      for(int j = 1; j < numbers.size(); j++) {
        if (numbers.get(j) % 2 != 0) {
          continue;
        }
        int distance = numbers.get(i) - numbers.get(j);
        if(distance < 0)
          distance *= -1;
        if(largestDistance < distance)
          largestDistance = distance;
      }
    }

    Instant end = Instant.now();
    System.out.println("end: " + end.toString());
    System.out.println("Largest Distance: " + largestDistance);
    System.out.println("Duration: " + Duration.between(start, end).toMillis());
    System.out.println("--------------------------------------");

    return largestDistance;
  }

  // Algorithm 3.
  // Use one loop. Find max and min of even integers. Compute max – min.
  public static Integer alg3(List<Integer> numbers){
    System.out.println("--------------------------------------");
    System.out.println("Alg3");
    Instant start = Instant.now();
    System.out.println("start: " + start.toString());

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for(int i = 0; i < numbers.size() - 1; i++){
      if (numbers.get(i) % 2 != 0) {
        continue;
      }
      int number = numbers.get(i);
      if (max < number)
        max = number;
      if (min > number)
        min = number;
    }
    int largestDistance = max - min;
    if (largestDistance < 0)
      largestDistance = 0;

    Instant end = Instant.now();
    System.out.println("end: " + end.toString());
    System.out.println("Largest Distance: " + largestDistance);
    System.out.println("Duration: " + Duration.between(start, end).toMillis());
    System.out.println("--------------------------------------");

    return largestDistance;
  }

  // Algorithm 4.
  // Use Streams to find the max and min. Compute max – min.
  public static Integer alg4(List<Integer> numbers){
    System.out.println("--------------------------------------");
    System.out.println("Alg4");
    Instant start = Instant.now();
    System.out.println("start: " + start.toString());

    int max = numbers.stream()
                     .filter(x -> x%2 == 0)
                     .max(Comparator.comparing(Integer::valueOf)).get();
    int min = numbers.stream()
                     .filter(x -> x%2 == 0)
                     .min(Comparator.comparing(Integer::valueOf)).get();
    int largestDistance = max - min;

    Instant end = Instant.now();
    System.out.println("end: " + end.toString());
    System.out.println("Largest Distance: " + largestDistance);
    System.out.println("Duration: " + Duration.between(start, end).toMillis());
    System.out.println("--------------------------------------");

    return largestDistance;
  }
}
