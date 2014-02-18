package com.green.modules.rs.entity;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.context.ActiveProfiles;

import com.green.modules.rs.AbstractIocTest;

@ActiveProfiles("production")
public class EntityTest extends AbstractIocTest{
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(true);
	}

}
