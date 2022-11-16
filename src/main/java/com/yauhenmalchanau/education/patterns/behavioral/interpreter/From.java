package com.yauhenmalchanau.education.patterns.behavioral.interpreter;

import java.util.List;

public class From implements Expression {
  
  private final String table;
  private final Where where;

  public From(String table, Where where) {
    this.table = table;
    this.where = where;
  }

  public From(String table) {
    this.table = table;
    this.where = null;
  }

  @Override
  public List<String> interpret(Context context) {
    context.setTable(this.table);
    if (where != null) {
      return where.interpret(context);
    }
    
    return context.search();
  }
}
