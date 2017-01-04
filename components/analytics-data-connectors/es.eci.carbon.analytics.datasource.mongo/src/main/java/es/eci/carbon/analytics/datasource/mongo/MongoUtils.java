package es.eci.carbon.analytics.datasource.mongo;

import java.util.Map;

import org.wso2.carbon.analytics.datasource.commons.exception.AnalyticsException;

public class MongoUtils {

	public static String extractDataSourceName(Map<String, String> properties) throws AnalyticsException {
		String dsName = properties.get(MongoConstants.DATASOURCE_NAME);
		if (dsName == null) {
			throw new AnalyticsException(
					"The Mongo connector property '" + MongoConstants.DATASOURCE_NAME + "' is mandatory");
		}
		return dsName;
	}

	public static String extractARSDatabaseName(Map<String, String> properties) {
		String ks = properties.get(MongoConstants.DATABASE);
		if (ks == null) {
			ks = MongoConstants.DEFAULT_ARS_DB_NAME;
		}
		return ks;
	}

}
