package com.epam.training.javajunior.HW4;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class StreamTasksTest {
    private StreamTasks tasks;

    @Before
    public void init() {
        tasks = new StreamTasks();
    }

    @Test
    public void testTask1() {
        List<String> names = Arrays.asList("Ivan", "Peter", "Jon", "Sam", "Tony", "Bruce");
        String actualResult = tasks.task1(names);
        assertEquals("1. Peter, 3. Sam, 5. Bruce", actualResult);
    }

    @Test
    public void testTask2() {
        List<String> list = Arrays.asList("acv", "gty", "ytr", "zsd", "1as", "3fg");
        List<String> actualResult = tasks.task2(list);
        assertArrayEquals(new String[]{"ZSD", "YTR", "GTY", "ACV", "3FG", "1AS"}, actualResult.toArray());
    }

    @Test
    public void testTask3() {
        List<String> list = Arrays.asList("1, 2, 0", "4, 5", "8, 9, 10");
        List<Integer> actualResult = tasks.task3(list);
        assertArrayEquals(new Integer[]{1, 2, 0, 4, 5, 8, 9, 10}, actualResult.toArray());
    }

    @Ignore
    @Test
    public void testTask4() {
        tasks.task4(25_214_903_917L, 11L, (long)Math.pow(2, 48), 0).limit(30).forEach(System.out::println);
    }

    @Test
    public void testZip() {
        Stream<Integer> first = Stream.of(1, 2, 3, 4, 5);
        Stream<Integer> second = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> stream = StreamTasks.zip(first, second);
        assertArrayEquals(new Integer[] {1, 1, 2, 2, 3, 3, 4, 4, 5, 5}, stream.toArray());
    }
}