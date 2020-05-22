package tech.meliora.learn.generics.dto;

public class CDR extends TransactionDTO {
    private String cdrId;

    public String getCdrId() {
        return cdrId;
    }

    public void setCdrId(String cdrId) {
        this.cdrId = cdrId;
    }
}
