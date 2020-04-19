import com.itheima.domain.User;
import com.itheima.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


public class UserServiceTest {

    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        IUserService iUs = ac.getBean("iUserService", IUserService.class);
        System.out.println(iUs);
        List<User> accounts = iUs.findAll();
        for (User user: accounts) {
            System.out.println(user);
        }

    }

    /*@Test
    public void testFindUserById(Integer id){

    }

    @Test
    public void testUpdateAcount(User user){

    }

    @Test
    public void testDelectAcountById(Integer id){

    }*/
}
