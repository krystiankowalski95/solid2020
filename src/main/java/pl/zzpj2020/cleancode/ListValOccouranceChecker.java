package pl.zzpj2020.cleancode;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListValOccouranceChecker {

    @Getter
    @Setter
    public Map<Integer, Integer> occurance;

    @Getter
    @Setter
    private int minValue = Integer.MIN_VALUE;

    @Getter
    @Setter
    private int maxValue = Integer.MAX_VALUE;

    public ListValOccouranceChecker() {
        occurance = new HashMap<>();
    }

    public void countOccuranciesInList(List<Integer> list) {
        for (Integer key : list) {
            if (occurance.containsKey(key)) {
                int k = occurance.get(key);
                occurance.put(key, k+1);
            } else {
                occurance.put(key, 1);
            }
            if (key < maxValue) {
                maxValue = key;
            }
            if (key > minValue) {
                minValue = key;
            }
        }
    }
}