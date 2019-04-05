public class Person {
    private String name;
    private String number;
    
    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }
    
    public void changeNumber(String newNumber) {
        this.number = newNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public String getNumber() {
        return number;
    }
    
    public String toString() {
        return this.getName() + "  number: " + this.getNumber();
    }
}
