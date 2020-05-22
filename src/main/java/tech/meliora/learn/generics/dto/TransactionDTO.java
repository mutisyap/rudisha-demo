package tech.meliora.learn.generics.dto;

public class TransactionDTO {
    private Long id;

    private String trxId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTrxId() {
        return trxId;
    }

    public void setTrxId(String trxId) {
        this.trxId = trxId;
    }

    @Override
    public String toString() {
        return "TransactionDTO{" +
                "id=" + id +
                ", trxId='" + trxId + '\'' +
                '}';
    }
}
