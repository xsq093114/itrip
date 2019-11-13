package com.itrip.dao.hotel;

import com.itrip.beans.pojo.Hotel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HotelMapper {

    List<Hotel> getListHotelByCityId(@Param("cityId") Integer cityId,
                                     @Param("from")int from,
                                     @Param("pageSize")int pageSize);

    int getCountHotelByCityId(@Param("cityId") Integer cityId);


}
