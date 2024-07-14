package org.example;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class BusinessLogic {
    private DataService dataService;

    public int calculateDataSize() {
        List<String> data = dataService.fetchData();
        return data.size();
    }
}
