class Address {

    int pin;
    String state;
    String district;

    public Address(int pin, String state, String district){
        this.pin = pin;
        this.state = state;
        this.district = district;
        }
    }

class Customer {

    int customerID;
    String name;
    Address address;

    Customer(int customerID, String name, Address address){
        this.customerID = customerID;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("Customer name: "+name+"\nCustomer ID :"+ customerID);
        System.out.println("\n"+address.pin+"\n"+address.state+"\n"+address.district);
    }
}

class iron {
    public static void main(String []args){
        Address ad1 = new Address(226001, "Uttar Pradesh", "LKO");
        Customer ct1 = new Customer(12334, "Jack", ad1);
        ct1.display();
    }
}