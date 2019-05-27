package kohgylw.kiftd.server.service;

import org.springframework.web.multipart.*;
import javax.servlet.http.*;


public interface CountryService {
    String getCountryViewToJson(final HttpServletRequest request);
}
