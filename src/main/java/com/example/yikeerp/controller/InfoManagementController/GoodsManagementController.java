package com.example.yikeerp.controller.InfoManagementController;

import com.example.yikeerp.entity.InfoManagementEntity.goods.GoodsInfo;
import com.example.yikeerp.entity.InfoManagementEntity.goods.GoodsmanageInfo;
import com.example.yikeerp.service.InfoManagementService.GoodsManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/goodsManagement")
public class GoodsManagementController {
    @Resource
    private GoodsManagement goodsManagement;
    
    @RequestMapping("/init")
    public int init(){
        return goodsManagement.init();
    }
    @RequestMapping("/view")
    public Collection<GoodsInfo> view(@RequestBody GoodsmanageInfo info){
        return goodsManagement.view(info);
    }
    @RequestMapping("/add")
    public boolean add(@RequestBody GoodsmanageInfo info){
        return goodsManagement.add(info);
    }
    @RequestMapping("/sub")
    public boolean sub(@RequestBody GoodsmanageInfo info){
        return goodsManagement.sub(info);
    }
    @RequestMapping("/mod")
    public boolean mod(@RequestBody GoodsmanageInfo info){
        return goodsManagement.mod(info);
    }
    @RequestMapping("/search")
    public Collection<GoodsInfo> search(@RequestBody GoodsmanageInfo info){
        return goodsManagement.search(info);
    }
}
