package kohgylw.kiftd.server.service.impl;

import kohgylw.kiftd.server.mapper.*;
import kohgylw.kiftd.server.model.*;
import kohgylw.kiftd.server.service.*;
import com.google.gson.*;
import org.springframework.stereotype.*;

import javax.annotation.*;
import javax.servlet.http.*;
import java.util.*;


/**
 * @author wzy
 * @create 2019-05-25  18:06
 */
@Service
public class CountryServiceImpl  implements CountryService {

    @Resource
    private CountryMapper cm;
    @Resource
    private Gson gson;

    @Override
    public String getCountryViewToJson(final HttpServletRequest request){
        List<Country> countryList = new LinkedList<>();


        for (Country c : this.cm.getCountries()) {
            countryList.add(c);

        }

//        Country c1 =new Country();
//        Country c2 =new Country();
//        c1.setCountryId("123");
//        c1.setCountryName("USA");
//        c2.setCountryId("000");
//        c2.setCountryName("JAPAN");
//        countryList.add(c1);
//        countryList.add(c2);

        return gson.toJson(countryList);
    }
}
