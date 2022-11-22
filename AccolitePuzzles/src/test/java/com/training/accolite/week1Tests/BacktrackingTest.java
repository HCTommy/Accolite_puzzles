package com.training.accolite.week1Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.accolite.week1.Backtracking;


@SpringBootTest
public class BacktrackingTest {
	
	@Test
	void testcase1(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(6, 2, 2, 4);
		when(sc.next()).thenReturn("000000","010100");		
		Backtracking b = new Backtracking(sc);
		assertEquals(6, b.run());			
	}
	
	@Test
	void testcase2(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(6, 3, 2, 4, 0);
		when(sc.next()).thenReturn("000000","010100","111100");		
		Backtracking b = new Backtracking(sc);
		assertEquals(0, b.run());			
	}
	
	@Test
	void testcase3(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(6, 3, 2, 4, 2);
		when(sc.next()).thenReturn("000000","010100","111100");		
		Backtracking b = new Backtracking(sc);
		assertEquals(1, b.run());			
	}	
}
