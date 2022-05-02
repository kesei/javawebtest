package com.example.yikeerp.service.InventoryManagementService;

import com.example.yikeerp.dao.InventoryManagementDao.InventoryManagementDao;
import com.example.yikeerp.entity.InventoryManagementEntity.InventoryInfo;
import com.example.yikeerp.entity.InventoryManagementEntity.InventoryManagementInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collection;

@Service
public class InventoryManagement {
    @Resource
    private InventoryManagementDao inventoryManagementDao;

    public int init(){
        return inventoryManagementDao.init();
    }
    public Collection<InventoryInfo> view(InventoryManagementInfo info){
        return inventoryManagementDao.view(info.getLimit(),info.getOffset());
    }
    public boolean add(InventoryManagementInfo info){
        try {
            inventoryManagementDao.check(info.getBNo());
            return false;
        }catch (Exception e){
            try {
                return inventoryManagementDao.add(info.getBNo(),info.getWNo(),info.getGNo(),info.getSNo(),info.getINum(),info.getIWUnit(),info.getSpecs(),info.getENo());
            }catch (Exception e2){
                return false;
            }
        }
    }
    public boolean sub(InventoryManagementInfo info){
        switch (info.getStyle()){
            case "sub":try {
                return inventoryManagementDao.sub(info.getBNo(),info.getWNo(),info.getGNo(),info.getSNo(),info.getINum(),info.getIWUnit(),info.getRNum(),info.getRUnit(),info.getSPrice());
            }catch (Exception e){
                return false;
            }
            case "del":try {
                return inventoryManagementDao.del(info.getBNo(),info.getWNo(),info.getGNo(),info.getSNo(),info.getINum(),info.getIWUnit(),info.getRNum(),info.getRUnit(),info.getSPrice());
            }catch (Exception e){
                return false;
            }
        }
        return false;
    }
    public String infomatch(InventoryManagementInfo info){
        switch (info.getType()){
            case "Warehouse":try {
                return  inventoryManagementDao.warehouse(info.getNo());
            }catch (Exception e){
                return "";
            }
            case "Goods":try {
                return inventoryManagementDao.goods(info.getNo());
            }catch (Exception e){
                return "";
            }
            case "Supplier":try {
                return inventoryManagementDao.supplier(info.getNo());
            }catch (Exception e){
                return "";
            }
            case "RUnit":try {
                return inventoryManagementDao.unit(info.getNo());
            }catch (Exception e){
                return "";
            }
        }
        return "";
    }
    public boolean mod(InventoryManagementInfo info){
        String Content="UPDATE iinfo SET WNo="+info.getWNo()+"GNo="+info.getGNo()+"SNo="+info.getSNo()+"INum="+info.getINum()+"IWUnit="+info.getWUnit()+"ISpecs="+info.getISpecs()+"WHERE BNo="+info.getBNo();
        try {
            return inventoryManagementDao.mod(info.getTarget(),info.getWNo(),info.getGNo(),info.getSNo(),info.getNum(),info.getWUnit(),info.getSpecs(),info.getENo(),Content);
        }catch (Exception e){
            return false;
        }
    }
    public boolean trans(InventoryManagementInfo info){
        switch (info.getStyle()){
            case "ptrans":try {
                return inventoryManagementDao.ptrans(info.getTarget(), info.getFrom_WNo(),info.getTo_WNo(),info.getGNo(),info.getSNo(),info.getNum(),info.getWUnit(),info.getSpecs(),info.getENo());
            }catch (Exception e){
                return false;
            }
            case "ftrans":try {
                return inventoryManagementDao.ftrans(info.getTarget(), info.getFrom_WNo(),info.getTo_WNo(),info.getGNo(),info.getNum(),info.getSpecs(),info.getENo());
            }catch (Exception e){
                return false;
            }
        }
        return false;
    }
    public Collection<InventoryInfo> search(InventoryManagementInfo info){
        switch (info.getType()){
            case "批次号":info.setType("BNo");break;
            case "仓库编号":info.setType("WNo");break;
            case "商品条码":info.setType("GNo");break;
            case "供货商编号":info.setType("SNo");break;
        }
        return inventoryManagementDao.search(info.getType(),info.getText(),info.getLimit(),info.getOffset());
    }
}
