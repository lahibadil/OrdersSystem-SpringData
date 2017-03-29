import com.adil.entities.Shipper;
import com.adil.services.ShipperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * Created by Adil on 3/19/2017.
 */
@Component
public class Application {

 //   static AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);


    //private static ShipperService shipperService =  context.getBean("shipperService", ShipperService.class);

    @Autowired
    private static ShipperService shipperService;
    public static void main(String[] args){
        Shipper shipper = new Shipper();
        shipper.setCompnay("CASANOVA");
        shipper.setContacts(new HashMap<String, String>(){{
            put("adil","manager");
        }});

        try {
           shipper =  shipperService.save(shipper);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(shipper.getId());
        System.out.println(shipper.getContacts().get("adil"));
        shipper = new Shipper();

    }
}
