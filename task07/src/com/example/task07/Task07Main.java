package com.example.task07;

public class Task07Main {

    public static final String CHECKED = "checked";
    public static final String UNCHECKED = "unchecked";
    public static final String NONE = "none";

    public static void main(String[] args) {
    }

    public Processor processor;

    public String getExceptionType() {
        try {
            processor.process();
        } catch (Throwable e) {
            if (e instanceof RuntimeException || e instanceof Error) {
                return UNCHECKED;
            } else {
                return CHECKED;
            }
        }
        return NONE;
    }
}