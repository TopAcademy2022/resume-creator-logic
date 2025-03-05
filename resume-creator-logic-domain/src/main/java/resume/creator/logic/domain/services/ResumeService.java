package resume.creator.logic.domain.services;

import java.util.ArrayList;
import java.util.List;

import resume.creator.logic.domain.models.Resume;
import resume.creator.logic.domain.models.User;

public class ResumeService {
    public boolean AddResume(Resume resume, User user) {
        if (!user.getResumeList().contains(resume)) {
            user.getResumeList().add(resume);

            return true;
        }

        return false;
    }

    public List<Resume> GetListResume(int user) {
        // List<Resume> resumes = user.Resume;
        List<Resume> resumes = new ArrayList<Resume>();

        Resume testResume = new Resume();
        testResume.FIO = "Иванов Илья";
        testResume.PathToFile = "./myfile.soprano";
        testResume.PathToResumeTemplate = "./templates/mytemplate.docx";
        resumes.add(testResume);

        return resumes;
    }
}
