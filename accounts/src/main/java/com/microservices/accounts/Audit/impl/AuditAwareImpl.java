package com.microservices.accounts.Audit.impl;
import java.util.Optional;
import org.springframework.stereotype.Component;

import com.microservices.accounts.Audit.iAuditorAware;

@Component("auditAwareImpl")
public class AuditAwareImpl implements iAuditorAware{

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of("ACCOUNTS_MS");
    }
    
}
