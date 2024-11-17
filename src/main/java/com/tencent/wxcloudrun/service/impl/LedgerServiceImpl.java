package com.tencent.wxcloudrun.service.impl;

import com.tencent.wxcloudrun.dao.LedgerMapper;
import com.tencent.wxcloudrun.model.LedgerDetailDTO;
import com.tencent.wxcloudrun.service.LedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LedgerServiceImpl implements LedgerService {

    @Autowired
    private LedgerMapper ledgerMapper;

    @Override
    public LedgerDetailDTO getLedgerDetail(int ledgerId, int userId) {
        return ledgerMapper.getLedgerDetail(ledgerId, userId);
    }
}
