package com.example.yikeerp.controller.ShelfManagementController;

import com.example.yikeerp.entity.ShelfManagementEntity.shelf.ShelfInfo;
import com.example.yikeerp.entity.ShelfManagementEntity.shelf.ShelfmanageInfo;
import com.example.yikeerp.service.ShelfManagementService.ShelfManagement;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collection;

@RestController
@RequestMapping("/shelfManagement")
public class ShelfManagementController {
    @Resource
    private ShelfManagement shelfManagement;

    @RequestMapping("/init")
    public int init(){
        return shelfManagement.init();
    }
    @RequestMapping("/view")
    public Collection<ShelfInfo> view(@RequestBody ShelfmanageInfo info){
        return shelfManagement.view(info);
    }
    @RequestMapping("/sub")
    public boolean sub(@RequestBody ShelfmanageInfo info){
        return shelfManagement.sub(info);
    }
    @RequestMapping("/mod")
    public boolean mod(@RequestBody ShelfmanageInfo info){
        return shelfManagement.mod(info);
    }
    @RequestMapping("/search")
    public Collection<ShelfInfo> search(@RequestBody ShelfmanageInfo info){
        return shelfManagement.search(info);
    }
}
