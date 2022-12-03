

import java.util.Iterator;
import java.util.List;

public class TestingClass {


    public static void main(String[] args) {
        UserDAO userDAO=new UserDAO();
        User user=new User(1,"Maciek","maciek@gmail.com","niewiem");
        User user1=new User(2,"Franek","franek@gmail.com","niewiem");
        User user2=new User(3,"Heniek","heniek@gmail.com","niewiem");
        User user3=new User(4,"Mateusz","mateusz@gmail.com","niewiem");
        User user4=new User(5,"Felek","felekek@gmail.com","niewiem");

        userDAO.create(user);
        userDAO.create(user1);
        userDAO.create(user2);
        userDAO.create(user3);
        userDAO.create(user4);

//        System.out.println(userDAO.read(1).toString());
//        System.out.println(userDAO.read(2).toString());
//        System.out.println(userDAO.read(3).toString());
//        System.out.println(userDAO.read(4).toString());
//        System.out.println(userDAO.read(5).toString());
//
//        userDAO.update(user2,"Marian","marian@gmail.com","towiem");
//        userDAO.delete(5);
//        System.out.println(userDAO.read(3).toString());
//        List<User> users=userDAO.findall();
//        Iterator<User> iterator= users.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next().toString());
//        }
    }
}
