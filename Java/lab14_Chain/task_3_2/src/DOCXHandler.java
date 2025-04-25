public class DOCXHandler extends BaseHandler{
    @Override
    public void open(String file) {
        if(file.endsWith(".docx")){
            System.out.println("Opening DOCX document: " + file);
        } else {
            super.open(file);
        }
    }
}
