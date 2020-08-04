//package com.designpattern;
//
//public class DefaultPerson implements Person {
//    // Required parameters
//    private final String firstName;
//    private final String lastName;
//
//    // Optional parameters
//    protected String phoneNumber;
//    protected String address;
//    protected int age;
//
//    public DefaultPerson(String firstName, String lastName) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//    }
//
//    protected DefaultPerson(Builder builder) {
//        this(builder.getFirstName(), builder.getLastName());
//        this.phoneNumber = phoneNumber;
//        this.address = address;
//        this.age = age;
//    }
//
//    @Override
//    public String getFirstName() {
//        return firstName;
//    }
//
//    @Override
//    public String getLastName() {
//        return lastName;
//    }
//
//    @Override
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    @Override
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    @Override
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    // inner class
//    class Builder extends DefaultPerson {
//
//        public Builder(String firstName, String lastName) {
//            super(firstName, lastName);
//        }
//
//        public Builder phoneNumber(String phoneNumber) {
//            this.phoneNumber = phoneNumber;
//            return this;
//        }
//
//        public Builder address(String address) {
//            this.address = address;
//            return this;
//        }
//
//        public Builder age(int age) {
//            this.age = age;
//            return this;
//        }
//
//        public Person build(){
//            return new DefaultPerson(this);
//        }
//    }
//}
