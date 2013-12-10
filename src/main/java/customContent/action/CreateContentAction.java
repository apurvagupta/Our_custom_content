package customContent.action;

import com.jivesoftware.community.action.ContentActionSupport;
import customContent.CustomContent;
import customContent.CustomContentDataBase;

public class CreateContentAction extends ContentActionSupport {

    private String errorMessage;
    private String details;
    private String jsonString;
    private CustomContentDataBase customContentDataBase;

    @Override
    public String execute() {
        System.out.println("IN");
        System.out.println("DETAILS:"+details);
        if(details.length()>5){
            return ERROR;
        }
        System.out.print("in Custom content");
        CustomContent customContent = new CustomContent();
        customContent.setDetail(details);
        customContent.setUserID("1");
        customContent.setId("1");

//        customContentDataBase = new CustomContentDataBase();
        customContentDataBase.saveContent(customContent);
        return SUCCESS;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public void setCustomContentDataBase(CustomContentDataBase customContentDataBase) {
        this.customContentDataBase = customContentDataBase;
    }

    public CustomContentDataBase getCustomContentDataBase(){
        return customContentDataBase;
    }
}
