package kohgylw.kiftd.server.model;

/**
 * 文件和功能关联表
 *
 * @author wzy
 * @create 2019-05-27  14:23
 */

public class FileFeature {

    private String fileFeatureId;
    private String fileId;
    private String featureId;

    public String getFileFeatureId() {
        return fileFeatureId;
    }

    public void setFileFeatureId(String fileFeatureId) {
        this.fileFeatureId = fileFeatureId;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFeatureId() {
        return featureId;
    }

    public void setFeatureId(String featureId) {
        this.featureId = featureId;
    }
}
