package ui.tests;

import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;

@Slf4j
public class FirstTest {

    @Test
    public void passedTest() {
        log.info("passed test");
        Assert.assertTrue(true, "positive case");

    }

    @Test
    public void failedTest() {
        log.info("failed test");
        Assert.assertFalse(true, "failed");
    }

    //https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html#license-lightbox
}
