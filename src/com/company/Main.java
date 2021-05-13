package com.company;

public class Main {
    public static User[] users = {
            new User("3333")
            , new User("3333")
            , new User("0000") //правильный ответ
            , new User("2222")

    };
    public static int counter = 1;
    public static void main(String[] args) {
	// write your code
        for (int i = 0; i < users.length; i++) {
            if (counter <= 3){
                if (users[i].getPassword().equals(new User().getDefaultPassword())){
                    System.out.println("Welcome");
                    break;
                }
                else {
                    System.out.println("Wrong Password");
                }
                counter++;
            }
            else {
                try {
                    throw new LimitException(" You Blocked ");
                } catch (LimitException e) {
                    System.out.println(e.getMessage());;
                }
            }
        }



    }
}
