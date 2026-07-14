package dao;

import dao.domain.UserDAO;
import dao.domain.UserDomain;

public class Main {
    private static GenericDAO<UserDomain> dao = new UserDAO();
    static void main(String[] args) {
        System.out.println(dao.count());
        System.out.println(dao.save(new UserDomain("Maria", 45)));
        System.out.println(dao.findAll());
        System.out.println(dao.count());
        dao.delete(new UserDomain("Marcos", 44));
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(dao.toString());
    }
}
