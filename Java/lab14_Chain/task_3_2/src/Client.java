public class Client {
    public static void main(String[] args) {

        String[] files = {
                "image.jpg",
                "image.png",
                "document.docx",
                "document.doc",
                "table.xls",
                "table.xlsx",
                "presentation.pptx",
                "document.pdf",
        };


        HandlerManager handlersManager = new HandlerManager();
        Handler handler = handlersManager.getHandler();
        for (String file : files) {
            handler.open(file);
        }


    }
}
