package com.rohit.stockTracker.Constants;

public enum Constant {
    SHARELIST("shareList", "/home/rohit.goyla/Downloads/Untitled Folder/SeleniumJavaFramework/txtfile/sharenames.txt");

    private String key;
    private String value;

    private Constant(String key, String value) {
        this.key = key;
        this.value = value;
    }
    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}
