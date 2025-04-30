public class SaveCommand implements Command {
    final private Document document;

    public SaveCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        if (document != null) {
            document.save();
        }
    }
}
