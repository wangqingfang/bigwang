package com.tencent.wxcloudrun.controller;

import com.tencent.wxcloudrun.model.LedgerDetailDTO;
import com.tencent.wxcloudrun.service.LedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ledger")
public class LedgerController {

    @Autowired
    private LedgerService ledgerService;

    @GetMapping("/detail")
    public LedgerDetailDTO getLedgerDetail(@RequestParam("ledgerId") int ledgerId, 
                                           @RequestParam("userId") int userId) {
        return ledgerService.getLedgerDetail(ledgerId, userId);
    }
}
