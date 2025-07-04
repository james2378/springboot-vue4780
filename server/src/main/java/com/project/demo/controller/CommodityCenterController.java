package com.project.demo.controller;

import com.project.demo.entity.CommodityCenter;
import com.project.demo.service.CommodityCenterService;
import com.project.demo.controller.base.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 商品中心：(CommodityCenter)表控制层
 *
 */
@RestController
@RequestMapping("/commodity_center")
public class CommodityCenterController extends BaseController<CommodityCenter, CommodityCenterService> {

    /**
     * 商品中心对象
     */
    @Autowired
    public CommodityCenterController(CommodityCenterService service) {
        setService(service);
    }

    @PostMapping("/add")
    @Transactional
    public Map<String, Object> add(HttpServletRequest request) throws IOException {
        Map<String,Object> paramMap = service.readBody(request.getReader());
        this.addMap(paramMap);
        return success(1);
    }

}
