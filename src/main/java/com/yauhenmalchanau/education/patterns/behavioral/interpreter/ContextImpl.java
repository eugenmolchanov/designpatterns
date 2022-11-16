package com.yauhenmalchanau.education.patterns.behavioral.interpreter;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ContextImpl implements Context {

  private static Map<String, List<Row>> tables = Map.of(
      "people", List.of(
          new Row("John", "Doe"),
          new Row("Jan", "Kowalski"),
          new Row("Dominic", "Doom")
      )
  );

  private String column;
  private String table;
  private Predicate<String> filter;

  @Override
  public void setColumn(String column) {
    this.column = column;
  }

  @Override
  public void setTable(String table) {
    this.table = table;
  }

  @Override
  public void setFilter(Predicate<String> filter) {
    this.filter = filter;
  }

  @Override
  public List<String> search() {
    var result = tables.entrySet().stream()
        .filter(entry -> entry.getKey().equalsIgnoreCase(table))
        .flatMap(entry -> Stream.of(entry.getValue()))
        .flatMap(Collection::stream)
        .map(this::columnMapper)
        .filter(value -> filter == null || filter.test(value))
        .toList();
    
    clear();
    return result;
  }

  private record Row(String givenName, String familyName) {

  }
  
  private void clear() {
    this.column = null;
    this.table = null;
    this.filter = null;
  }

  private String columnMapper(Row row) {
    if (this.column.equals("givenName")) {
      return row.givenName();
    }

    if (this.column.equals("familyName")) {
      return row.familyName();
    }
    
    if (this.column.equals("*")) {
      return row.givenName() + " " + row.familyName();
    }

    throw new IllegalArgumentException();
  }
}
