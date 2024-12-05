package restuarant.repositories;

import restuarant.models.Bill;

import java.util.Optional;

public interface BillRepository {
    Bill save(Bill bill);
    Optional<Bill> findById(long billId);
}
