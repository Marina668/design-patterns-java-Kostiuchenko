public class HandlerManager {
    public Handler getHandler() {
        Handler jpgHandler = new JPGHandler();
        Handler pngHandler = new PNGHandler();
        Handler docHandler = new DOCHandler();
        Handler docxHandler = new DOCXHandler();
        Handler pdfHandler = new PDFHandler();
        Handler pptxHandler = new PPTXHandler();
        Handler xlsHandler = new XLSHandler();
        Handler xlsxHandler = new XLSXHandler();


        jpgHandler.setNext(pngHandler);
        pngHandler.setNext(docHandler);
        docHandler.setNext(docxHandler);
        docxHandler.setNext(pdfHandler);
        pdfHandler.setNext(pptxHandler);
        pptxHandler.setNext(xlsHandler);
        xlsHandler.setNext(xlsxHandler);

        return jpgHandler;
    }
}
