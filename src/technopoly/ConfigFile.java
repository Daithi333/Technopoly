/**
 * 
 */
package technopoly;

/**
 * Store file names, for a bit of experimentation..
 * @author Daithi
 *
 */
public enum ConfigFile {
	
	CONFIG_FILE("config.properties"), BACKUP_FILE("backupconfig.properties"), CONFIG2_FILE("config2.properties");
	
	private String customName;
	
	/**
	 * 
	 * @param fieldname
	 */
	private ConfigFile(String customName) {
		this.customName = customName;
	}
	
	/**
	 * @return the customName
	 */
	public String getCustomName() {
		return this.customName;
	}	

}
