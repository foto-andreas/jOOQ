/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.example.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = "http://jooq.sourceforge.net",
                            comments = "This class is generated by jOOQ")
public class TBookStoreRecord extends org.jooq.impl.UpdatableRecordImpl<org.jooq.util.maven.example.tables.records.TBookStoreRecord> {

	private static final long serialVersionUID = 691121099;

	/**
	 * An uncommented item
	 */
	public void setId(java.lang.Integer value) {
		setValue(org.jooq.util.maven.example.tables.TBookStore.ID, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.Integer getId() {
		return getValue(org.jooq.util.maven.example.tables.TBookStore.ID);
	}

	/**
	 * An uncommented item
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.util.maven.example.tables.TBookStore.NAME, value);
	}

	/**
	 * An uncommented item
	 */
	public java.lang.String getName() {
		return getValue(org.jooq.util.maven.example.tables.TBookStore.NAME);
	}

	/**
	 * An uncommented item
	 */
	public java.util.List<org.jooq.util.maven.example.tables.records.TBookToBookStoreRecord> fetchTBookToBookStoreList() throws java.sql.SQLException {
		return create()
			.selectFrom(org.jooq.util.maven.example.tables.TBookToBookStore.T_BOOK_TO_BOOK_STORE)
			.where(org.jooq.util.maven.example.tables.TBookToBookStore.BOOK_STORE_NAME.equal(getValue(org.jooq.util.maven.example.tables.TBookStore.NAME)))
			.fetch();
	}

	/**
	 * Create a detached TBookStoreRecord
	 */
	public TBookStoreRecord() {
		super(org.jooq.util.maven.example.tables.TBookStore.T_BOOK_STORE);
	}
}
