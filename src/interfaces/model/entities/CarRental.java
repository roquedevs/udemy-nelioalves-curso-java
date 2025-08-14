package interfaces.model.entities;

import java.time.LocalDateTime;

public class CarRental {

    private LocalDateTime start;
    private LocalDateTime finish;

    private Invoice invoice;
    private Vehicle vehicle;

    public CarRental() {
    }

    public CarRental(Vehicle vehicle, LocalDateTime finish, LocalDateTime start) {
        this.vehicle = vehicle;
        this.finish = finish;
        this.start = start;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getFinish() {
        return finish;
    }

    public void setFinish(LocalDateTime finish) {
        this.finish = finish;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public Vehicle getVeiculo() {
        return vehicle;
    }

    public void setVeiculo(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
