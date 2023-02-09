package com.yauhenmalchanau.education.patterns.behavioral.templatemethod;

import java.util.List;

public abstract class FilterCountProcessor {

    public List<Record> filterRecords(List<Record> records, String term) {
        return records.stream()
                .filter(record -> getValue(record).contains(term))
                .toList();
    }

    public abstract String getValue(Record record);
}
