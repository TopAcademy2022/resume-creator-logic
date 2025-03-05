package resume.creator.logic.services;

import resume.creator.logic.models.Resume;
import resume.creator.logic.models.User;

public class ResumeService {
    public boolean AddResume(Resume resume, User user){
        if (!user.Resume.contains(resume)){
            user.Resume.add(resume);
            
            return true;
        }

        return false;
    }

    public List<Resume> GetListResume(int user){
        //List<Resume> resumes = user.Resume;
        List<Resume> resumes = new ArrayList<Resume>();

        Resume testResume = new Resume();
        testResume.FIO = "Иванов Илья";
        testResume.PathToFile = "./myfile.soprano";
        testResume.PathToResumeTemplate = "./templates/mytemplate.docx";
        resumes.add(testResume);

        return resumes;
    }
}
