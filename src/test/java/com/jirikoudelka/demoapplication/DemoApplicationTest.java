package com.jirikoudelka.demoapplication;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Demo application test
 *
 * @author Jiri Koudelka
 * @since 14.02.2020
 */
class DemoApplicationTest {

	@Test
	void addTwoNumbers() {
		assertThat(DemoApplication.addTwoNumbers(7, 3), is(10));
	}

	@Test
	void multiplyTwoNumbers() {
		assertThat(DemoApplication.multiplyTwoNumbers(5,5), is(25d));
	}
}