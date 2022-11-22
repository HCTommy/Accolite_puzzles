package com.training.accolite.week1Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.training.accolite.week1.Matrix;


@SpringBootTest
public class MatrixTest {
	
	@Test
	void testcase1(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(2, 2, 1, 1, 1, 0);		
		Matrix arr = new Matrix(sc);
		int[][] res = arr.run();
		String row0 = Arrays.toString(res[0]);
		String row1 = Arrays.toString(res[1]);
		assertEquals("[1, 1]", row0);
		assertEquals("[1, 1]", row1);		
	}
	
	@Test
	void testcase2(){		
		Scanner sc = mock(Scanner.class);
		when(sc.nextInt()).thenReturn(4, 3, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0);		
		Matrix arr = new Matrix(sc);
		int[][] res = arr.run();
		String row0 = Arrays.toString(res[0]);
		String row1 = Arrays.toString(res[1]);
		String row2 = Arrays.toString(res[2]);
		String row3 = Arrays.toString(res[3]);
		assertEquals("[0, 0, 0]", row0);
		assertEquals("[1, 0, 1]", row1);
		assertEquals("[0, 1, 1]", row2);
		assertEquals("[0, 1, 0]", row3);
	}
}
