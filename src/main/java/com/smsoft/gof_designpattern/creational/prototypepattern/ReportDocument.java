package com.smsoft.gof_designpattern.creational.prototypepattern;

// Contrete Prototype - Report (보고서 템플릿)
public class ReportDocument implements Document{
    private String content;

    public ReportDocument(String content) {
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
        System.out.println("Report Content : " + content);
    }
}
