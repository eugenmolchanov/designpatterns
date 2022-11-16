package com.yauhenmalchanau.education.patterns.behavioral.interpreter;

import java.util.List;
import java.util.function.Predicate;

public class Where implements Expression {
  
  private final Predicate<String> filter;

  public Where(Predicate<String> filter) {
    this.filter = filter;
  }

  @Override
  public List<String> interpret(Context context) {
    context.setFilter(this.filter);
    return context.search();
  }
}
