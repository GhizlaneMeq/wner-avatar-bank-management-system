package ma.youcode.bankmanagementsystem.services;

import ma.youcode.bankmanagementsystem.dtos.loan.CreateLoanRequestDTO;
import ma.youcode.bankmanagementsystem.dtos.loan.LoanCriterias;
import ma.youcode.bankmanagementsystem.dtos.loan.LoanResponseDTO;
import ma.youcode.bankmanagementsystem.enums.LoanStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface LoanService {
    LoanResponseDTO applyForLoan(CreateLoanRequestDTO request);

    LoanResponseDTO getLoanById(Long id);

    Page<LoanResponseDTO> getMyLoans(Pageable pageable);

    Page<LoanResponseDTO> getAllLoans(Pageable pageable);

    void deleteLoan(Long id);

    void updateLoanStatus(Long id, LoanStatus status);

    LoanCriterias checkLoanEligibility(CreateLoanRequestDTO request);
}
