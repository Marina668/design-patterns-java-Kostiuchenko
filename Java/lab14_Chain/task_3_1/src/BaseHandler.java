public class BaseHandler implements Handler{

    private Handler next = null;

    @Override
    final public void setNext(Handler handler) {
        next = handler;
    }

    @Override
    public void handle(Account account) {
        if (next != null) {
            next.handle(account);
        }
    }
}
