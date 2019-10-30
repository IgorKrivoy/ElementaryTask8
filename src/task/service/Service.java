package task.service;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public List<Integer> getFibonacciNumbersToDiapason(int border0, int border1) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(border0);
        numbers.add(border0 + 1);
        while (numbers.get(numbers.size() - 1) + numbers.get(numbers.size() - 2) < border1) {
            numbers.add(numbers.get(numbers.size() - 1) + numbers.get(numbers.size() - 2));
        }
        return numbers;
    }

    public List<Integer> findBorders(int n) {
        List<Integer> numbers = new ArrayList<Integer>();
        String num = "1";
        for (int i = 0; i < n - 1; i++) {
            num += "0";
        }
        numbers.add(Integer.parseInt(num));
        numbers.add((Integer.parseInt(num)*10)-1);
        return numbers;
    }

}