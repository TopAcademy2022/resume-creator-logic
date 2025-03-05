package resume.creator.logic.domain.services;

import java.util.ArrayList;

import resume.creator.logic.domain.models.*;

public class UserService {

    public boolean CheckloginAndPassword(User userToCheck) {
        if (userToCheck.getResumeList() == null) {
            // userToCheck.getResumeList() = new ArrayList<Resume>();
        }
        if (userToCheck.getLogin().equals("admin") && userToCheck.getPassword().equals("admin")) {
            return true;
        }

        return false;
    }

    public boolean DeleteResume(User user, Resume resume) {

        if (user.getResumeList().contains(resume)) {
            user.getResumeList().remove(resume);

            return true;
        }

        return false;
    }
}
