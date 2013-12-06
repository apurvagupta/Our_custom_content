package customContent.action;

import com.google.gson.Gson;
import com.jivesoftware.community.action.ContentActionSupport;

public class CreateJsonAction extends ContentActionSupport {

    private String errorMessage;
    private String details;
    private String jsonString;

    @Override
    public String execute() {
        System.out.println("IN JSON");
        System.out.println("DETAILS:"+details);
        Gson gson = new Gson();
        errorMessage="";
        if(details.length()>5){
            jsonString=gson.toJson("{hasError:true}");
            return ERROR;
        }
        jsonString = gson.toJson("{details:"+details+"}");
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
}
