package org.example.unicrew;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        List<Claim> claims = new ArrayList<>();
        //Task 1 — Group and Aggregate
        Map<String, BigDecimal> collect = claims.stream().collect(Collectors.toMap(Claim::getCustomerId, Claim::getAmount, BigDecimal::add));
        //Task 2 — Find Duplicates
        List<Claim> claimsDuplicates = new ArrayList<>();
        Set<Claim> claimsSet = new HashSet<>();
        for (int i = 0; i < claims.size(); i++) {
            Claim claim = claims.get(i);
            if(claimsSet.contains(claim)) {
                claimsDuplicates.add(claim);
            } else {
                claimsSet.add(claim);
            }
        }
        //Task 3 — REST Endpoint
        //Create endpoint: GET /claims/{id}
        /*
        return claim if exists
        return 404 otherwise
        use service layer
        use DTO
        @RestController
@RequiredArgsConstructor
public class ClaimController {

    private final ClaimService claimService;

    @GetMapping("/claims/{id}")
    public ClaimDto get(@PathVariable Long id) {
        return claimService.get(id);
    }
}
         */
    }


    public static class Claim{
        String customerId;
        BigDecimal amount;

        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public BigDecimal getAmount() {
            return amount;
        }

        public void setAmount(BigDecimal amount) {
            this.amount = amount;
        }
    }
}
