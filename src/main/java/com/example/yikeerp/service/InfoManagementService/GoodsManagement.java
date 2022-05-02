package com.example.yikeerp.service.InfoManagementService;

import com.example.yikeerp.dao.InfoManagementDao.GoodsManagementDao;
import com.example.yikeerp.entity.InfoManagementEntity.goods.GoodsInfo;
import com.example.yikeerp.entity.InfoManagementEntity.goods.GoodsmanageInfo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class GoodsManagement {
    @Resource
    private GoodsManagementDao goodsManagementDao;

    public int init(){
        return goodsManagementDao.init();
    }
    public Collection<GoodsInfo> view(GoodsmanageInfo info){
        try {
            return goodsManagementDao.view(info.getLimit(),info.getOffset());
        }catch (Exception e){
            return new ArrayList<GoodsInfo>();
        }
    }
    public boolean add(GoodsmanageInfo info){
        return goodsManagementDao.add(info.getNo(),info.getName(),info.getFCategory(),info.getSCategory(),info.getMCategory(),info.getUnit(),info.getPrice());
    }
    public boolean sub(GoodsmanageInfo info){
        try {
            int length=info.getLength();
            List<String> list=info.getList();
            for(int i=0;i<length;i++){
                goodsManagementDao.sub(list.get(i));
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    public boolean mod(GoodsmanageInfo info){
        return goodsManagementDao.mod(info.getNo(),info.getName(),info.getFCategory(),info.getSCategory(),info.getMCategory(),info.getUnit(),info.getPrice(),info.getTarget());
    }
    public Collection<GoodsInfo> search(GoodsmanageInfo info){
        switch (info.getType()){
            case "商品条码":info.setType("GNo");break;
            case "商品名称":info.setType("GName");break;
        }
        return goodsManagementDao.search(info.getType(),info.getText(),info.getLimit(),info.getOffset());
    }
}
