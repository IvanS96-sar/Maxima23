package org.example;

public class Zadanie3 {
    public static void main(String[] args)  {
        try {
            System.out.println(findUserById(3));
        }catch (UserNotFoundException e){
            System.err.println( e.getMessage());
        }
    }

    /**
     * метод для поиска пользователя
     * @param userId идентификатор пользователя
     * @return возвращает идентификатор пользователя,если пользователь найден
     * @throws UserNotFoundException выбрасываем исключение если пользователь не найден
     */
    public static int findUserById(int userId) throws UserNotFoundException {
        if (userId < 0) {
            throw new UserNotFoundException("Пользователь не найден");
        } else {
            System.out.print("Пользватель найден с идентификатором:");
            return userId;
        }
    }
}
