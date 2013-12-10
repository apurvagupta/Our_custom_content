package customContent;

import com.jivesoftware.base.database.dao.JiveJdbcDaoSupport;
import org.springframework.dao.DataAccessException;

public class CustomContentDataBase extends JiveJdbcDaoSupport {

    public void saveContent(CustomContent customContent)
    {
        System.out.println("in save method");
        try {
            String saveQuery = String.format("insert into topic (name,userid,id) VALUES ('%s','%s','%s');",customContent.getDetail(),customContent.getUserID(),customContent.getId());
            getSimpleJdbcTemplate().update(saveQuery);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("after save");
    }

}
