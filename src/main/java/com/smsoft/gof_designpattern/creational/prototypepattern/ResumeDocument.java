package com.smsoft.gof_designpattern.creational.prototypepattern;

// Contrete Prototype - Resume (이력서 템플릿)
public class ResumeDocument implements Document{
    private String content;

    public ResumeDocument(String content) {
        this.content = content;
    }

    @Override
    public Document cloneDocument() throws CloneNotSupportedException {
        return (Document) super.clone();
    }

    @Override
    public void editContent(String newContent) {
        this.content = newContent;
    }

    @Override
    public void display() {
        System.out.println("Resume Content : " + content);
    }
}
