/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class VAuthorRecord extends org.jooq.impl.TableRecordImpl<org.jooq.util.maven.example.tables.records.VAuthorRecord> {

	private static final long serialVersionUID = -103758573;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.util.maven.example.tables.VAuthor.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.util.maven.example.tables.VAuthor.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setFirstName(java.lang.String value) {
		setValue(org.jooq.util.maven.example.tables.VAuthor.FIRST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getFirstName() {
		return getValue(org.jooq.util.maven.example.tables.VAuthor.FIRST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setLastName(java.lang.String value) {
		setValue(org.jooq.util.maven.example.tables.VAuthor.LAST_NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getLastName() {
		return getValue(org.jooq.util.maven.example.tables.VAuthor.LAST_NAME);
	}

	/**
	 * An uncommented item
	 */
	public void setDateOfBirth(java.sql.Date value) {
		setValue(org.jooq.util.maven.example.tables.VAuthor.DATE_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.sql.Date getDateOfBirth() {
		return getValue(org.jooq.util.maven.example.tables.VAuthor.DATE_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	public void setYearOfBirth(java.lang.Integer value) {
		setValue(org.jooq.util.maven.example.tables.VAuthor.YEAR_OF_BIRTH, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getYearOfBirth() {
		return getValue(org.jooq.util.maven.example.tables.VAuthor.YEAR_OF_BIRTH);
	}

	/**
	 * An uncommented item
	 */
	public void setAddress(org.jooq.util.maven.example.udt.records.UAddressTypeRecord value) {
		setValue(org.jooq.util.maven.example.tables.VAuthor.ADDRESS, value);
	}

	/**
	 * An uncommented item
	 */
	public org.jooq.util.maven.example.udt.records.UAddressTypeRecord getAddress() {
		return getValue(org.jooq.util.maven.example.tables.VAuthor.ADDRESS);
	}

	/**
	 * Create a detached VAuthorRecord
	 */
	public VAuthorRecord() {
		super(org.jooq.util.maven.example.tables.VAuthor.V_AUTHOR);
	}
}
