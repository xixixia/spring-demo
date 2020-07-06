import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hx1999
 * @Date 2020/7/1
 */
public class Main {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
//        context.getEnvironment().getSystemProperties().put("people","北方人");
//        context.register(JavaConfig.class);
//        context.refresh();

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("people","北方人");
        context.register(JavaConfig.class);
        context.refresh();

        Food food= (Food) context.getBean("food");
        System.out.println(food.showName());
    }
}
