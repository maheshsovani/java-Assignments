package com.step.assignments.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Console pdfPage = new PDFPage();
        Console webPage = new WebPage();
        Console nonInteractiveWebPage = new NonInteractiveWebPage();

        webPage.click();
        nonInteractiveWebPage.click();

        String pdfContent = pdfPage.print();
        String content = nonInteractiveWebPage.print();
        String webPageContent = webPage.print();

        pdfPage.display(pdfContent);
        webPage.display(webPageContent);
        nonInteractiveWebPage.display(content);

    }
}
