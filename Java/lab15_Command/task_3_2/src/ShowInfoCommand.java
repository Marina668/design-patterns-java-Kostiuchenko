public class ShowInfoCommand implements Command {
    final private Document document;

    public ShowInfoCommand(Document document) {
        this.document = document;
    }

    @Override
    public void execute() {
        if (document != null) {
            document.showInfo();
        }
    }
}