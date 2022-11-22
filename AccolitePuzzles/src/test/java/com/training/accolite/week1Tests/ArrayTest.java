package com.training.accolite.week1Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.accolite.week1.Array;


@SpringBootTest
public class ArrayTest {
	
	@Test
	void testcase1(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(5, 4, 1, 2, 3, 4, 5, 1, 3, 5, 6);		
		Array arr = new Array(sc);
		assertEquals(2, arr.run());
	}
	
	@Test
	void testcase2(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(4, 6, 1, 3, 5, 2, 1, 2, 3, 4, 5, 6);		
		Array arr = new Array(sc);
		assertEquals(3, arr.run());			
	}
	
	@Test
	void testcase3(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(3, 3, 1, 2, 3, 3, 2, 1);	
		Array arr = new Array(sc);
		assertEquals(2, arr.run());			
	}	
	
	@Test
	void testcase4(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(6, 3, 1, 2, 3, 4, 5, 6, 3, 5, 1);	
		Array arr = new Array(sc);
		assertEquals(1, arr.run());			
	}
}
