package kohgylw.kiftd.server.service;

import javax.servlet.http.HttpServletRequest;

public interface FeatureService {
    String getFeatureViewToJson(final HttpServletRequest request);
}
