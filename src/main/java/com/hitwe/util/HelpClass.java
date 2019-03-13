package com.hitwe.util;

import org.apache.commons.lang3.RandomStringUtils;

public class HelpClass {
    public static String generateEmail() {
        return RandomStringUtils.random(10, true, false) + "@testmail.com";
    }
}
