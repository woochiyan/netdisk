package kohgylw.kiftd.server.pojo;

import kohgylw.kiftd.server.model.Country;
import kohgylw.kiftd.server.model.Feature;
import kohgylw.kiftd.server.model.Node;

import java.util.List;

/**
 * 文件表+功能表
 *
 * @author wzy
 * @create 2019-05-27  21:08
 */

public class FileAndFeatureView {

    private Node node;
    private List<Feature> featureList;
    private Country country;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public List<Feature> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<Feature> featureList) {
        this.featureList = featureList;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
