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
 * @create 2019-05-27  9:56
 */
@Service
public class FeatureServiceImpl implements FeatureService {


    @Resource
    private FeatureMapper featureMapper;
    @Resource
    private Gson gson;

    @Override
    public String getFeatureViewToJson(final HttpServletRequest request){
        List<Feature> featureList = new LinkedList<>();
        for (Feature f : this.featureMapper.getFeatures()) {
            featureList.add(f);

        }
        return gson.toJson(featureList);
    }


}
