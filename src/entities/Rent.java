package entities;

public class Rent {
    private final String name;
    private final String email;

    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", " + email;
    }
}
