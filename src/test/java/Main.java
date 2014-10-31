import com.bionic.domain.Merchant;
import com.bionic.service.MerchantService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by oper4 on 31.10.2014.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
        MerchantService merchantService =
                context.getBean(MerchantService.class);
        Merchant m1 = merchantService.findById(1);
        System.out.println("name = " + m1.getName());

        Merchant m = new Merchant();
        m.setAccount("26001234567890");
        m.setBankName("Paribas Bank");
        m.setCharge(4.25);
        m.setMinSum(250.0);
        m.setName("All For You");
        short period = 1;
        m.setPeriod(period);
        m.setSwift("u551WEqge");
        merchantService.save(m);
        System.out.println("new merchant id = " + m.getId());


    }

}

