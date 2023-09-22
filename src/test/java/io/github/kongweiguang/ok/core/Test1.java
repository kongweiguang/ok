package io.github.kongweiguang.ok.core;

import io.github.kongweiguang.ok.OK;

public class Test1 {

    public static void main(String[] args) throws Exception {
        extracted();
    }

    private static void extracted() throws Exception {
        final Res send = OK.of()
                .url("http://www.baidu.com")
                .ok();
        System.out.println("send = " + send.bytes());

        System.out.println("send = " + send.stream().read());
    }
}