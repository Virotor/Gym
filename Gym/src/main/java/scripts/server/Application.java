package scripts.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = { "scripts.server"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // @Bean
    // public PlatformTransactionManager platformTransactionManager() {
    //     return new JtaTransactionManager();
    // }

    // @Bean
    // public LocalSessionFactoryBean sessionFactory() {
    //     LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
    //     return sessionFactory;
    // }

    /*
     * @Bean
     * public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
     * return args -> {
     * 
     * System.out.println("Let's inspect the beans provided by Spring Boot:");
     * 
     * String[] beanNames = ctx.getBeanDefinitionNames();
     * Arrays.sort(beanNames);
     * for (String beanName : beanNames) {
     * System.out.println(beanName);
     * }
     * 
     * };
     * }
     */

}