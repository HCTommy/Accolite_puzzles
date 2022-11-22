package com.training.accolite.week1Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.accolite.week1.PnC;


@SpringBootTest
public class PnCTest {
	
	@Test
	void testcase1(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(2, 2, 2, 0);
		PnC p = new PnC(sc);
		assertEquals(5, p.run());			
	}
	
	@Test
	void testcase2(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(10, 12 ,11 ,8 ,8 ,6 ,6 ,6 ,5 ,3 ,2 ,1);	
		PnC p = new PnC(sc);
		assertEquals(2596, p.run());			
	}
	
	@Test
	void testcase3(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(1, 0, 0);		
		PnC p = new PnC(sc);
		assertEquals(0, p.run());			
	}	
}