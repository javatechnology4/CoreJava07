package com.spring.hibernate;

import org.hibernate.cfg.NamingStrategy;
import org.hibernate.util.StringHelper;

public class CENamingStrategy implements NamingStrategy {

	@Override
	public String classToTableName(String className) {
		// TODO Auto-generated method stub
		return tableName(StringHelper.unqualify(className).toUpperCase());
	}

	@Override
	public String propertyToColumnName(String propertyName) {
		// TODO Auto-generated method stub
		return propertyName.toUpperCase();
	}

	@Override
	public String tableName(String tableName) {
		// TODO Auto-generated method stub
		return "CE_" + tableName;
	}

	@Override
	public String columnName(String columnName) {
		// TODO Auto-generated method stub
		return columnName;
	}

	public String propertyToTableName(String className, String propertyName) {
		return classToTableName(className) + "_" + propertyToColumnName(propertyName);
	}

	@Override
	public String collectionTableName(String ownerEntity, String ownerEntityTable, String associatedEntity,
			String associatedEntityTable, String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String joinKeyColumnName(String joinedColumn, String joinedTable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String foreignKeyColumnName(String propertyName, String propertyEntityName, String propertyTableName,
			String referencedColumnName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logicalColumnName(String columnName, String propertyName) {
		// TODO Auto-generated method stub
		return columnName;
	}

	@Override
	public String logicalCollectionTableName(String tableName, String ownerEntityTable, String associatedEntityTable,
			String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String logicalCollectionColumnName(String columnName, String propertyName, String referencedColumn) {
		// TODO Auto-generated method stub
		return null;
	}

}
