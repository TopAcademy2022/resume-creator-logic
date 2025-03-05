package resume.creator.logic;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import resume.creator.logic.models.*;
import resume.creator.logic.services.ResumeService;

public class ResumeServiceTests {
    @Test
    public void AddResumeTest(){
        ResumeService resumeService = new ResumeService();

        Resume resume = new Resume();
        resume.PathToPhoto = "./some-path.jpg";
        resume.FIO = "Ivanov Ivan";
        resume.Education = "Hight";
        resume.WorkExperience = "True";
        resume.DesiredSalary = 45000;
        resume.Age = 50;
        resume.AdditionalInformation = "Test";
        resume.PathToResumeTemplate = "./some-path-template.docx";
        resume.PathToFile = "./some-path.docx";

        User user = new User();
        user.Login = "admin";
        user.Password = "admin";
        user.Resume = new ArrayList<Resume>();

        assertTrue(resumeService.AddResume(resume, user));
    }
}
