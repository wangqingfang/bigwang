package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.LedgerDetailDTO;

public interface LedgerService {
    /**
     * ��ȡ�˱�����
     * @param ledgerId �˱� ID
     * @param userId �û� ID
     * @return �˱����� DTO
     */
    LedgerDetailDTO getLedgerDetail(int ledgerId, int userId);
}

