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


    public IntellectualPropertyCase(String caseTitle, String description, String ipType){
        super(caseTitle, description,"Intellectual Property");
        this.ipType = ipType;
    }

    public String getIpType(){
    return ipType;
    }

    @Override
    public String toString(){
        return super.toSring() + "\nIp Type: " + ipType;
    }

}