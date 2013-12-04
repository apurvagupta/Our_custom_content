package customContent;

import com.jivesoftware.base.User;
import com.jivesoftware.community.JiveContentObject;
import com.jivesoftware.community.objecttype.JiveObjectType;
import org.w3c.dom.Document;

import java.util.Collection;
import java.util.Date;

public class CustomContent implements JiveContentObject {
    @Override
    public Document getBody() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getPlainBody() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Date getCreationDate() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Date getModificationDate() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getUnfilteredSubject() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getContainerID() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getContainerType() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public JiveObjectType getJiveObjectType() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isVisibleToPartner() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Status getStatus() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getSubject() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getPlainSubject() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getID() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getObjectType() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User getUser() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public long getUserID() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Iterable<User> getAuthors() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Collection<Long> getAuthorIDs() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
