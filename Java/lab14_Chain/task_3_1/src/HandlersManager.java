public class HandlersManager {
    public Handler getHandler(){
        Handler guestHandler = new GuestAuthHandler();
        Handler adminHandler = new AdminAuthHandler();
        Handler userHandler = new UserAuthHandler();

        guestHandler.setNext(adminHandler);
        adminHandler.setNext(userHandler);

        return guestHandler;
    }
}
