package com.example.pc_3.studygroup;

import org.junit.Test;
import org.mockito.Mock;

import static junit.framework.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by PC-3 on 14/09/2017.
 */

public class MathUtilsMockTest {
    @Mock
    MathUtils math = mock(MathUtils.class);

    @Test
    public void addition_isCorrect() throws Exception {
        int sum = math.addition(anyInt(), anyInt());
        verify(math).addition(anyInt(), anyInt());
        assertEquals(sum, 0);
    }

    @Test
    public void sub_isCorrect() throws Exception {
        int sub = math.sub(anyInt(), anyInt());
        verify(math).sub(anyInt(), anyInt());
        assertEquals(sub, 0);
    }
}
