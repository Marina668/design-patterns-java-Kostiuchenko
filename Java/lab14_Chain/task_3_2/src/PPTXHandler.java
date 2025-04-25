public class PPTXHandler extends BaseHandler{
    @Override
    public void open(String file) {
        if(file.endsWith(".pptx")){
            System.out.println("Opening PPTX presentation: " + file);
        } else {
            super.open(file);
        }
    }
}
