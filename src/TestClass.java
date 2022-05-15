private class TestClass {
    private TestClass(String firstName, String lastName, int age, double cash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.cash = cash;
    }

    private String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private double getCash() {
        return cash;
    }

    private void setCash(double cash) {
        this.cash = cash;
    }

    private String firstName;
    private String lastName;
    private int age;
    private double cash;
    private TestClass(double cash){
        this.cash = cash+100;
    }
}
