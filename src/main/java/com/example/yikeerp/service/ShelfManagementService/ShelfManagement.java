package com.example.yikeerp.service.ShelfManagementService;

import com.example.yikeerp.dao.ShelfManagementDao.ShelfManagementDao;
import com.example.yikeerp.entity.ShelfManagementEntity.shelf.ShelfInfo;
import com.example.yikeerp.entity.ShelfManagementEntity.shelf.ShelfmanageInfo;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class ShelfManagement {
    @Resource
    private ShelfManagementDao shelfManagementDao;

    public int init(){
        return shelfManagementDao.init();
    }
    public Collection<ShelfInfo> view(ShelfmanageInfo info){
        return shelfManagementDao.view(info.getLimit(),info.getOffset());
    }
    public boolean sub(ShelfmanageInfo info){
        switch (info.getStyle()){
            case "sub":try {
                return shelfManagementDao.sub(info.getNo(),info.getID(),info.getBNo(),info.getCNo(),info.getGNo(),info.getENo(),info.getNum(),info.getSPrice());
            }catch (Exception e){
                return false;
            }
            case "del":try {
                return shelfManagementDao.del(info.getNo(),info.getID(),info.getBNo(),info.getCNo(),info.getGNo(),info.getENo(),info.getNum(),info.getSPrice());
            }catch (Exception e){
                return false;
            }
        }
        return false;
    }
    public boolean mod(ShelfmanageInfo info){
        switch (info.getStyle()){
            case "pmod":try {
                String Content="UPDATE shelfinfo SET GNum="+info.getNum()+"SPrice="+info.getPrice()+"WHERE `No`="+info.getTarget();
                return shelfManagementDao.pmod(info.getTarget(),info.getNum(),info.getPrice(),info.getENo(),Content);
            }catch (Exception e){
                return false;
            }
            case "fmod":try {
                String Content="DELETE FROM shelfinfo WHERE `No`="+info.getTarget();
                return shelfManagementDao.fmod(info.getTarget(),info.getNum(),info.getPrice(),info.getENo(),Content);
            }catch (Exception e){
                return false;
            }
        }
        return false;
    }
    public Collection<ShelfInfo> search(ShelfmanageInfo info){
        switch (info.getType()){
            case "批次号":info.setType("BNo");break;
            case "商品条码":info.setType("GNo");break;
            case "商品名称":info.setType("GName");break;
        }
        return shelfManagementDao.search(info.getType(),info.getText(),info.getLimit(),info.getOffset());
    }
}
