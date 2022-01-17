package matmon.work.object.test;

public class person {
    private ID id;
    private String firstName;
    private String lastName;
    private address address;

    public person(ID id, String firstName, String lastName, matmon.work.object.test.address address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    @Override
    public String toString() {
        return "person{" +
                "id=" + id.toString() +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address.toString() +
                '}';
    }
}
