package com.yauhenmalchanau.education.patterns.behavioral.templatemethod;

public class MultipleFieldsFilterCountProcessor extends FilterCountProcessor {

    @Override
    public String getValue(Record record) {
        return record.getField1() + " " + record.getField2();
    }
}
