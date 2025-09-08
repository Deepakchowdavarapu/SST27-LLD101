package com.example.orders;

import java.util.ArrayList;
import java.util.List;

/**
 * Telescoping constructors + setters. Allows invalid states.
 */
public final class Order {
    private final String id;
    private final String customerEmail;
    private final List<OrderLine> lines = new ArrayList<>();
    private final Integer discountPercent; // 0..100 expected, but not enforced
    private final boolean expedited;
    private final String notes;

    Order(Builder b) {
        this.id = b.id;
        this.customerEmail = b.customerEmail;
        this.lines.addAll(b.lines); // defensive copy
        this.discountPercent = b.discountPercent;
        this.expedited = b.expedited;
        this.notes = b.notes;
    }

    // public void addLine(OrderLine line) { lines.add(line); }
    // public void setDiscountPercent(Integer discountPercent) { this.discountPercent = discountPercent; }
    // public void setExpedited(boolean expedited) { this.expedited = expedited; }
    // public void setNotes(String notes) { this.notes = notes; }

    public String getId() { return id; }
    public String getCustomerEmail() { return customerEmail; }
    public List<OrderLine> getLines() { return new ArrayList<>(lines); } // defensive copy
    public Integer getDiscountPercent() { return discountPercent; }
    public boolean isExpedited() { return expedited; }
    public String getNotes() { return notes; }

    public int totalBeforeDiscount() {
        int sum = 0;
        for (OrderLine l : lines) sum += l.getQuantity() * l.getUnitPriceCents();
        return sum;
    }

    public int totalAfterDiscount() {
        int base = totalBeforeDiscount();
        if (discountPercent == null) return base;
        return base - (base * discountPercent / 100);
    }

    public static class Builder {
        private final String id;
        private final String customerEmail;
        private final List<OrderLine> lines = new ArrayList<>();
        private Integer discountPercent = 0; // 0..100 expected, but not enforced
        private boolean expedited = false;
        private String notes = "";

        public Builder(String id, String customerEmail) {
            this.id = id;
            this.customerEmail = customerEmail;
        }

        public Builder addLine(OrderLine line) { lines.add(line); return this; }
        public Builder discountPercent(Integer discountPercent) { this.discountPercent = discountPercent; return this; }
        public Builder expedited(boolean expedited) { this.expedited = expedited; return this; }
        public Builder notes(String notes) { this.notes = notes; return this; }

        public Order build() { return new Order(this); }
    }
}
