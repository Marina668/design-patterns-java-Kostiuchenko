public class BaseHandler implements Handler{

    private Handler next = null;

    @Override
    final public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void open(String file) {
        if (next != null) {
            next.open(file);
        }
    }
}
