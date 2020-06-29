package com.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.Models.User;

class UserTEst {

	@Test
	void test() {
		User u = new User("asdasd", "asdasd", "asdad@gmail.com");
		User d = new User("asdasd", "asdasd", "asdad@gmail.com");
		assertEquals(true, u.equals(d), "Passed");
	}

}
