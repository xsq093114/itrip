package com.itrip.biz.controller;

import com.itrip.beans.dto.Dto;
import com.itrip.beans.pojo.Hotel;
import com.itrip.biz.service.HotelService;
import com.itrip.utils.DtoUtil;
import com.itrip.utils.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/api")
public class HotelController {
    @Resource
    private HotelService hotelService;


    @RequestMapping("/hotel/queryHotelByCityId")
    public Dto getPageHotel(@RequestParam("cityId") int cityId,
                            @RequestParam(value = "pageIndex",defaultValue = "1")int pageIndex){
        //根据城市id分页查询酒店数据
        Page<Hotel> page = hotelService.getPageHotelByCityId(cityId, pageIndex, 5);
        //数据封装
        if(page.getList().size()>0){
            return   DtoUtil.returnSuccess(page,"found data of hotel");
        }else{
            return   DtoUtil.returnFail("no data found");
        }
    }


}
