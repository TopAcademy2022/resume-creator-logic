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

    public boolean UpdateResume(Resume newResume, User user){
        if (!user.Resume.contains(newResume)){
            user.Resume.clear();
            user.Resume.add(newResume);
            
            return true;
        }
        
        return false;
    }
}
