package TechnicalBlog.service;

import TechnicalBlog.dao.UserDAO;
import TechnicalBlog.model.User;

public class UserService {
private UserDAO userDAO=new UserDAO();
public boolean isValidUser(User user){
    return userDAO.isValid(user);

}

}
