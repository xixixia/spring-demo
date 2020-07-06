import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author hx1999
 * @Date 2020/7/1
 */
@Configuration
public class JavaConfig {

    @Bean("food")
    @Profile("北方人")
//    @Conditional(NoodleCondition.class)
    public Food noodle(){
        return new Noodle();
    }

    @Bean("food")
    @Profile("南方人")
//    @Conditional(RiceCondition.class)
    public Food rice(){
        return new Rice();
    }

}
