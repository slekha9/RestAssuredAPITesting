package rest.api.test.SPA_MotionANGEL.requestpojo;


	import com.google.gson.annotations.Expose;
	import com.google.gson.annotations.SerializedName;

	public class Registration {

	@SerializedName("name")
	@Expose
	private String name;
	@SerializedName("countrycode")
	@Expose
	private String countrycode;
	@SerializedName("phoneno")
	@Expose
	private String phoneno;
	@SerializedName("timezone")
	@Expose
	private String timezone;
	@SerializedName("address")
	@Expose
	private String address;
	@SerializedName("latitude")
	@Expose
	private String latitude;
	@SerializedName("longitude")
	@Expose
	private String longitude;

	public String getName() {
	return name;
	}

	public void setName(String name) {
	this.name = name;
	}

	public String getCountrycode() {
	return countrycode;
	}

	public void setCountrycode(String countrycode) {
	this.countrycode = countrycode;
	}

	public String getPhoneno() {
	return phoneno;
	}

	public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
	}

	public String getTimezone() {
	return timezone;
	}

	public void setTimezone(String timezone) {
	this.timezone = timezone;
	}

	public String getAddress() {
	return address;
	}

	public void setAddress(String address) {
	this.address = address;
	}

	public String getLatitude() {
	return latitude;
	}

	public void setLatitude(String latitude) {
	this.latitude = latitude;
	}

	public String getLongitude() {
	return longitude;
	}

	public void setLongitude(String longitude) {
	this.longitude = longitude;
	}

	}
	


