package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.LedgerDetailDTO;
import com.tencent.wxcloudrun.model.ReportDTO;
import com.tencent.wxcloudrun.model.ExpenseRecordDTO;
import org.apache.ibatis.annotations.Param;

public interface LedgerMapper {
    /**
     * 根据账本 ID 获取账本详情
     * @param ledgerId 账本 ID
     * @param userId 用户 ID
     * @return 账本详情 DTO
     */
    LedgerDetailDTO getLedgerDetail(@Param("ledgerId") int ledgerId, @Param("userId") int userId);
    ReportDTO getLedgerReport(@Param("ledgerId") int ledgerId, @Param("userId") int userId);
}
