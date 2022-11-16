package com.yauhenmalchanau.education.patterns.behavioral.interpreter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.junit.Test;

public class InterpreterPatternTest {

  @Test
  public void shouldReturnNames() {
    Expression query = new Select("givenName", new From("people"));
    Context ctx = new ContextImpl();
    var result = query.interpret(ctx);
    assertEquals(3, result.size());
    assertTrue(result.containsAll(List.of("John", "Jan", "Dominic")));
  }

  @Test
  public void shouldReturnFamilyNames() {
    Expression query = new Select("familyName", new From("people"));
    Context ctx = new ContextImpl();
    var result = query.interpret(ctx);
    assertEquals(3, result.size());
    assertTrue(result.containsAll(List.of("Doom", "Kowalski", "Doe")));
  }

  @Test
  public void shouldReturnFullNames() {
    Expression query = new Select("*", new From("people"));
    Context ctx = new ContextImpl();
    var result = query.interpret(ctx);
    assertEquals(3, result.size());
    assertTrue(result.containsAll(List.of("Dominic Doom", "Jan Kowalski", "John Doe")));
  }

  @Test
  public void shouldReturnGivenNamesStartsWithJ() {
    Expression query = new Select("givenName",
        new From("people", new Where(name -> name.startsWith("J"))));
    Context ctx = new ContextImpl();
    var result = query.interpret(ctx);
    assertEquals(2, result.size());
    assertTrue(result.containsAll(List.of("Jan", "John")));
  }

}
