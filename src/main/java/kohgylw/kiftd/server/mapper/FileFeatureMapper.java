package kohgylw.kiftd.server.mapper;

import kohgylw.kiftd.server.model.*;

import java.util.*;


public interface FileFeatureMapper {
    int insertFileIdAndFeatureId(final FileFeature ff);

    List<FileFeature> getFileFeatureByFileId(final String fid);

    int deleteById(final String fileId);
}
