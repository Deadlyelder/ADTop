package lu.itrust.adtop.tools.API;
/**
 * @author eomar
 *
 */
public class ApiNamable extends ApiTrickObject {
	
	private String name;
	
	/**
	 * 
	 */
	public ApiNamable() {
	}

	/**
	 * @param name
	 */
	public ApiNamable(Object id, String name) {
		super(id);
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	

}
