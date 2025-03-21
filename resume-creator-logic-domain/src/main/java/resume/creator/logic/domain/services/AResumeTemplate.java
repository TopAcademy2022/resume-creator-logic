package resume.creator.logic.domain.services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import resume.creator.logic.domain.models.Resume;
import resume.creator.logic.domain.models.User;

public class AResumeTemplate {

    public boolean CreateUserResumeWorld(Resume userResume, User user, String myDirectory) {
        try {
            Map<String, String> states = this._SetMapTegsResume(userResume);

            try (XWPFDocument worldDocument = new XWPFDocument(new FileInputStream(userResume.PathToResumeTemplate))) {
                for (XWPFParagraph documentParag : worldDocument.getParagraphs()) {
                    List<XWPFRun> documentRuns = documentParag.getRuns();

                    if (documentRuns != null) {
                        for (XWPFRun element : documentRuns) {
                            String text = element.getText(0);
                            for (Map.Entry<String, String> ele : states.entrySet()) {
                                if (text != null && text.contains(ele.getKey())) {
                                    text = text.replace(ele.getKey(), ele.getValue());
                                    element.setText(text, 0);
                                }
                            }
                        }
                    }
                }

                worldDocument
                        .write(new FileOutputStream(
                                myDirectory + "/" + user.getLogin() + userResume.PathToResumeTemplate));

            }

            userResume.PathToFile = myDirectory + "/" + user.getLogin() + userResume.PathToResumeTemplate;
            return true;

        } catch (Exception e) {
            System.out.println(e);
        }

        return false;
    }

    private Map<String, String> _SetMapTegsResume(Resume resume) {
        Map<String, String> rezultMap = new HashMap<>();
        rezultMap.put("FIO", resume.FIO);
        rezultMap.put("Age", String.valueOf(resume.Age));
        rezultMap.put("Education", resume.Education);
        rezultMap.put("WorkExperience", resume.WorkExperience);
        rezultMap.put("DesiredSalary", String.valueOf(resume.DesiredSalary));
        rezultMap.put("AdditionalInformation", resume.AdditionalInformation);

        return rezultMap;
    }

}
