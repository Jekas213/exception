public class Main {
    public static void main(String[] args) {
        boolean check = check("Da2_2hf", "fF2hg_jvjhvjhv", "fF2hg_jvjhvjhv");
        System.out.println(check);

    }

    public static boolean checkLoginAndPassword(String login) {
        if (login.matches("\\w+")) {
            return true;
        } else return false;
    }

    public static boolean check(String login, String password, String confirmPassword) {
        try {
            if (login.length() > 20) {
                throw new WrongLoginException();
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException e) {
            System.out.println("Логин больше 20 символов");
            return false;
        } catch (WrongPasswordException q) {
            System.out.println("Пароли не совпадают");
            return false;
        }
        if (password.length() >= 20) {
            return false;
        }
        if (checkLoginAndPassword(login) && checkLoginAndPassword(password)) {
            return true;
        } else return false;
    }

}