package resume.creator.logic.services;

import java.util.ArrayList;

import resume.creator.logic.models.*;

public class UserService {

    public boolean CheckloginAndPassword(User userToCheck) {
        if(userToCheck.Resume == null) {
            userToCheck.Resume = new ArrayList<Resume>();
        }
        if (userToCheck.Login.equals("admin") && userToCheck.Password.equals("admin")) {
            return true; 
        }

        return false;
    }

    public boolean DeleteResume(User user, Resume resume) {
        
        if (user.Resume.contains(resume)) {
            user.Resume.remove(resume);

            return true;
        }
            
        return false;
    }
}
