package com.itrip.biz.service;

import com.itrip.beans.pojo.Hotel;
import com.itrip.utils.Page;

/**
 * 酒店的业务逻辑接口
 */
public interface HotelService {

    Page<Hotel> getPageHotelByCityId(int cityId,int pageIndex,int pageSize);

}
