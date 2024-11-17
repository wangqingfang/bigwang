package com.tencent.wxcloudrun.service;

import com.tencent.wxcloudrun.model.LedgerDetailDTO;

public interface LedgerService {
    /**
     * 获取账本详情
     * @param ledgerId 账本 ID
     * @param userId 用户 ID
     * @return 账本详情 DTO
     */
    LedgerDetailDTO getLedgerDetail(int ledgerId, int userId);
}

