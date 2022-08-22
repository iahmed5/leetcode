package org.iahmed5.strings;

//1108. Defanging an IP Address
public class DefangingAnIPAddress {

    public static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        System.out.println(DefangingAnIPAddress.defangIPaddr("1.1.1.1"));

        //"1[.]1[.]1[.]1"
    }
}
