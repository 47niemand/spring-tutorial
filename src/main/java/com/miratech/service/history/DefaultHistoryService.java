package com.miratech.service.history;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DefaultHistoryService implements HistoryService {

    private List<String> history = new ArrayList<String>();

    public void addHistoryItem(final String historyItem) {
        history.add(historyItem);
    }

    public void printHistory() {
        for (String aHistory : history) {
            System.out.println(aHistory);
        }
    }


}
