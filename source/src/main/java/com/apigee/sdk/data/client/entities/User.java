package com.apigee.sdk.data.client.entities;

import static com.apigee.sdk.data.client.utils.JsonUtils.getBooleanProperty;
import static com.apigee.sdk.data.client.utils.JsonUtils.setBooleanProperty;
import static com.apigee.sdk.data.client.utils.JsonUtils.setStringProperty;
import static com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion.NON_NULL;

import java.util.List;

import com.apigee.sdk.data.client.ApigeeDataClient;
import com.apigee.sdk.data.client.response.ApiResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * Models the 'user' entity as a local object.
 *
 * @see <a href="http://apigee.com/docs/app-services/content/user-management">User entity documentation</a>
 */
public class User extends Entity {

	public final static String ENTITY_TYPE = "user";

	public final static String PROPERTY_USERNAME   = "username";
	public final static String PROPERTY_EMAIL      = "email";
	public final static String PROPERTY_NAME       = "name";
	public final static String PROPERTY_FIRSTNAME  = "firstname";
	public final static String PROPERTY_MIDDLENAME = "middlename";
	public final static String PROPERTY_LASTNAME   = "lastname";
	public final static String PROPERTY_ACTIVATED  = "activated";
	public final static String PROPERTY_PICTURE    = "picture";
	public final static String PROPERTY_DISABLED   = "disabled";
	
	public static final String OLD_PASSWORD = "oldpassword";
	public static final String NEW_PASSWORD = "newpassword";

	/**
	 * Checks if the provided entity 'type' equals 'user'.
	 *
	 * @return Boolen true/false
	 */	
	public static boolean isSameType(String type) {
		return type.equals(ENTITY_TYPE);
	}

	/**
	 * Default constructor for the User object. Sets the 'type' property to 'user'.
	 */
	public User() {
		setType(ENTITY_TYPE);
	}
	
	/**
	 * Constructs the User object with a DataClient. 
	 * Sets the 'type' property to 'user'.
	 *
	 * @param  dataClient  an instance of the DataClient class
	 */
	public User(ApigeeDataClient dataClient) {
		super(dataClient);
		setType(ENTITY_TYPE);
	}

	/**
	 * Constructs the User object from an Entity object. Sets the 
	 * properties of the User identical to Entity, except the 'type' 
	 * property is set to 'user' no matter what the Entity type is.
	 *
	 * @param  entity  an Entity object
	 */
	public User(Entity entity) {
		super(entity.getDataClient());
		properties = entity.properties;
		setType(ENTITY_TYPE);
	}

	/**
	 * Returns the type property of the User object. Should always
	 * be 'user' 
	 *
	 * @return  the type property of the User object
	 */
	@Override
	@JsonIgnore
	public String getNativeType() {
		return ENTITY_TYPE;
	}

	/**
	 * Gets the properties already set in User and adds the following 
	 * user-specific properties: username, email. name, firstname,
	 * middlename, lastname, activated, picture, disabled.
	 *
	 * @return  a List object containing the properties of the User
	 */
	@Override
	@JsonIgnore
	public List<String> getPropertyNames() {
		List<String> properties = super.getPropertyNames();
		properties.add(PROPERTY_USERNAME);
		properties.add(PROPERTY_EMAIL);
		properties.add(PROPERTY_NAME);
		properties.add(PROPERTY_FIRSTNAME);
		properties.add(PROPERTY_MIDDLENAME);
		properties.add(PROPERTY_LASTNAME);
		properties.add(PROPERTY_ACTIVATED);
		properties.add(PROPERTY_PICTURE);
		properties.add(PROPERTY_DISABLED);
		return properties;
	}

	/**
	 * Returns the value of the 'username' property currently 
	 * set in the User object.
	 *
	 * @return  the value of the username property
	 */
	@JsonSerialize(include = NON_NULL)
	public String getUsername() {
		return getStringProperty(PROPERTY_USERNAME);
	}

	/**
	 * Sets the username property in the User object.	 
	 *
	 * @param  username  the username
	 */
	public void setUsername(String username) {
		setStringProperty(properties, PROPERTY_USERNAME, username);
	}

	/**
	 * Returns the value of the 'name' property currently set in 
	 * the User object.
	 *
	 * @return  the value of the name property
	 */
	@JsonSerialize(include = NON_NULL)
	public String getName() {
		return getStringProperty(PROPERTY_NAME);
	}

	/**
	 * Sets the value of the 'name' property in the User object.	 
	 *
	 * @param  name  the name of the entity
	 */
	public void setName(String name) {
		setStringProperty(properties, PROPERTY_NAME, name);
	}

	/**
	 * Returns the value of the 'email' property currently set in the User object.
	 *
	 * @return  the value of the email property
	 */
	@JsonSerialize(include = NON_NULL)
	public String getEmail() {
		return getStringProperty(PROPERTY_EMAIL);
	}

	/**
	 * Sets the value of the 'email' property in the User object.	 
	 *
	 * @param  email  the user's email address
	 */
	public void setEmail(String email) {
		setStringProperty(properties, PROPERTY_EMAIL, email);
	}

	/**
	 * Returns the value of the 'activated' property in the User object.
	 *
	 * @return  a Boolean true/false
	 */
	@JsonSerialize(include = NON_NULL)
	public Boolean isActivated() {
		return getBooleanProperty(properties, PROPERTY_ACTIVATED);
	}

	/**
	 * Sets the value of the 'activated' property in the User object.	 
	 *
	 * @param  activated  boolean whether the user is activated
	 */
	public void setActivated(Boolean activated) {
		setBooleanProperty(properties, PROPERTY_ACTIVATED, activated);
	}

	/**
	 * Returns the value of the 'disabled' property in the User object.
	 *
	 * @return  a Boolean true/false
	 */
	@JsonSerialize(include = NON_NULL)
	public Boolean isDisabled() {
		return getBooleanProperty(properties, PROPERTY_DISABLED);
	}

	/**
	 * Sets the value of the 'disabled' property in the User object.	 
	 *
	 * @param  disabled  Boolean true/false
	 */
	public void setDisabled(Boolean disabled) {
		setBooleanProperty(properties, PROPERTY_DISABLED, disabled);
	}

	/**
	 * Returns the value of the 'firstname' property in the User object.
	 *
	 * @return  the user's first name
	 */
	@JsonSerialize(include = NON_NULL)
	public String getFirstname() {
		return getStringProperty(PROPERTY_FIRSTNAME);
	}

	/**
	 * Sets the value of the 'firstname' property in the User object.	 
	 *
	 * @param  firstname  the user's first name
	 */
	public void setFirstname(String firstname) {
		setStringProperty(properties, PROPERTY_FIRSTNAME, firstname);
	}

	/**
	 * Returns the value of the 'middlename' property in the User object.
	 *
	 * @return  the user's middle name
	 */
	@JsonSerialize(include = NON_NULL)
	public String getMiddlename() {
		return getStringProperty(PROPERTY_MIDDLENAME);
	}

	/**
	 * Sets the value of the 'middlename' property in the User object.	 
	 *
	 * @param  middlename  the user's middle name
	 */
	public void setMiddlename(String middlename) {
		setStringProperty(properties, PROPERTY_MIDDLENAME, middlename);
	}

	/**
	 * Returns the value of the 'lastname' property in the User object.
	 *
	 * @return  the user's last name
	 */
	@JsonSerialize(include = NON_NULL)
	public String getLastname() {
		return getStringProperty(PROPERTY_LASTNAME);
	}

	/**
	 * Sets the value of the 'lastname' property in the User object.	 
	 *
	 * @param  lastname  the user's last name
	 */
	public void setLastname(String lastname) {
		setStringProperty(properties, PROPERTY_LASTNAME, lastname);
	}

	/**
	 * Returns the value of the 'picture' property in the User object.
	 *
	 * @return  the URL of the user's picture
	 */
	@JsonSerialize(include = NON_NULL)
	public String getPicture() {
		return getStringProperty(PROPERTY_PICTURE);
	}

	/**
	 * Sets the value of the 'picture' property in the User object.	 
	 *
	 * @param  picture  the URL of the user's picture
	 */
	public void setPicture(String picture) {
		setStringProperty(properties, PROPERTY_PICTURE, picture);
	}
	
	/**
	 * Saves the current state of the User object on the server. Any property
	 * conflicts will overwrite what is on the server.
	 *
	 * @return  an ApiResponse object
	 */
	public ApiResponse save() {
		ApiResponse response = super.save();
		return response;
	}

}
