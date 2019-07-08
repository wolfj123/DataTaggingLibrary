/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.harvard.iq.datatags.parser.decisiongraph.ast.booleanExpressions;

import edu.harvard.iq.datatags.model.graphs.nodes.booleanExpressions.BooleanExpression;
import edu.harvard.iq.datatags.model.values.CompoundValue;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author mor
 */
public class SmallerThanExpAst extends AtomicExpressionAst {
    
    private List<String> valueInSlot;
    private String value;

    public SmallerThanExpAst(List<String> valueInSlot, String value) {
        this.valueInSlot = valueInSlot;
        this.value = value;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.valueInSlot);
        hash = 47 * hash + Objects.hashCode(this.value);
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
        final SmallerThanExpAst other = (SmallerThanExpAst) obj;
        if (!Objects.equals(this.value, other.value)) {
            return false;
        }
        if (!Objects.equals(this.valueInSlot, other.valueInSlot)) {
            return false;
        }
        return true;
    }

    @Override
    public List<String> getValueInSlot() {
        return valueInSlot;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    BooleanExpression build() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getSlotType() {
        return "atomic";
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
    
}