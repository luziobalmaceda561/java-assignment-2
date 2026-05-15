/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 350309527
 */
public class IntellectualPropertyCase extends EthicsCase {
private String ipType;

public IntellectualPropertyCase(String title, String description, String category, String ipType) {
super(title, description, category);
this.ipType = ipType;
}

public String getIP() { return ipType; }

@Override
public String toString() {
return super.toString() + "\nIP Type: " + ipType;
}
}