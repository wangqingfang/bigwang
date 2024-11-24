package com.tencent.wxcloudrun.dao;

import com.tencent.wxcloudrun.model.LedgerDetailDTO;
import com.tencent.wxcloudrun.model.ReportDTO;
import com.tencent.wxcloudrun.model.ExpenseRecordDTO;
import org.apache.ibatis.annotations.Param;

public interface LedgerMapper {
    /**
     * �����˱� ID ��ȡ�˱�����
     * @param ledgerId �˱� ID
     * @param userId �û� ID
     * @return �˱����� DTO
     */
    LedgerDetailDTO getLedgerDetail(@Param("ledgerId") int ledgerId, @Param("userId") int userId);
    ReportDTO getLedgerReport(@Param("ledgerId") int ledgerId, @Param("userId") int userId);
}
