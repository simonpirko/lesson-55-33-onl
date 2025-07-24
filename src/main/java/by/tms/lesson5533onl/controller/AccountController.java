package by.tms.lesson5533onl.controller;

import by.tms.lesson5533onl.entity.Account;
import by.tms.lesson5533onl.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    @GetMapping
    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    @PostMapping
    public Account save(@RequestBody Account account) {
        return accountRepository.save(account);
    }
}
