package com.smsoft.gof_designpattern.prototypepattern;

// Client
public class DocumentEditor {
    public static void main(String[] args) throws CloneNotSupportedException{
        Document reportTemplate = new ReportDocument("Report Template");
        Document resumeTemplate = new ResumeDocument("Resume Template");

        reportTemplate.display();
        resumeTemplate.display();

        // 보고서 템플릿 clone으로 복사 후 커스텀
        Document customReport = reportTemplate.cloneDocument();
        customReport.editContent("Custom Report!");

        // 이력서 템플릿 clone으로 복사 후 커스텀
        Document customResume = resumeTemplate.cloneDocument();
        customResume.editContent("Custom Resume!");

        customReport.display();
        customResume.display();
    }
}
