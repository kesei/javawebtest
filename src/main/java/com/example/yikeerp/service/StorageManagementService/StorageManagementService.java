package com.example.yikeerp.service.StorageManagementService;

import com.example.yikeerp.dao.StorageManagementDao.StorageManagementDao;
import com.example.yikeerp.entity.StorageManagementEntity.StorageInfo;
import com.example.yikeerp.entity.StorageManagementEntity.StorageManagementInfo;
import com.example.yikeerp.entity.StorageManagementEntity.StorageNames;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ResourceUtils;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class StorageManagementService {
    @Resource
    private StorageManagementDao storageManagementDao;
    @Value("${file.uploadFolder}")
    private String uploadfolder;

    public int init(){
        return storageManagementDao.init();
    }
    public Collection<StorageInfo> view(StorageManagementInfo info){
        try {
            return storageManagementDao.view(info.getLimit(),info.getOffset());
        }catch (Exception e){
            return new ArrayList<>();
        }
    }
    public boolean upload(MultipartFile file)  {
        try {
            String path = ResourceUtils.getURL("classpath:").getPath()+"static/upload";
            File directory=new File(path);
            if(!directory.exists()){
                directory.mkdir();
            }
            File filesave=new File(path+"/"+file.getOriginalFilename());
            file.transferTo(filesave);
            System.out.println("yes");
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public boolean record(StorageNames names){
        try {
            for(int i=0;i<names.getNames().size();i++){
                String filename= (String)names.getNames().toArray()[i];
                String no=names.getUploader_no();
                storageManagementDao.record(filename,no,"/upload/"+filename);
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    @Transactional(rollbackFor = Exception.class)
    public boolean sub(StorageManagementInfo info){
        try {
            int length = info.getLength();
            List<String> list = info.getList();
            for (int i = 0; i < length; i++) {
                File file = new File(uploadfolder+list.get(i));
                if(file.exists()) {
                    file.delete();
                }
                storageManagementDao.sub(list.get(i));
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public Collection<StorageInfo> search(StorageManagementInfo info){
        try {
            return storageManagementDao.search("filename",info.getText(),info.getLimit(),info.getOffset());
        }catch (Exception e){
            return new ArrayList<>();
        }
    }
}
