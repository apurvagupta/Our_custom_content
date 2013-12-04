package customContent.action;

import com.jivesoftware.community.JiveContainer;
import com.jivesoftware.community.action.ContentActionSupport;
import customContent.CustomContentBean;

import java.util.Date;

public class CreateContentAction extends ContentActionSupport {

    private long topicId;
    private String title;
    private String description;
    private JiveContainer container;

    @Override
    public String execute() {
        CustomContentBean customContentBean = new CustomContentBean();
        customContentBean.setContainerID(getContainerID());
        customContentBean.setContainerType(getContainerType());
        customContentBean.setCreationDate(new Date());
        customContentBean.setDescription(getDescription());
        customContentBean.setTitle(getTitle());
        customContentBean.setId(topicId);

    }

    public long getTopicId() {
        return topicId;
    }

    public void setTopicId(long topicId) {
        this.topicId = topicId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JiveContainer getContainer() {
        return container;
    }

    public void setContainer(JiveContainer container) {
        this.container = container;
    }
}
