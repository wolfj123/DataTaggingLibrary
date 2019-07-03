/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.harvard.iq.datatags.parser.decisiongraph.ast;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author mor
 */
public class AggregateSlotValuePair extends SlotValuePair {
    
    final List<String> value;

    public AggregateSlotValuePair(List<String> slot, List<String> aValue) {
        super(slot);
        value = aValue;
    }

    public List<String> getValue() {
        return value;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String toString() {
        return "[" + getSlot() + "+=" + getValue() + "]";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + Objects.hashCode(this.value);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AggregateSlotValuePair other = (AggregateSlotValuePair) obj;
        return Objects.equals(this.value, other.value) && Objects.equals(getSlot(), other.getSlot());
    }
    
}
