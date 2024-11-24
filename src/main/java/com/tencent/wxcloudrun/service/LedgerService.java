package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.LedgerDetailDTO;
import import com.tencent.wxcloudrun.model.ReportDTO;

public interface LedgerService {
    /**
     * ��ȡ�˱�����
     * @param ledgerId �˱� ID
     * @param userId �û� ID
     * @return �˱����� DTO
     */
    LedgerDetailDTO getLedgerDetail(int ledgerId, int userId);

    /**
     * ��ȡ�˱�����
     * @param ledgerId �˱� ID
     * @param userId �û� ID
     * @return �˱����� DTO
     */
    ReportDTO getLedgerReport(int ledgerId, int userId);
}

