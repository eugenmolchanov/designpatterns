package com.yauhenmalchanau.education.patterns.behavioral;

import com.yauhenmalchanau.education.patterns.behavioral.templatemethod.MultipleFieldsFilterCountProcessor;
import com.yauhenmalchanau.education.patterns.behavioral.templatemethod.Record;
import com.yauhenmalchanau.education.patterns.behavioral.templatemethod.TypeFilterCountProcessor;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TemplateMethodPatternTest {

    private List<Record> records;

    @Before
    public void init() {
        records = List.of(
                new Record("type1", "some", "field"),
                new Record("type2", "some", "other field"),
                new Record("type3", "absolutely", "different word")
        );
    }

    @Test
    public void shouldTestMultipleFieldsFilter() {
        var multipleFieldsFilter = new MultipleFieldsFilterCountProcessor();
        var result = multipleFieldsFilter.filterRecords(records, "some");
        assertEquals(2, result.size());
        assertTrue(result.containsAll(List.of(
                new Record("type1", "some", "field"),
                new Record("type2", "some", "other field")
        )));
    }

    @Test
    public void shouldTestMultipleFieldsFilterSearchingForSingleRecord() {
        var multipleFieldsFilter = new MultipleFieldsFilterCountProcessor();
        var result = multipleFieldsFilter.filterRecords(records, "absolutely different word");
        assertEquals(1, result.size());
        assertTrue(result.contains(
                new Record("type3", "absolutely", "different word")
        ));
    }

    @Test
    public void shouldTestTypeFilter() {
        var typeFilterCountProcessor = new TypeFilterCountProcessor();
        var result = typeFilterCountProcessor.filterRecords(records, "type3");
        assertEquals(1, result.size());
        assertTrue(result.contains(
                new Record("type3", "absolutely", "different word")
        ));
    }
}
