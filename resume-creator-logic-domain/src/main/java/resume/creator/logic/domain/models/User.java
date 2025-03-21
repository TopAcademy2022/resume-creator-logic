package resume.creator.logic.domain.models;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String login;

    private String password;

    private List<Resume> resumeList;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.resumeList = new ArrayList<Resume>();
    }

    public String getLogin() {
        return this.login;
    }

    public String getPassword() {
        return this.password;
    }

    public List<Resume> getResumeList() {
        return this.resumeList;
    }
}
