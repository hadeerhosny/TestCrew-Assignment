package com.stctv.subscribe.utils;

import com.stctv.subscribe.factory.PageObjectManager;

public class TestContext {

    private final PageObjectManager pageObjectManager;

    public TestContext(PageObjectManager pageObjectManager) {
        this.pageObjectManager = pageObjectManager;
    }





    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
