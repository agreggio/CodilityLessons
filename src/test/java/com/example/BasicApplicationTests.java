package com.example;

import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicApplicationTests {
Solution solution = new Solution();

	@Test
	public void BinaryGap() {

            System.out.println("BinaryGap: " + solution.BinaryGap(1041));
	}
        
        @Test
	public void CyclicRotation() {
            int[] A = {5,4,8,9}; 

            System.out.println("CyclicRotation: " + Arrays.toString(solution.CyclicRotation(A,3)));
	}

}
