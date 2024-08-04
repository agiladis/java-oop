package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BusinessLogicTest {
    private DataService dataServiceMock;
    private BusinessLogic businessLogic;

    @BeforeEach
    void setup() {
        // create mock object for DataService
        dataServiceMock = Mockito.mock(DataService.class);
        // initiate BusinessLogic with mock DataService
        businessLogic = new BusinessLogic(dataServiceMock);
    }

    @Test
    void testCalculateDataSizeWithData() {
        // set behaviour mock for fetchData
        when(dataServiceMock.fetchData()).thenReturn(Arrays.asList("one", "two", "three"));

        // test calculateDataSize
        int size = businessLogic.calculateDataSize();

        // verified the result
        assertEquals(3, size);

        // makesure fetchData called once
        verify(dataServiceMock, times(1)).fetchData();
    }

    @Test
    void testCalculateDataSizeWithNoData() {
        // set behaviour mock for fetchData
        when(dataServiceMock.fetchData()).thenReturn(Collections.emptyList());

        // test calculateDataSize
        int size = businessLogic.calculateDataSize();

        // verified the result
        assertEquals(0, size);

        // makesure fetchData called once
        verify(dataServiceMock, times(1)).fetchData();
    }
}
