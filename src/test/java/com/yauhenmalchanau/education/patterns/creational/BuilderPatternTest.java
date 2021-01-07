package com.yauhenmalchanau.education.patterns.creational;

import com.yauhenmalchanau.education.patterns.creational.builder.BankAccount;
import org.junit.Test;

public class BuilderPatternTest {

    @Test
    public void test() {
        BankAccount bankAccount = new BankAccount
                .BankAccountBuilder("account", "123")
                .withEmail("email")
                .withNewsletter(true)
                .build();

        System.out.println(bankAccount.getEmail());
    }
}
