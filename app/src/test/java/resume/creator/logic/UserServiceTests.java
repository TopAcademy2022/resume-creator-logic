package resume.creator.logic;

import org.junit.jupiter.api.Test;

import resume.creator.logic.models.Resume;
import resume.creator.logic.models.User;
import resume.creator.logic.services.UserService;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

class UserServiceTests {
    @Test
    void CheckloginAndPasswordTest() {
        UserService userService = new UserService();

        User user = new User();
        user.Login = "admin";
        user.Password = "admin";

        assertTrue(userService.CheckloginAndPassword(user));
    }

    @Test
    void DeleteResumeTest() {
        Resume resume = new Resume();
        resume.FIO = "text";
        resume.PathToPhoto = "text";
        resume.Education = "text";
        resume.WorkExperience ="text";
        resume.DesiredSalary = 45000;
        resume.Age = 31;
        resume.AdditionalInformation ="text";
        resume.PathToResumeTemplate ="text";

        UserService userService = new UserService();

        User user = new User();
        user.Login = "admin";
        user.Password = "admin";
        user.Resume = new ArrayList<Resume>();
        user.Resume.add(resume);

        assertTrue(userService.DeleteResume(user,resume));
    }
}