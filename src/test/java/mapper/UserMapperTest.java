package mapper;

import com.yupi.project.mapper.UserMapper;
import com.yupi.project.model.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void userAdd(){
//        User user = new User();
//        user.setUserName("chen");
//        user.setUserAccount("Colt");
//        user.setUserPassword("cyjnb666");
//        userMapper.insert(user);
//        log.warn("显示输入的信息:{}", user);
    }

}
