package com.yauhenmalchanau.education.patterns.creational.builder;

import com.yauhenmalchanau.education.patterns.creational.builder.BankAccount;
import org.junit.Assert;
import org.junit.Test;

public class BuilderPatternTest {

    @Test
    public void test() {
        BankAccount bankAccount = new BankAccount
                .BankAccountBuilder("account", "123")
                .withEmail("email")
                .withNewsletter(true)
                .build();

        Assert.assertEquals("email", bankAccount.getEmail());
        Assert.assertEquals("account", bankAccount.getName());
        Assert.assertEquals("123", bankAccount.getAccountNumber());
        Assert.assertTrue(bankAccount.isNewsletter());
    }
}
