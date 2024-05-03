package com.example.bookhub.admin.mapper;

import com.example.bookhub.admin.dto.DailyDto;
import com.example.bookhub.admin.dto.DayTotalDto;
import com.example.bookhub.admin.dto.DetailPercentDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DetailDashBoardMapper {


    List<DailyDto> getDetailDaily(String value);
    List<DetailPercentDto> getDetailPercent(String searchData);


    List<DayTotalDto> getDetailRange(String startDate, String endDate);
    List<DailyDto> getDetailRangeItem(String startDate, String endDate);
}