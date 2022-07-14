package util;
import com.google.common.collect.ImmutableMap;
import model.Email;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DataUtil {
    public static List<Email> getEmails(){
        List<Email> email = new ArrayList<Email>();
        email.add(new Email (  "yefer@hotmail.com",true));
        email.add(new Email (  "pedro@Oublock.com",false));
        email.add(new Email (  "pablo@gmail.com",true));
        email.add(new Email (  "text@gmail.com",true));
        email.add(new Email (  "a@hotmail.com",true));
        email.add(new Email (  "b@hotmail.com",false));
        email.add(new Email (  "c@hotmail.com",true));
        email.add(new Email (  "d@hotmail.com",true));
        email.add(new Email (  "f@Oublock.com",false));
        email.add(new Email (  "g@gmail.com",true));
        email.add(new Email (  "h@gmail.com",true));
        email.add(new Email (  "a@hotmail.com",true));
        email.add(new Email (  "i@hotmail.com",false));
        email.add(new Email (  "j@hotmail.com",true));
        email.add(new Email (  "k@hotmail.com",true));
        email.add(new Email (  "l@Oublock.com",false));
        email.add(new Email (  "n@gmail.com",true));
        email.add(new Email (  "tt@gmail.com",true));
        email.add(new Email (  "ax@hotmail.com",true));
        email.add(new Email (  "bx@hotmail.com",false));
        email.add(new Email (  "cx@hotmail.com",true));
        email.add(new Email (  "i@hotmail.com",false));
        email.add(new Email (  "j@hotmail.com",true));
        email.add(new Email (  "k@hotmail.com",true));
        email.add(new Email (  "l@Oublock.com",false));
        email.add(new Email (  "n@gmail.com",true));
        email.add(new Email (  "tt@gmail.com",true));
        email.add(new Email (  "ax@hotmail.com",true));
        email.add(new Email (  "bx@hotmail.com",false));
        email.add(new Email (  "cx@hotmail.com",true));
        return  email;
    }
}
