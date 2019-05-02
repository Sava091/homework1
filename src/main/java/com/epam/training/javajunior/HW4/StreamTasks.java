package com.epam.training.javajunior.HW4;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTasks {
    public String task1(List<String> list) {
        return IntStream.range(0, list.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> i + ". " + list.get(i))
                .collect(Collectors.joining(", "));
    }

    public List<String> task2(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }

    public List<Integer> task3(List<String> list) {
        return list.stream()
                .flatMap(s -> Stream.of(s.split(",")))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public Stream<Long> task4(long a, long c, long m, long seed) {
        return Stream.iterate(seed, n -> 1 * (a * n + c) % m);
    }

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());
        return IntStream.range(0, firstList.size() > secondList.size() ? secondList.size() : firstList.size())
                .mapToObj(i -> Stream.of(firstList.get(i), secondList.get(i)))
                .flatMap(Function.identity());
    }
}
