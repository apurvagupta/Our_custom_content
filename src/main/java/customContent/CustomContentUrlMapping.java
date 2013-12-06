package customContent;

import com.jivesoftware.community.web.struts.mapping.URLMapping;
import org.apache.struts2.dispatcher.mapper.ActionMapping;


public class CustomContentUrlMapping implements URLMapping {

    @SuppressWarnings("unchecked")
    public void process(String uri, ActionMapping mapping) {
        String method="";
        String name;
        if(uri.equals("/topic"))  {
            method="input";
            name="topic";
        }
        else if(uri.equals("/topic/json")){
            name   = "customJsonRequest";
        }

        else
            name="submit";
        mapping.setName(name);
        mapping.setMethod(method);
        mapping.setNamespace("custom-content-actions");
    }

}
