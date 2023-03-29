import java.util.List;

class Bill {
    private String description;
    private int totalAmount;
    private String paidBy;
    private List<String> sharedBy;

    public Bill(String description, int totalAmount, String paidBy, List<String> sharedBy) {
        this.description = description;
        this.totalAmount = totalAmount;
        this.paidBy = paidBy;
        this.sharedBy = sharedBy;
    }

    public String getDescription() {
        return description;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public String getPaidBy() {
        return paidBy;
    }

    public List<String> getSharedBy() {
        return sharedBy;
    }
}
