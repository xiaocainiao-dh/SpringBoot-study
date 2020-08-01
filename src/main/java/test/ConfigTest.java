package test;


import com.xiaocainiao.HelloWorldApplication;
import com.xiaocainiao.model.Person;
import org.assertj.core.internal.cglib.asm.$Opcodes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloWorldApplication.class)
public class ConfigTest {

    @Resource
    private Person person;

    @Test
    public void testConfig(){
        System.out.println(person);
    }
}
