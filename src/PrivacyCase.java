/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 350309527
 */
public class PrivacyCase extends EthicsCase {
    private String dataType;

    public PrivacyCase(String title, String description, String category, String dataType) {
        super(title, description, category);
        this.dataType = dataType;
    }

    public String getDataType() { return dataType; }

    @Override
    public String toString() {
        return super.toString() + "\nData Type: " + dataType;
    }
}
