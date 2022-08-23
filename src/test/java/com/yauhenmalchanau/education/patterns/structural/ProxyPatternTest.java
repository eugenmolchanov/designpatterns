package com.yauhenmalchanau.education.patterns.structural;

import com.yauhenmalchanau.education.patterns.structural.proxy.ExpensiveObject;
import com.yauhenmalchanau.education.patterns.structural.proxy.ExpensiveObjectProxy;
import org.junit.Test;

public class ProxyPatternTest {

  @Test
  public void shouldCreateExpensiveObjectOnce() {
    ExpensiveObject expensiveObject = new ExpensiveObjectProxy();
    expensiveObject.process();
    expensiveObject.process();
  }

}
