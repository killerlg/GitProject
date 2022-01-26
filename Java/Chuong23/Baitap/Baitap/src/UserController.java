public class UserController {
    private UserStorage userStorage;

    public UserController() {
    }

    public UserController(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    public void store(User user) {
        this.userStorage.store(user);
    }
}
