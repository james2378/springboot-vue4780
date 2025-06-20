package com.project.demo.controller;

import com.project.demo.entity.MerchantUsers;
import com.project.demo.service.MerchantUsersService;
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
 * 商家用户：(MerchantUsers)表控制层
 *
 */
@RestController
@RequestMapping("/merchant_users")
public class MerchantUsersController extends BaseController<MerchantUsers, MerchantUsersService> {

    /**
     * 商家用户对象
     */
    @Autowired
    public MerchantUsersController(MerchantUsersService service) {
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
