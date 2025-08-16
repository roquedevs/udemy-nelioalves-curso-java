package interfaces.exercises.model.services;

import interfaces.exercises.model.entities.Contract;
import interfaces.exercises.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private final OnlinePaymentService paymentService;

    public ContractService(OnlinePaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate date = contract.getDate().plusMonths(i);

            double interest = paymentService.interest(basicQuota, i);
            double fee = paymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            Installment installment = new Installment(quota, date);
            contract.addInstallment(installment);
        }
    }
}
