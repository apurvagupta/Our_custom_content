package customContent.action;

import com.jivesoftware.community.JiveContainer;
import com.jivesoftware.community.action.ContentActionSupport;

public class CreateContentAction extends ContentActionSupport {

    private String errorMessage;
    private String details;

    @Override
    public String execute() {
        System.out.println("IN");
        System.out.println("DETAILS:"+details);
        errorMessage="";
        if(details.length()>5){
            return ERROR;
        }
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
}
