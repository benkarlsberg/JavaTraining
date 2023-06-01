package projects.library;

class LibraryMember {
    private String name;
    private int id;
    private String contactDetails;

    public LibraryMember(String name, int id, String contactDetails) {
        this.name = name;
        this.id = id;
        this.contactDetails = contactDetails;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }
}
