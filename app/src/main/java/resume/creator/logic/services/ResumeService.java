package resume.creator.logic.services;

import resume.creator.logic.models.*;

public class ResumeService {
    public boolean AddResume(Resume resume, User user){
        if (!user.Resume.contains(resume)){
            user.Resume.add(resume);
            
            return true;
        }

        return false;
    }
}
