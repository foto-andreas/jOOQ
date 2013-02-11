/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
public class TExoticTypesRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.test.postgres.generatedclasses.tables.records.TExoticTypesRecord> implements org.jooq.Record2<java.lang.Integer, java.util.UUID> {

	private static final long serialVersionUID = -1404228813;

	/**
	 * Setter for <code>public.t_exotic_types.id</code>. 
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.ID, value);
	}

	/**
	 * Getter for <code>public.t_exotic_types.id</code>. 
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.ID);
	}

	/**
	 * Setter for <code>public.t_exotic_types.uu</code>. 
	 */
	public void setUu(java.util.UUID value) {
		setValue(org.jooq.test.postgres.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.UU, value);
	}

	/**
	 * Getter for <code>public.t_exotic_types.uu</code>. 
	 */
	public java.util.UUID getUu() {
		return getValue(org.jooq.test.postgres.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.UU);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record2 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.util.UUID> fieldsRow() {
		return org.jooq.impl.Factory.row(field1(), field2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row2<java.lang.Integer, java.util.UUID> valuesRow() {
		return org.jooq.impl.Factory.row(value1(), value2());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return org.jooq.test.postgres.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.util.UUID> field2() {
		return org.jooq.test.postgres.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES.UU;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.UUID value2() {
		return getUu();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached TExoticTypesRecord
	 */
	public TExoticTypesRecord() {
		super(org.jooq.test.postgres.generatedclasses.tables.TExoticTypes.T_EXOTIC_TYPES);
	}
}