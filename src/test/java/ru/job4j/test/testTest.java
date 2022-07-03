package ru.job4j.test;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class testTest {

    @Test
    public void whenOnePlusOneThenTwo() {
       Main test = new Main();
       int result = test.sum(1, 1);
       assertThat(result, is(2));
    }
}