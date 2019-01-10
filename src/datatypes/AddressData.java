package datatypes;

/**
 * Contains address informations about a holiday offer.
 * 
 * @author swe.uni-due.de
 *
 */
public class AddressData {

	private String street;
	private String town;
	private String postcode;

	public AddressData(String street, String town, String postcode) {
		this.street = street;
		this.town = town;
		this.postcode = postcode;
	}

	public String getStreet() {
		return street;
	}

	public String getTown() {
		return town;
	}

	public String getPostcode() {
		return postcode;
	}

}
