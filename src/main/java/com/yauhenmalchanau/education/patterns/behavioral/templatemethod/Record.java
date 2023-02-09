package com.yauhenmalchanau.education.patterns.behavioral.templatemethod;

import java.util.Objects;

public class Record {

    private String type;
    private String field1;
    private String field2;

    public Record(String type, String field1, String field2) {
        this.type = type;
        this.field1 = field1;
        this.field2 = field2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Record record = (Record) o;
        return Objects.equals(type, record.type) && Objects.equals(field1, record.field1) && Objects.equals(field2, record.field2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, field1, field2);
    }
}
