package com.yauhenmalchanau.education.patterns.behavioral.interpreter;

import java.util.List;
import java.util.function.Predicate;

public interface Context {
  
  void setColumn(String column);
  
  void setTable(String table);
  
  void setFilter(Predicate<String> filter);
  
  List<String> search();

}
