package com.step.assignments.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Display console = new Console();
        Display pdfPage = new PDFPage();
        Display webPage = new WebPage();
        Display nonInteractiveWebPage = new NonInteractiveWebPage();

        webPage.click();
        nonInteractiveWebPage.click();

        String pdfContent = pdfPage.print();
        String content = nonInteractiveWebPage.print();
        String webPageContent = webPage.print();

        console.display("This is a display from console");
        pdfPage.display(pdfContent);
        webPage.display(webPageContent);
        nonInteractiveWebPage.display(content);

    }
}
