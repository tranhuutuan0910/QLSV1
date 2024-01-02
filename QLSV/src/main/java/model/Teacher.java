package model;

import java.io.Serializable;

public class Teacher implements Serializable{
	 private int id;
	    private String name;
	    private String gender;
	    private String phoneNumber;
	    private String position;
	    private String email;
        private String photoPath;
	    // Getters and Setters

	    // Constructor
	    public Teacher(int id, String name, String gender, String phoneNumber, String position, String email) {
	        this.id = id;
	        this.name = name;
	        this.gender = gender;
	        this.phoneNumber = phoneNumber;
	        this.position = position;
	        this.email = email;
	    }

		public Teacher(int id, String name, String gender, String phoneNumber, String position, String email,
				String photoPath) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.phoneNumber = phoneNumber;
			this.position = position;
			this.email = email;
			this.photoPath = photoPath;
		}

		public Teacher(String name, String gender, String phoneNumber, String position, String email,
				String photoPath) {
			super();
	
			this.name = name;
			this.gender = gender;
			this.phoneNumber = phoneNumber;
			this.position = position;
			this.email = email;
			this.photoPath = photoPath;
		}

		public String getPhotoPath() {
			return photoPath;
		}

		public void setPhotoPath(String photoPath) {
			this.photoPath = photoPath;
		}

		public Teacher(String name, String gender, String phoneNumber, String position, String email) {
			super();
			this.name = name;
			this.gender = gender;
			this.phoneNumber = phoneNumber;
			this.position = position;
			this.email = email;
		}

		public Teacher() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
}
