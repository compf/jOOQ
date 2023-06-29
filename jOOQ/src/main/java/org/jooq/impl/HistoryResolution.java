/*
 * This file is generated by jOOQ.
 */
package org.jooq.impl;


import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum HistoryResolution implements EnumType {

    OPEN("OPEN"),

    RESOLVED("RESOLVED"),

    IGNORED("IGNORED");

    private final String literal;

    private HistoryResolution(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return null;
    }

    @Override
    public Schema getSchema() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Lookup a value of this EnumType by its literal. Returns
     * <code>null</code>, if no such value could be found, see {@link
     * EnumType#lookupLiteral(Class, String)}.
     */
    public static HistoryResolution lookupLiteral(String literal) {
        return EnumType.lookupLiteral(HistoryResolution.class, literal);
    }
}
