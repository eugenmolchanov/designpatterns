package com.yauhenmalchanau.education.patterns.behavioral.templatemethod;

public class TypeFilterCountProcessor extends FilterCountProcessor {
    @Override
    public String getValue(Record record) {
        return record.getType();
    }
}
